import java.util.Scanner;

public class Ejercicio03 {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    int num1 = (int)(Math.random()*10) + 1;
    int num2 = (int)(Math.random()*4) + 1;
    String carta = " ";
    String palo = " ";
    
    System.out.println();
    
    if ((num1 < 8) && (num1 > 1)) {
      carta = String.valueOf(num1);
    } 
    
    else {
      
      switch (num1) {
      
        case 1:
        carta = "As";
        break;
      
        case 8:
        carta = "Sota";
        break;
      
        case 9:
        carta = "Caballo";
        break;
      
        case 10:
        carta = "Rey";
        break;
      
        default:    
        System.out.println("Valor introducido no valido.");  
      
      }
    }
    
    switch (num2) {
      
      case 1:
      palo = "Oros";
      break;
      
      case 2:
      palo = "Copas";
      break;
      
      case 3:
      palo = "Espadas";
      break;
      
      case 4:
      palo = "Bastos";
      break;
      
      default:  
      System.out.println("Valor introducido no valido.");  
      
    }
    
    if (carta == "Sota")  {
      System.out.println("La carta sacada al azar es la "+ carta +" de "+ palo +".");
    }
    
    else {
      System.out.println("La carta sacada al azar es el "+ carta +" de "+ palo +".");
    }
  }
}
