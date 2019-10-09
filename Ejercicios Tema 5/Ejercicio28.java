import java.util.Scanner;

public class Ejercicio28 {
  
  public static void main (String args []) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce un numero entero por teclado.");
    System.out.print("Numero entero: ");
    int num = s.nextInt();
    
    int factorial = 1;
    
    for ( int i = 1; i <= num; i++) {
      factorial = factorial * i;
    }
    
    System.out.println(num +"! = "+ factorial);
    
    
  }
}
