import java.util.Scanner;

public class Ejercicio13 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    int[] num = new int[100];
    int min = 0;
    int max = 0;
    
    System.out.println();
    
    for (int i = 0; i < 100; i++) {
        
      num[i] = (int)(Math.random()*501);
      System.out.print(num[i] + " ");
     
     //buscamos el numero mas chico y el mas grande//
      if (i == 0) {
        
        min = num[i];
        max = num[i];
      }
      
      else if (num[i] < min) {
        
        min = num[i];
        
      }
      
      else if (num[i] > max) {
        
        max = num[i];
        
      }      
      
    }
    
    System.out.print("\n\nQue quiere destacar? (1 - minimo, 2 - maximo): ");
    int destacar = s.nextInt();
    
    System.out.println();
    
    //imprimimos el array otra vez, esta vez destacando el minimo o el maximo//
    switch (destacar) {
      
      case 1:
      
      for (int i = 0; i < 100; i++) {
        
        if (num[i] == min) {
          
        System.out.print("**" + num[i] + "**  ");
        
        }
        
        else {
          
          System.out.print(num[i] + " ");
        
        }
      }
      
      break;
      
      case 2:
      
      for (int i = 0; i < 100; i++) {
        
        if (num[i] == max) {
          
        System.out.print("**" + num[i] + "**  ");
        
        }
        
        else {
          
          System.out.print(num[i] + " ");
        
        }
      }
      
      break;
      
    }
    
  }
}
      
    
    
