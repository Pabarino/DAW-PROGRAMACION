import java.util.Scanner;

public class Ejercicio18 {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    int turn = 3;
    int color1 = 0;
    int color2 = 0;
    int color3 = 0;
    
    System.out.println();
    
    while ((color1 == color2) || (color2 == color3) || (color1 == color3)) {
    
      color1 = (int)(Math.random()*6) + 1;
      color2 = (int)(Math.random()*6) + 1;
      color3 = (int)(Math.random()*6) + 1;
    }
        
    switch (color1) {
        
      case 1:
      System.out.println("rojo ");
      break;
          
      case 2:
      System.out.println("azul");
      break;
          
      case 3:
      System.out.println("verde");
      break;
          
      case 4:
      System.out.println("amarillo");
      break;
          
      case 5:
      System.out.println("violeta");
      break;
        
      case 6:
      System.out.println("naranja");
      break;
          
      default:
    }
    
    switch (color2) {
        
      case 1:
      System.out.println("rojo ");
      break;
          
      case 2:
      System.out.println("azul");
      break;
          
      case 3:
      System.out.println("verde");
      break;
          
      case 4:
      System.out.println("amarillo");
      break;
          
      case 5:
      System.out.println("violeta");
      break;
        
      case 6:
      System.out.println("naranja");
      break;
          
      default:
    }
    
    switch (color3) {
        
      case 1:
      System.out.println("rojo ");
      break;
          
      case 2:
      System.out.println("azul");
      break;
          
      case 3:
      System.out.println("verde");
      break;
          
      case 4:
      System.out.println("amarillo");
      break;
          
      case 5:
      System.out.println("violeta");
      break;
        
      case 6:
      System.out.println("naranja");
      break;
          
      default:
    }
      
    
  }
}
