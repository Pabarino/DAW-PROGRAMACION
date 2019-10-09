import java.util.Scanner;

public class Ejercicio58 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduzca un numero.");
    System.out.print("Numero: ");
    int entero = s.nextInt();
    
    double longitud = 0;
    int num = entero;
    double media = 0;
    int mod = 0;
    double suma = 0;
    
    do {
      
      mod = num % 10;
      longitud++;
      suma += mod;
      num /= 10;
      
    } while (num > 0);
    
    media = suma / longitud;
    
    System.out.println("\nLa media de sus digitos es "+ media);
  }
}
      
    
