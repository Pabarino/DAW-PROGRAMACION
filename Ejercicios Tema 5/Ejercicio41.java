import java.util.Scanner;

public class Ejercicio41 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduzca un numero entero.");
    System.out.print("Numero: ");
    long num = s.nextLong();
    
    long valor = num;
    long mod;
    long par = 0;
    long impar = 0;
    long numero = 0;
    
    do {
      
      mod = num%10;
      numero = mod%2;
      
      if (numero == 0) {
        par++;
      }
      
      else {
        impar++;
      }
      
      num = num/10;
      
    } while ( num != 0 );
    
    System.out.println("El numero "+ valor +" contiene "+ par +" digitos pares y "+ impar +" digitos impares.");
  }
}
        
      
    
    
