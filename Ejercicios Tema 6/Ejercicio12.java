import java.util.Scanner;

public class Ejercicio12 {
  
  public static void main (String args []) 
  throws InterruptedException {
    Scanner s= new Scanner(System.in);
    
    int linea = 0;
    
    System.out.print("\033[32m");
    
    for (int i = 0; i < 90000; i++) {
      System.out.print((char)(Math.random()*(126-32+1) + 32));
      
      if (linea++ == 79) {
        linea = 0;
        Thread.sleep(50);
        System.out.println();
      }
    }
  }
}
