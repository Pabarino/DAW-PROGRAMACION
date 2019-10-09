import java.util.Scanner;

public class Ejercicio53 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca la altura de la figura.");
    System.out.print("Altura: ");
    int altura = s.nextInt();
    
    int length = altura;
    
    System.out.println();
    
    for (int x = 0; x < altura; x++) {
      
      for (int i = 0; i < length; i++) {
        System.out.print("*");
      }
      length--;
      System.out.println();
    }
  }
}
