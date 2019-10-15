import java.util.Scanner;

public class Ejercicio21 {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    System.out.println();

    for (int i = 0; i < 5; i++) {
      
      int moneda = (int)(Math.random()*8) + 1;
      
      switch (moneda) {
        
        case 1:
        
        int centimo1 = (int)(Math.random()*10) + 1;
        
        if (centimo1 > 5) {
          
          System.out.println("1 centimo - cara");
        
        }
        
        else {
          
          System.out.println("1 centimo - cruz");
        
        }
          
        break;
        
        case 2: 
        int centimo2 = (int)(Math.random()*10) + 1;
        
        if (centimo2 > 5) {
          
          System.out.println("2 centimo - cara");
        
        }
        
        else {
          
          System.out.println("2 centimo - cruz");
        
        }
        
        break;
        
        case 3:
        int centimo5 = (int)(Math.random()*10) + 1;
        
        if (centimo5 > 5) {
          
          System.out.println("5 centimo - cara");
        
        }
        
        else {
          
          System.out.println("5 centimo - cruz");
        
        }
        
        break;
        
        case 4:
        int centimo10 = (int)(Math.random()*10) + 1;
        
        if (centimo10 > 5) {
          
          System.out.println("10 centimo - cara");
        
        }
        
        else {
          
          System.out.println("10 centimo - cruz");
        
        }
        
        break;
        
        case 5:
        int centimo20 = (int)(Math.random()*10) + 1;
        
        if (centimo20 >= 5) {
          
          System.out.println("20 centimo - cara");
        
        }
        
        else {
          
          System.out.println("20 centimo - cruz");
        
        }
        
        break;
        
        case 6:
        int centimo50 = (int)(Math.random()*10) + 1;
        
        if (centimo50 > 5) {
          
          System.out.println("50 centimo - cara");
        
        }
        
        else {
          
          System.out.println("50 centimo - cruz");
        
        }
        
        break;
        
        case 7:
        int euro1 = (int)(Math.random()*10) + 1;
        
        if (euro1 > 5) {
          
          System.out.println("1 euro - cara");
        
        }
        
        else {
          
          System.out.println("1 euro - cruz");
        
        }
        
        break;
        
        case 8:
        int euro2 = (int)(Math.random()*10) + 1;
        
        if (euro2 > 5) {
          
          System.out.println("2 euro - cara");
        
        }
        
        else {
          
          System.out.println("2 euro - cruz");
        
        }
        
        break;
        
        default:
        
      }     
    }
  }
}
        
    
    
