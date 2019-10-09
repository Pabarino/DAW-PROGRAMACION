import java.util.Scanner;

public class Ejercicio60 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduzca la altura de los calcetines.");
    System.out.print("Altura (mayor o igual a 4): ");
    int altura = s.nextInt();
    
    int anchura = 3;
    int base = 6;
    int manga = altura-2;
    
    System.out.println();
    
    for (int i = 0; i < manga; i++) {
      
      for (int x = 0; x < anchura; x++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
    for (int i  = 0; i < 2; i++) {
      
      for (int x = 0; x < base; x++) {
        System.out.print("*");
      }
      System.out.println();
    } 
  }
}
