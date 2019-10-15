import java.util.Scanner;

public class Ejercicio26mio {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    System.out.println("\nPorfavor la anchura de la tableta.");
    System.out.print("Anchura: ");
    int anchura = s.nextInt();
    System.out.println("\nIntrouduzca la altura de la tableta.");
    System.out.print("Altura: ");
    int altura = s.nextInt();
    
    int lineaBocado = (int)(Math.random()*altura) + 1;
    int ladoBocado = (int)(Math.random()*4) + 1;
    int columnaBocado = (int)(Math.random()*anchura) + 1;
    
    System.out.println("\n");
    
    for (int i = 1; i <= altura; i++) {
        
      switch (ladoBocado) {
        
        //si el bocado esta en el lado izquierda//
        case 1:
        
        if (i == lineaBocado) {
        
          System.out.print(" ");
          
          for (int x = 0; x < anchura - 1; x++) {
        
          System.out.print("*");
          
          }
        }
        
        else {
          
          for (int x = 0; x < anchura; x++) {
          
          System.out.print("*");
          
          }
        }
        
        break;
        
        //si el bocado esta en el lado derecho//
        case 2:
        
        if (i == lineaBocado) {
          
          for (int x = 0; x < anchura - 1; x++) {
        
          System.out.print("*");
          
          }
          System.out.print(" ");
        }
        
        else {
          
          for (int x = 0; x < anchura; x++) {
          
          System.out.print("*");
          
          }
        }
        
        break;
          
        //si el bocado esta arriba//
        case 3:
        
        if (i == 1) {
          
          for (int x = 0; x < anchura; x++) {
          
            if (columnaBocado == x) {
              
              System.out.print(" ");
              
            }
            
            else {
              
              System.out.print("*");
              
            }
          }
        }
        
        else {
          
          for (int x = 0; x < anchura; x++) {
          
          System.out.print("*");
          
          }
        }
        
        break;
        
        //si el bocado esta abajo//
        case 4:
        
        if (i == altura) {
          
          for (int x = 0; x < anchura; x++) {
          
            if (columnaBocado == x) {
              
              System.out.print(" ");
              
            }
            
            else {
              
              System.out.print("*");
              
            }
          }
        }
        
        else {
          
          for (int x = 0; x < anchura; x++) {
          
          System.out.print("*");
          
          }
        }
        
        break;
        
        default:
        break;
      }
      
      System.out.println();
    
    }
  }
}
    
    
