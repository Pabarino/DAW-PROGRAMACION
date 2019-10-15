import java.util.Scanner;

public class Ejercicio13 {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    int dado1 = 0;
    int dado2 = 1;
    int equal = 1;
    int tiradas = 0;
    
    do {
    
      dado1 = (int)(Math.random()*6) + 1;
      dado2 = (int)(Math.random()*6) + 1;
      
      System.out.println("\nDado1: "+ dado1);
      System.out.println("Dado2: "+ dado2);
      
      tiradas ++;
      equal = dado1 - dado2;
      
    
    } while (equal != 0) ;
    
    System.out.println("\nDespues de "+ tiradas +" tiradas los resultados son el mismo.");
    
  }
}
    
    
    
