import java.util.Scanner;

public class Ejercicio55 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca un numero.");
    System.out.print("Numero: ");
    int entero = s.nextInt();
    
    int num = entero;
    int resto = num /10 ;
    int numeroFinal = entero % 10;
    int longitud = 0;

    
    do {

      longitud++;
      num /= 10;
      
    } while (num > 0);
    
    
    System.out.println("\nEl numero resultado es: "+ (int)((Math.pow(10, longitud-1) * numeroFinal) + resto));
  }
}
    
