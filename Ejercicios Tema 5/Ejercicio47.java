import java.util.Scanner;

public class Ejercicio47 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduzca la altura (numero impar mayor o igual a 5).");
    System.out.print("Altura: ");
    int altura = s.nextInt();
    
    System.out.println();
    int impar = altura % 2;
    int anchura = altura;
    
    
    
    if ((impar == 1) && (altura >= 5)) {
      
      for (int i = 0; i < anchura; i++) {
        System.out.print ("M");
      }
      
      System.out.println();
      
      for (int i = 0; i < (altura / 3); i++) {
        System.out.print ("M");
        for (int x = 0; x < (anchura-2); x++) {
          System.out.print(" ");
        }
        System.out.print ("M");
        System.out.println();
      }
      
      for (int i = 0; i < anchura; i++) {
        System.out.print ("M");
      }
      
      System.out.println();
      
      for (int i = 0; i < (altura / 3); i++) {
        System.out.print ("M");
        for (int x = 0; x < (anchura-2); x++) {
          System.out.print(" ");
        }
        System.out.print ("M");
        System.out.println();
      }
      
      for (int i = 0; i < anchura; i++) {
        System.out.print ("M");
      }
    }
    
    else {
      System.out.println("La altura introducida no es correcta.");
    }
  }
}

    
