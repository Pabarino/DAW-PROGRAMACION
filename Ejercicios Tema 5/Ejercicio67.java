import java.util.Scanner;

public class Ejercicio67 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("\nIntroduzca el numero de escalones. ");
    System.out.print("\nNumero: ");
    int numero = s.nextInt();
    System.out.print("\nIntroduzca la altura de cada escalon. ");
    System.out.print("\nAltura: ");
    int altura = s.nextInt();
    
    int anchura = 4;
    
    System.out.println();
    
    for (int x = 0; x < numero; x++) {
      for (int i = 0; i < altura; i++) {
        for (int j = 0; j < anchura; j++) {
          System.out.print("*");        
        }
        System.out.println();
      }
      anchura += 4;      
    }
  }
}
