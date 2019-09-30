import java.util.Scanner;

public class Ejercicio14 {
  
  public static void main (String args []) {
   Scanner s= new Scanner(System.in);
   
   System.out.println("\n Introduce el numero que quieres saber si es par y/o divisible entre 5: \n");
   System.out.print("Introduce el numero: ");
   int num = s.nextInt ();
   
   int numA = 0; /**Este numero representa si es par o impar*/
   int numB = 0; /**Este numero representa si es divisible en 5*/
   String resultadoA, resultadoB;
   
   
   if ((num % 2) == 0) {
     numA = 1;
   }
   
   else {
     numA = 2;
   }
   
   switch (numA) {
     
     case 1:
     resultadoA = "par";
     System.out.println("El numero introducido es " + resultadoA + ".");
     break;
     
     case 2:
     resultadoA = "impar";
     System.out.println("El numero introducido es " + resultadoA + ".");
     break;
     
   }
      
   if ((num % 5) == 0) {
     numB = 1;
   }
  
  else {
     numB = 2;
   }
   
   switch (numB) {
     
     case 1:
     resultadoB = "es divisible entre 5";
     System.out.println("El numero introducido " + resultadoB + ".");
     break;
     
     case 2:
     resultadoB = "no es divisible entre 5";
     System.out.println("El numero introducido " + resultadoB + ".");
     break;
     
   }
   
  }
}

