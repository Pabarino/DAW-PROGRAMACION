import java.util.Scanner;

public class Ejercicio56 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca la altura de la figura.");
    System.out.print("Altura: ");
    int altura = s.nextInt();
    
    int length = altura;
    int spaces = 0;
    
    System.out.println();
    
    for (int x = 0; x < altura; x++) {
      
      for (int i = 0; i < spaces; i++) {
        System.out.print(" ");
      }
      
      for (int i = 0; i < length; i++) {
        System.out.print("*");
      }
      
      length--;
      spaces++;
      System.out.println();
    }
  }
}

    
