import java.util.Scanner;

public class Ejercicio13 {
  
  public static void main (String args []) {
   Scanner s= new Scanner(System.in);
   
   System.out.println("\n Introduce tres numeros para odenar de menor a mayor: \n");
   System.out.print("Introduce el primer numero: ");
   double numA = s.nextDouble ();
   System.out.print("Introduce el segundo numero:");
   double numB = s.nextDouble ();
   System.out.print("Introduce el tercer numero: ");
   double numC = s.nextDouble ();
   
   double primero = 0, segundo = 0, tercero = 0;
   
   
   if ((numA>numB) && (numA>numC)) {
     primero = numA;
     if (numB>numC) {
       segundo = numB;
       tercero = numC;
     }
     else {
       segundo = numC;
       tercero = numB;
     }
   }
   
   if ((numA>numB) || (numA>numC)) {
     if ((numA<numB) || (numA<numC)) {
       segundo = numA;
       if (numB>numC) {
       primero = numB;
       tercero = numC;
     }
     else {
       primero = numC;
       tercero = numB;
     }
     }
   }
   
   if ((numA<numB) && (numA<numC)) {
     tercero = numA;
     if (numB>numC) {
       primero = numB;
       segundo = numC;
     }
     else {
       primero = numC;
       segundo = numB;
       
    
     }
   }
   
   System.out.println("Los numeros en orden son " + primero + ", " + segundo + " y " + tercero + ".");
     
   
   
   
   
  }
}
