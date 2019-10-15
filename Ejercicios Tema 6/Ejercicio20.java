import java.util.Scanner;

public class Ejercicio20 {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    System.out.println("\nPorfavor, indique la capacidad de la cuba en litros.");
    System.out.print("Capacidad: ");
    int capacidad = s.nextInt();
    
    int anchura = 6;
    int espacio = 4;
    int agua = (int)(Math.random()*(capacidad)) + 1;
    int cantidad =  capacidad - agua;
    
    System.out.println();
    
    for (int x = 0; x < capacidad; x++) {
      
      System.out.print("*");
      
      if (cantidad > 0) {
      
        for (int i = 0; i < espacio; i++) {
        
          System.out.print(" ");
        
        }
      }
      
      else {
        
        for (int i = 0; i < espacio; i++) {
        
          System.out.print("=");
        
        } 
      }       
        
      
      System.out.println("*");
      cantidad --;
      
    }
    
    for (int i = 0; i < anchura; i++) {
      System.out.print("*");
    }
    
    System.out.println("\nLa cuba tiene una capacidad de "+ capacidad +" litros y contiene "+ agua +" litros de agua.");
    
  }
}
        
        
    
