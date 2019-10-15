import java.util.Scanner;

public class Ejercicio05 {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    System.out.println();
    
    for (int i = 0; i < 50; i++) {    
      
      int num = (int)(Math.random()*100) + 100;
      System.out.print (num +" ");
    }
  }
}
    
    
    
