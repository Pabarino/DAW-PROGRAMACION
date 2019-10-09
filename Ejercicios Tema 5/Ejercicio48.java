import java.util.Scanner;

public class Ejercicio48 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduzca un numero entero.");
    System.out.print("Entero: ");
    long numero = s.nextLong();
    
    long num;
    boolean encontrado;
    
    System.out.print("Digitos que aparecen en el numero: ");
    
    for (int i = 0; i < 10; i++) {
      //Comprueba si i esta en el numero
      encontrado = false;
      num = numero;
      
      while (num > 0) {
        if (num % 10 == i) {
          encontrado = true;
        }
        num /= 10;
      }
      
      if (encontrado) {
        System.out.print (i +" ");
      }
    }
    
    System.out.print ("\nDigitos que no aparecen: ");
    
    for (int i = 0; i < 10; i++) {
      //Comprueba si i esta en el numero
      encontrado = false;
      num = numero;
      
      while (num > 0) {
        if (num % 10 == i) {
          encontrado = true;
        }
        num /= 10;
      }
      if (!encontrado) {
        System.out.print(i +" ");
      }
    }
  }
}
