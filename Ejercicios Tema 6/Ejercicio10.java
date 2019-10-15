import java.util.Scanner;

public class Ejercicio10 {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    int lineas = 10;
    
    System.out.println("\n\n");
    
    do {
      
      int caracter = (int)(Math.random()*6) + 1;
      String car = " ";
    
      switch (caracter) {
      
        case 1: 
        car = "*";
        break;
      
        case 2: 
        car = "-";
        break;
      
        case 3: 
        car = "=";
        break;
      
        case 4:
        car = ".";
        break;
      
        case 5: 
        car = "|";
        break;
      
        case 6: 
        car = "@";
        break;
      
        default:
      
      }
      
      int longitud = (int)(Math.random()*40) + 1;
      
      for (int i = 0; i < longitud; i++) {
        System.out.print(car);
      }
      
      lineas --;
      System.out.println();
    } while (lineas > 0);
  }
}
