import java.util.Scanner;

public class Ejercicio03 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce numeros. ");
    
    int[] num = new int[10];
    
    for (int i = 9; i >= 0; i--) {
      
      System.out.print("\nNumero: ");
      num[i] = s.nextInt();
      
      
    }
    
    System.out.print("Invertido: ");
    
    for (int i = 0; i <= 9; i++) {
      
      System.out.print(num[i] +" ");
      
      
    }
    
  }
}
      
      
