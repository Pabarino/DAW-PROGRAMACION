import java.util.Scanner;

public class Ejercicio31 {
  
  public static void main (String args []) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduce la altura de la L.");
    System.out.print("Altura: ");
    int altura = s.nextInt();
    
    System.out.println();
    
    for ( int i = 1; i < altura; i++) {
      System.out.println("*");
    }
    
    int base = altura/2 + 1;
    
    for (int i = 0; i < base; i++) {
      System.out.print("* ");
    }
    
  }
}
    
    
       

     
     
