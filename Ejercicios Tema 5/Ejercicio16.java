import java.util.Scanner;

 public class Ejercicio16 {
   
   public static void main (String args[]) {
   Scanner s = new Scanner(System.in);
   
    System.out.println("\nIntroduce un numero para comprobar si es primo.");
    System.out.print("Numero: ");
    int num = s.nextInt();
    
    boolean primo = true;
    
    for ( int i = 2; i < num; i++) {
      
      if ((num % i) == 0) {
        primo = false;
      }
    }
    
      if (primo) {
      System.out.println("El numero introducido es primo.");     
      }
      
      else {
      System.out.println("El numero introducido no es primo.");     
      }
      
    }
    
    
  }

        
      
