import java.util.Scanner;

public class Ejercicio06 {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    System.out.println("Adivina un numero entre 0 y 100");
    
    int N = (int)(Math.random()*100) + 1;
    int oportunidades = 5;
    
    do {
      
      System.out.print("\nNumero:");
      int num = s.nextInt();
      
      if (num == N) {
        System.out.println("Enhorabuena, has adivinado el numero!");
      }
      
      oportunidades --;
      
      System.out.println("Te quedan "+ oportunidades +" intentos.");
      
    } while (oportunidades > 0);
    
    System.out.println("\nNo has sido capaz de adivinarlo, mas suerte la proxima vez");
  }
}
