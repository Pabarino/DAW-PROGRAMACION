import java.util.Scanner;

public class Ejercicio38 { 
  
  public static void main (String args []) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduzca la altura del reloj de arena.");
    System.out.print("Altura: ");
    int alturaIntroducida = s.nextInt();
    
    int asteriscos = alturaIntroducida;
    int altura = 1;
    int espaciosPorDelante = 0;
    
    if ((alturaIntroducida < 3) || (alturaIntroducida%2 == 0)) {
      System.out.print("Datos incorrectos. Debe introducir un altura impar mayor o igual a 3");
    }
    
    else { 
      
      System.out.println();
      
      //parte de arriba
      while (altura < (alturaIntroducida/2) + 1) {
        
        //inserta espacios delante
        for (int i = 1; i <= espaciosPorDelante; i++) {
          System.out.print(" ");
        }
        
        //pinta la linea
        for (int i = 0; i < asteriscos; i++) {
          System.out.print("*");
        }
        
        System.out.println();
        altura++;
        espaciosPorDelante++;
        asteriscos -= 2;
      } //while parte de arriba
      
      //parte de abajo
      espaciosPorDelante = alturaIntroducida / 2;
      altura = 1;
      
      while (altura <= (alturaIntroducida/2) + 1) {
        
        //inserta espacios delante
        for (int i = 1; i <= espaciosPorDelante; i++) {
          System.out.print(" ");
        }
        
        //pinta de linea
        for (int i = 0; i < asteriscos; i++) {
          System.out.print("*");
        }
        
        System.out.println();
        altura++;
        espaciosPorDelante--;
        asteriscos += 2;
      } //while parte de abajo
    }  //else
  }
}
