import java.util.Scanner;

public class Ejercicio22 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    int num = 1;
    
    do {
      
      num ++;
      boolean primo = true;
    
    for ( int i = 2; i < num; i++) {
      
      if ((num % i) == 0) {
        primo = false;
      }
    }
    
      if (primo) {
      System.out.println(num);     
      }
      
    } while (num < 100);
    
  }
}
    
    
