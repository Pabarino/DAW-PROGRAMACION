import java.util.Scanner;

public class Ejercicio43 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduzca un numero entero positivo.");
    System.out.print("Numero: ");
    long entero = s.nextLong();
    System.out.println("\nIntroduzca la posicion a partir de la cual quiere partir el numero.");
    System.out.print("Posicion: ");
    long posicion = s.nextLong();
    
    long num = entero;
    int longitud = 0;
    
    do {
      
      num /= 10;
      longitud ++;   
      
    } while (num > 0);
      
    long parteIzquierda = entero / (long)(Math.pow(10, longitud - posicion +1));
    
    long parteDerecha = entero % (long)(Math.pow(10, longitud - posicion +1));
    
    System.out.print("Los numeros partidos son el "+ parteIzquierda +" y el "+ parteDerecha +".");

  }
}

