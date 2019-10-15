import java.util.Scanner;

public class Ejercicio23 {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    System.out.println();
    
    for (int i = 0; i < 5; i++) {
      
      int tirada = (int)(Math.random()*6) + 1;
      
      switch (tirada) {
        
        case 1:
        System.out.print("As ");
        break;
        
        case 2:
        System.out.print("K ");
        break;
        
        case 3:
        System.out.print("Q ");
        break;
        
        case 4:
        System.out.print("J ");
        break;
        
        case 5:
        System.out.print("7 ");
        break;
        
        case 6:
        System.out.print("8 ");
        break;
        
        default:
        
      }
    }
  }
}
