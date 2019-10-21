import java.util.Scanner;

public class Ejercicio05 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce 10 numeros por teclado.");
    
    int[] num = new int[10];
    
    for (int i = 0; i < 10; i++) {
      
      System.out.print("\nNumero: ");
      num[i] = s.nextInt();
      
    }
    
    int min = num[1];
    int max = 0;
    
    for (int i = 0; i <= 8; i++) {
      
      if (num[i] < num[i + 1]) {
       
        if (num[i] < min) {
         
          min = num[i];
        
        }
       
        if (num[i + 1] > max) {
       
          max = num[i + 1];
        
        }
      }
      
      else if (num[i] > num[i + 1]) {
        
        if (num[i] < min) {
          
          min = num[i + 1];
          
        }
        
        if (num[i] > max) {
          
          max = num[i];
          
        }
      }
    }
    
    System.out.println("\nMaximo: "+ max);
    System.out.println("Minimo: "+ min);
    
  }
}
