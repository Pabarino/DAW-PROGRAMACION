import java.util.Scanner;

public class Ejercicio50 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca la altura de los numeros.");
    System.out.print("Altura (5 como minimo): ");
    int altura = s.nextInt();
    System.out.println("Introduzca el numero de espacios entre los numeros.");
    System.out.print("Espacios (1 como minimo): ");
    int espacios = s.nextInt();
    
    System.out.println();
    
    if ((altura >= 5) && (espacios >= 1)) {
      
      //primera linea
      System.out.print("*");

      for (int i = 0; i < espacios; i++) {
        System.out.print (" ");
      }
      
      System.out.print("****");
      
      for (int i = 0; i < espacios; i++) {
        System.out.print (" ");
      }
      
      System.out.println("****");
      
      //segunda linea
      System.out.print("*");
      
      for (int i = 0; i < espacios; i++) {
        System.out.print (" ");
      }
      
      System.out.print("*   ");
      
      for (int i = 0; i < espacios; i++) {
        System.out.print (" ");
      }
      
      System.out.println("*   ");
      
      //tercera linea
      System.out.print("*");

      for (int i = 0; i < espacios; i++) {
        System.out.print (" ");
      }
      
      System.out.print("****");
      
      for (int i = 0; i < espacios; i++) {
        System.out.print (" ");
      }
      
      System.out.println("****");
      
      //cuarta linea
      do {
      
        System.out.print("*");
      
        for (int i = 0; i < espacios; i++) {
        System.out.print (" ");
        }
      
        System.out.print("   *");
      
        for (int i = 0; i < espacios; i++) {
          System.out.print (" ");
        }
      
        System.out.println("   *");
        
        altura--;
      
      } while ((altura - 4) > 0);
      
      //quinta linea
      System.out.print("*");

      for (int i = 0; i < espacios; i++) {
        System.out.print (" ");
      }
      
      System.out.print("****");
      
      for (int i = 0; i < espacios; i++) {
        System.out.print (" ");
      }
      
      System.out.println("****");

    }
    
    else {
      System.out.println("Los valores introducidos no son validos.");
    }
  }
}
    
