import java.util.Scanner;

public class Ejercicio33 {
  
  public static void main (String args []) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduce la altura de la U.");
    System.out.print("Altura: ");
    int altura = s.nextInt();
    
    System.out.println();
    int base = altura-2;
    
    
    for ( int i = 1; i < altura; i++) {
      System.out.print("*");
      
      for (int b = 0; b < (base); b++) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
    
    System.out.print(" ");
    
    for (int i = 0; i < base; i++) {
      System.out.print("*");
    }
    
  }
}
