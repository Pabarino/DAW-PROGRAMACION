import java.util.Scanner;

public class Ejercicio21 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    int[] enteros = new int[15];
    
    //Generamos el array original//
    System.out.println("\nArray Original: ");
    
    for (int i = 0; i < 15; i++) {
      
      enteros[i] = (int)(Math.random()*501);
      System.out.printf("%3d ", enteros[i]);
      
    }
    
    //Generamos el array resultado//
    System.out.println("\n\nArray cincuerizado: ");
    
    for (int i = 0; i < 15; i++) {
        
      while ((enteros[i] % 5) != 0) {
        
        enteros[i] ++;
        
      }
      
      System.out.printf("%3d ", enteros[i]);
      
    }
    
    
  }
}
    
    
