import java.util.Scanner;

 public class Ejercicio14 {
   
   public static void main (String args []) {
   Scanner s = new Scanner(System.in);
    
     System.out.println("\nIntroduce una base. ");
     System.out.print("Base: ");
     int base = s.nextInt();
     System.out.println("Introduce un exponente. ");
     System.out.print("Exponente: ");
     int exp = s.nextInt();
     
     int abs = Math.abs(exp);
     double potencia = Math.pow(base, abs);
     
     System.out.printf("La potencia de "+ base +" al poder de "+ abs +" es %.0f.", potencia);
     
     
    
    
    
  }
}
     
