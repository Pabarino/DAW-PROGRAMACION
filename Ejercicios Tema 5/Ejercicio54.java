import java.util.Scanner;

public class Ejercicio54 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca la altura de la figura.");
    System.out.print("Altura: ");
    int altura = s.nextInt();
    
    int length = altura;
    
    System.out.println();
    
    for (int i = 0; i < length; i++) {
        System.out.print("*");
    }
    
     System.out.println();
    
    for (int x = 0; x < altura-1; x++) {
      System.out.print("*");
      
      for (int i = 0; i < length-3; i++) {
        System.out.print(" ");
      }
    
      if (x < altura-2) {
        System.out.print("*");
      }
      
      System.out.println();
      length--;
    }
  }
}
