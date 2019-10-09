import java.util.Scanner;

public class Ejercicio52 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca un numero.");
    System.out.print("Numero: ");
    int entero = s.nextInt();
    
    int num = entero;
    int volteado = 0;
    int numeroFinal = 0;
    
    
    do {
      
      volteado = ((volteado * 10) + (num % 10));
      num /= 10;
      
    } while (num > 0);
    
    numeroFinal = volteado % 10;
    int volteado1 = volteado / 10;
    volteado = 0;
    
    do {
      
      volteado = ((volteado * 10) + (volteado1 % 10));
      volteado1 /= 10;
      
    } while ( volteado1 > 0);
    
    System.out.println("\nEl numero resultado es "+ ((volteado * 10)+ numeroFinal));
  }
}
    
