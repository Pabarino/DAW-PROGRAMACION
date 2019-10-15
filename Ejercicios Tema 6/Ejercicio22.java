import java.util.Scanner;

public class Ejercicio22 {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    System.out.println("\nPorfavor, introduzca la longitud de la serpiente en caracteres \n contando la cabeza.");
    System.out.print("Longitud: ");
    int longitud = s.nextInt();
    
    int izquierda = 12;
    
    //Colocamos la cabeza en su sitio//
    for (int i = 0; i < izquierda; i++) {
      
      System.out.print(" ");
      
    }
    
    System.out.println("@");
    
    for (int i = 0; i < longitud; i++) {
      
      int posicion = (int)(Math.random()*3) + 1;
      
      switch (posicion) {
        
        case 1:
        izquierda --;
        
        for (int x = 0; x < izquierda; x++) {
      
          System.out.print(" ");
      
        }
        
        System.out.println("*");
        
        break;
        
        case 2:
        
        for (int x = 0; x < izquierda; x++) {
      
          System.out.print(" ");
      
        }
        
        System.out.println("*");
        
        break;
        
        case 3:
        izquierda ++;
        
        for (int x = 0; x < izquierda; x++) {
      
          System.out.print(" ");
      
        }
        
        System.out.println("*");
        
        break;
        
        default:
        
      }
    }
  }
}
    
  
