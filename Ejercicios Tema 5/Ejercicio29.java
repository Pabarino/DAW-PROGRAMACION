import java.util.Scanner;

public class Ejercicio29 {
  
  public static void main (String args []) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduce un numero entero por teclado.");
    System.out.print("Numero: ");
    int num1 = s.nextInt();
     System.out.println("Introduce un segundo numero entero por teclado.");
    System.out.print("Numero: ");
    int num2 = s.nextInt();
    
    System.out.println("Los numeros menores que "+ num1 +" y que no sean divisibles por "+ num2 +" son los siguientes: \n");
    
    for ( int i = 1; i <= num1; i++) {
      
      if ( i%num2 == 0) {
      }
      else {
        System.out.print(i +" ");
      
      }
    }
  }
}

    
