import java.util.Scanner;

public class Ejercicio63 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduzca la altura de la primera piramide.");
    System.out.print("Altura: ");
    int altura1 = s.nextInt();
    System.out.println("\nIntroduzca la altura de la segunda piramide.");
    System.out.print("Altura: ");
    int altura2 = s.nextInt();
    
    int base1 = (altura1 * 2) -1;
    int base2 = (altura2 * 2) -1;
    int espacios1 = altura1 - 1;
    int espacios2 = (altura2 * 2) - 1;
    int relleno1 = 1;
    int relleno2 = 1;
    int smallP1 = 0;
    
    System.out.println();
    
    //si la piramide1 es mas alta que la piramide2//
    if (altura1 > altura2) {
    
      for (int x = 0; x < altura1-1; x++) {

        //imprimir la piramide1//
        for (int i = 0; i < espacios1; i++) {
          System.out.print(" ");
        }
      
        for (int i = 0; i < relleno1; i++) {
          System.out.print("*");
        }     
        
        //imprimir la piramide2//
        if ((altura1 - x) <= altura2) {
        
          for (int i = 0; i < espacios2; i++) {
            System.out.print(" ");
          }
        
          for (int i = 0; i < relleno2; i++) {
            System.out.print("*");
          }    
        
          relleno2 += 2;
          espacios2 -= 2;
        }
        
      
        espacios1--;
        relleno1 += 2;
      
        System.out.println();
      }
    }
      
    //si la piramide2 es mas alta que la piramide1//
    else if (altura2 >= altura1) {
      
      for (int x = 0; x < altura2-1; x++) {
        
        //imprimir la piramide1//
        if ((altura2 - x) <= altura1) {
          
          for (int i = 0; i < espacios1; i++) {
            System.out.print(" ");
          }
      
          for (int i = 0; i < relleno1; i++) {
            System.out.print("*");
          }   
          
          espacios1--;
          relleno1 += 2;  
          
          for (int i = 0; i < espacios2; i++) {
          System.out.print(" ");
        }
        
        } 
        
        //introducir espacios//
        else {
        
          for (int i = smallP1; i < ((base1 + 1) + (base2 / 2)); i++) {
            System.out.print(" ");
          }
          
          smallP1++;
          
        }
        
        //imprimir la piramde2//
        for (int i = 0; i < relleno2; i++) {
          System.out.print("*");
        }    
        
        relleno2 += 2;
        espacios2 -= 2;
        System.out.println();
        
      }
    }
            
    //imprimir las bases//
    for (int i = 0; i < base1; i++) {
      System.out.print("*");
    }
    
    System.out.print (" ");
    
    for (int i = 0; i < base2; i++) {
      System.out.print("*");
    }
  }
}
