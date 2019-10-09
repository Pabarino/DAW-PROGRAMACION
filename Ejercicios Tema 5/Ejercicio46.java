import java.util.Scanner;

public class Ejercicio46 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduzca la anchura del rectangulo.");
    System.out.print("Anchura: ");
    int anchura = s.nextInt();
    System.out.println("\nIntroduzca la altura del rectangulo.");
    System.out.print("Altura: ");
    int altura = s.nextInt();
    
    System.out.println();
    
    if ((altura >= 2) && (anchura >= 2)) {
      
      for (int i = 0; i < anchura; i++) {
        System.out.print ("* ");
      }
      
      System.out.println();
      
      for (int i = 0; i < (altura-2); i++) {
        System.out.print ("* ");
        for (int x = 0; x < ((anchura-2)*2); x++) {
          System.out.print(" ");
        }
        System.out.print ("* ");
        System.out.println();
      }
      
      for (int i = 0; i < anchura; i++) {
        System.out.print ("* ");
      }
    }
    
    else {
      System.out.println ("Lo siento los datos introducidos no son correctos, \nel valor minimo para la anchura y la altura es 2.");
    }
    
  }
}

