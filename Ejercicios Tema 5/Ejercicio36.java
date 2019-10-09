import java.util.Scanner;

public class Ejercicio36 { 
  
  public static void main (String args []) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduzca un numero entero positivo.");
    System.out.print("Numero: ");
    long num = s.nextLong();
    
    long numero = num;
    long mod;
    long numeroInvert = 0;
    
    do {
      
      mod = numero%10;
      numeroInvert = (numeroInvert*10) + mod;
      numero = numero/10;
      
    } while ( numero != 0 );
    
    if (numeroInvert == num) {
      System.out.println("El numero "+ num +" es capicua.");
    }
    
    else {
      System.out.println("El numero "+ num +" no es capicua.");
    }
  }
}
      
    
      
    
    
