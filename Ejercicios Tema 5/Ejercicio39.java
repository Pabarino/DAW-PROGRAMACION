import java.util.Scanner;

public class Ejercicio39 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
  
    System.out.println("\nIntroduce un numero entero: ");
    System.out.print("Numero: ");
    long num = s.nextLong();
    
    long factorial = 1;
    
    System.out.println();
    
    for ( long i = 1; i <= num; i++) {
      
      factorial = factorial * i;
      System.out.println(i + "! = "+ factorial);
    }
  }
}
