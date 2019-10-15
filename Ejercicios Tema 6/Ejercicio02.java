import java.util.Scanner;

public class Ejercicio02 {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    
    int num1 = (int)(Math.random()*13) + 1;
    int num2 = (int)(Math.random()*4) + 1;
    String carta = " ";
    String palo = " ";
    
    System.out.println();
    
    if ((num1 < 11) && (num1 > 1)) {
      carta = String.valueOf(num1);
    } 
    
    else {
      
      switch (num1) {
      
        case 1:
        carta = "A";
        break;
      
        case 11:
        carta = "J";
        break;
      
        case 12:
        carta = "Q";
        break;
      
        case 13:
        carta = "K";
        break;
      
        default:    
        System.out.println("Valor introducido no valido.");  
      
      }
    }
    
    switch (num2) {
      
      case 1:
      palo = "picas";
      break;
      
      case 2:
      palo = "corazones";
      break;
      
      case 3:
      palo = "diamantes";
      break;
      
      case 4:
      palo = "treboles";
      break;
      
      default:  
      System.out.println("Valor introducido no valido.");  
      
    }
    
    if (num1 > 10) {
      System.out.println("La carta sacada al azar es la "+ carta +" de "+ palo +".");
    }
    
    else {
      System.out.println("La carta sacada al azar es el "+ carta +" de "+ palo +".");
    }
  }
}
    
    
