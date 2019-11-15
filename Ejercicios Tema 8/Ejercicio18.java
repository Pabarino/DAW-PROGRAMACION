import Ejercicios1_14.Ejercicio1_14;
import java.util.Scanner;

public class Ejercicio18 {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String num = "";
    
    
    System.out.print("\nIntroduce un numero decimal: ");
    long decimal = s.nextLong();
    
    do {
      
      if (decimal % 2 == 0) {
       
        decimal /= 2; 
        num = "0" + num;

      }
      
      else if (decimal % 2 == 1) {
        
        decimal /= 2; 
        num = "1" + num;
        
      }
      
    } while (decimal > 0);
    
    System.out.println("\nBinario: " + num);
    
  }
}

