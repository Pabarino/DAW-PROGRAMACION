import java.util.Scanner;

public class Ejercicio25 {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    int max = 200;
    int min = 10;
    boolean primo = true;
    int numPrimo = 0;
    
    System.out.println();
    
    for (int i = 0; i < 100; i++) {
      
      int num = (int)(Math.random()*(+max - +min)) + (+min);
        
      for (int x = 2; x < num; x++) {
      
        if (num % x == 0) {
        
          primo = false;
          x = num;
        }
      }
      
      if (primo) {
        System.out.print("#"+ num +"# ");
      }
      
      else if (num % 5 == 0) {
        System.out.print("["+ num +"] ");
      }
      
      else {
        System.out.print(num +" ");
      }
      
      primo = true;
      
    }
  }
}
    
      
      
        
        
        
        
      
