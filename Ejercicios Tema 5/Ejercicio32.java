import java.util.Scanner;

public class Ejercicio32 {
  
  public static void main (String args []) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduzca un numero entero positivo.");
    System.out.print("Numero: ");
    long num = s.nextLong();
    
    long resto;
    int suma = 0;
    
    System.out.print("Digitos pares: ");
    
    do {
       
      resto = num%10;
      
      if (resto%2 == 0) {
        System.out.print(resto +" ");
        suma += resto;
      }
      num = num/10;
      
    } while ( num != 0);
    
    System.out.println("\nLa suma de los digitos pares es: "+ suma);
    
  }
}
    
    
        
    
