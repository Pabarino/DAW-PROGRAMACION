import java.util.Scanner;

public class Ejercicio06 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce 15 numeros por teclado.");
    
    int[] num = new int[15];
    int[] num1 = new int[15];
    
    for (int i = 0; i < 15; i++) {
      
      System.out.print("\nNumero: ");
      num[i] = s.nextInt();
        
    }
    
    for (int i = 0; i < 15; i++) {
      
      if (i == 0) {
        
        num1[i] = num[14];
        
      }
      
      else {
        
        num1[i] = num[i - 1];
      
      }
      
    }
    
    
    System.out.print("\nArray: ");
    
    for (int i = 0; i < 15; i++) {
      
      System.out.print(num1[i] +" ");
      
    }
  }
}
