import java.util.Scanner;

public class Ejercicio59 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduzca la altura del arbol.");
    System.out.print("Altura (mayor o igual a 4): ");
    int altura = s.nextInt();
    
    int base = (((altura-2) * 2) - 1);
    int estrella =(base / 2);
    int espacio = 0;
    int izquierda = estrella;
    int n = 0;
    
    System.out.println();
    
    //hacemos el hueco para la estrella//
    for (int i = 0; i < estrella; i++) {
      System.out.print(" ");
    }
    
    //colocamos la estrella//
    System.out.print("*");
    System.out.println();
    
    //creamos el triangulo//
    for (int i = 0; i < altura-3; i++) {
      
      for (int x = 0; x < izquierda; x++) {
      System.out.print(" ");
      }
    
      System.out.print("^");
      
      if ( n != 0) {
      
        for (int x = 1; x < espacio; x++) {
          System.out.print(" ");
        }
      
        System.out.print("^");
      }
        
      espacio+= 2;
      izquierda--;  
      n++;
    
      System.out.println();
    
    }
    
    //creamos la base//
    for (int i = 0; i < base; i++) {
      System.out.print("^");
    }
    
    System.out.println();
    
    //y finalmente introducimos el tronco del arbol//
    for (int i = 0; i < estrella; i++) {
      System.out.print(" ");
    }
    
    System.out.print("Y");

  }
}
