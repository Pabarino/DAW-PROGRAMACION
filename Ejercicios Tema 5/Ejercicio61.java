import java.util.Scanner;

public class Ejercicio61 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduzca la altura de la V.");
    System.out.print("Altura (mayor o igual a 3): ");
    int altura = s.nextInt();
    
    int ancho = 3;
    int espacios = (altura *2)-2;
    int izquierda = 0;
    int base = 6;
    
    System.out.println();
    
    if (altura >= 3) {
      
      //laterales de la V//
      for (int x = 0; x < altura-1; x++) {
        
        for (int i = 0; i < izquierda; i++) {
          System.out.print(" ");
        }
      
        for (int i = 0; i < ancho; i++) {
          System.out.print("*");
        }
      
        for (int i = 0; i < espacios; i++) {
          System.out.print(" ");
        }     
      
        for (int i = 0; i < ancho; i++) {
          System.out.print("*");
        }
        izquierda ++;
        espacios -= 2;
        System.out.println();
      }
      
      //base de la V//
      for (int i = 0; i < izquierda; i++) {
          System.out.print(" ");
        }     
      
      for (int i = 0; i < base; i++) {
          System.out.print("*");
      }       
    }
    
    else {
      System.out.println("La altura minima es de 3 pisos.");
    }
  }
}
