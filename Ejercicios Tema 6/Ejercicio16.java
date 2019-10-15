import java.util.Scanner;

public class Ejercicio16 {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    int figura1 = 0;
    int figura2 = 0;
    int figura3 = 0;
    int tirada = 3;
    
    System.out.println();
    
    do {
      
      int figura = (int)(Math.random()*5) + 1;
      
      switch (figura) {
       
        case 1:
        System.out.print("(corazon) ");
        break;
        
        case 2:
        System.out.print("(diamante) ");
        break;
        
        case 3:
        System.out.print("(herradura) ");
        break;
        
        case 4:
        System.out.print("(campana) ");
        break;
        
        case 5:
        System.out.print("(limon) ");
        break;        
        
      }
      
      switch (tirada) {
      
        case 1:
        figura1 = figura;
        break;
        
        case 2: 
        figura2 = figura;
        break;
        
        case 3:
        figura3 = figura;
        break;
        
        default:
      }
      
      tirada --;
      
    } while (tirada > 0);
    
    if ((figura1 != figura2) && (figura2 != figura3) && (figura1 != figura3)) {
      System.out.println("\nLo siento, ha perdido.");
    } 
    
    else if ((figura1 == figura2) && (figura2 == figura3)) {
      System.out.println("\nEnhorabuena, ha ganado 10 monedas.");
    }
    
    else {
      System.out.println("\nBien, ha recuperado su moneda. ");
    }
  }
}
