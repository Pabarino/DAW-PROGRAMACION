import java.util.Scanner;

public class Ejercicio05 {
  
  public static void main (String args []) {
   Scanner s= new Scanner(System.in);
   
   System.out.print("Introduce un valor para la variable a: ");
   float varA = s.nextFloat ();
   System.out.print("Introduce un valor para la variable b: ");
   float varB = s.nextFloat ();
   
   float valorX = (-(varB))/varA;
   
   System.out.println("El valor de x es de: " + valorX);
    
  }
}
