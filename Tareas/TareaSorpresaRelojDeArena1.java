import java.util.Scanner;

public class TareaSorpresaRelojDeArena1{
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    boolean alt = false;
    boolean incr = false;
    int altura = 0;
    int incremento = 0;
    
    //nos aseguramos de que es impar mayor o igual a 3//
    while ((!alt) && (altura < 3)) {
      
      System.out.print("\nIntroduzca la altura inicial (impar mayor o igual a 3): ");
      altura = s.nextInt();
    
      if (altura % 2 == 1) {
        
        alt = true;
        
      }
      
      else {
        
        System.out.println("No es valido; debe ser impar y mayor o igual a 3.");
      
      }
      
    }
    
    //guardamos el caracter para imprimir//
    System.out.print("\nIntroduzca el caracter para dibujar: ");
    char c = s.next().charAt(0);
    
    //nos aseguramos de que es par//
    while (!incr) {
      
      System.out.print("\nIntroduzca el incremento en la altura (par): ");
      incremento = s.nextInt();
      
      if (incremento % 2 == 0) {
        
        incr = true;
        
      }
      
      else {
        
        System.out.println("No es valido; debe ser par.");
      
      }
      
    }
    
    //guardamos la veces que se quiere dibujar la figura//
    System.out.print("\nIntroduzca el numero de veces que desea dibujar el reloj: ");
    int repeticiones = s.nextInt();
    
    int izquierda = 0;
    int relleno = 0;
    int base = 0;
    
    System.out.println();
    
    //lo repetimos las veces necesarias//
    while (repeticiones > 0) {
    
      relleno = altura;
      base = altura;
      izquierda = 0;
      
      //parte de arriba//
      for (int x = 0; x < ((altura / 2) + 1); x++) {
        
        for (int i = 0; i < izquierda; i++) {
          System.out.print(" ");
        }
        
        for (int i = 0; i < relleno; i++) {
          System.out.print(c);
        }
        
        System.out.println();
        izquierda ++;
        relleno -= 2;
        
      }
      
      //parte de abajo//
      for (int x = 0; x < altura / 2; x++) {
        
        for (int i = 0; i < izquierda -2; i++) {
          System.out.print(" ");
        }
        
        for (int i = 0; i < relleno + 4; i++) {
          System.out.print(c);
        }
        
        System.out.println();
        izquierda --;
        relleno += 2;
      }
      
      System.out.println();
      repeticiones --;
      altura += incremento;
    } 
  }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
