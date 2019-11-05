import java.util.Scanner;

public class Ejercicio07 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    int[] num = new int [100];
    char c = '"';
    
    for (int i = 0; i < 100; i++) {
      
      num[i] = (int)(Math.random()*21);
      
      System.out.print(num[i] + " ");
      
    }
    
    System.out.println("\n\nIntroduce dos valores.");
    System.out.print("Primer valor: ");
    int valor1 = s.nextInt();
    System.out.print("Segundo valor: ");
    int valor2 = s.nextInt();
    
    System.out.println("\n");
    
    for (int i = 0; i < 100; i++) {
      
      if (num[i] == valor1) {
       
        num[i] = valor2;
        System.out.print( c +"" + num[i] + "" + c  + " "); 
        
      }
       
      else {
         
         System.out.print(num[i] + " "); 
         
      }
    }      
  }
}
    
    
    
    
