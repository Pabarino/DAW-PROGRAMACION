import java.util.Scanner;

public class Ejercicio68 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("\nIntroduzca un numero. ");
    System.out.print("\nNumero: ");
    long numero = s.nextLong();
    
    long num = numero;
    long mod = 0;
    long inverted = 0;
    
    do {
      
      mod = (num % 10);
      
      if (mod % 2 == 0) {
        
        inverted = ((inverted * 10) + (mod + 1));
      }
      
      else { 
        
        inverted = ((inverted * 10) + (mod - 1));
      }
      
      num /= 10;
      
    } while (num > 0);
    
    num = inverted;
    inverted = 0;
    
    do {
      
      mod = num % 10;
      inverted = (inverted * 10) + mod;
      num /= 10;
      
    } while (num > 0);
    
    System.out.println("\nDislocando el "+ numero +" sale el "+ inverted);
  }
}
