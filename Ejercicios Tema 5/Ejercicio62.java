import java.util.Scanner;

public class Ejercicio62 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduzca un numero.");
    System.out.print("Numero: ");
    int numero = s.nextInt();
    
    int num = numero;
    int mod = 0;
    int fortuna = 0;
    int malaSuerte = 0;
    
    do {
      
      mod = num % 10;
      
      if ((mod == 3) || (mod == 7) || (mod == 8) || (mod == 9)) {
        fortuna ++;
      }
      
      else {
        malaSuerte++;
      }
      
      num /= 10;
            
    } while ( num > 0);
    
    if (malaSuerte < fortuna) {
      System.out.println("\nEl "+ numero +" es un numero afortunado.");
    }
    
    else {
      System.out.println("\nEl "+ numero +" no es un numero afortunado.");
    }    
  }
}
    
    
    
