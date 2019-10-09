import java.util.Scanner;

 public class Ejercicio15 {
   
   public static void main (String args[]) {
   Scanner s = new Scanner(System.in);
   
     System.out.println("\nIntroduce una base. ");
     System.out.print("Base: ");
     int base = s.nextInt();
     System.out.println("Introduce un exponente. ");
     System.out.print("Exponente: ");
     int exp = s.nextInt();  
     
     int abs = Math.abs(exp);
     
     for ( int i = 1; i < 1 + abs; i++) {
       double potencia = Math.pow(base, i);
       System.out.printf("\n2 al poder de "+ i +" = %.0f\n", potencia);
     }
      
   }
 }
       
       
      
       
       
    
    
     
