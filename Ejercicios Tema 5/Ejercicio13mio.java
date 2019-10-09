import java.util.Scanner;

public class Ejercicio13mio {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduce numeros postivos o negativos: ");
    
    
    int aux = 10;
    
    do {
      
       System.out.print("Numeros: ");
       int n = s.nextInt();
       
       if (n >= 0) {
         System.out.println("El numero introducido es positivo");
         aux --;
       }
       
       else if (n < 0) {
        System.out.println("El numero introducido es negativo");
        aux --;
      }
      
      else {
        System.out.println("El valor introducido no es valido");
      }
     }
    
     while (aux > 0);
   }
 }


         
      
