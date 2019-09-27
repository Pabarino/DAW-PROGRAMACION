import java.util.Scanner;

public class Ejercicio21 {
  
  public static void main (String args[]) {
   Scanner s= new Scanner(System.in);

   System.out.print ("\nIntroduce la nota del primer examen (sobre 10): ");
   float nota1= s.nextFloat();
   System.out.print ("\nIntroduce la nota del segundo examen (sobre 10): ");
   float nota2= s.nextFloat();  
  
   float notaS, notaR;
   notaS = ((Math.abs(nota1)) + (Math.abs(nota2)))/2;
   notaR = 10 - notaS;
  
   if ((notaR >= 0) && (notaR <=5)){
      System.out.println("\nHas aprobado, enhorabuena!");
     }
     
   else if ((notaR >= 0) && (notaR >5)){
     System.out.println("\nHas suspendido, tendras que hacer un examen de recuperacion.");
     System.out.println("\nCual ha sido el resultado de la recuperacion? (apto/no apto): ");
     String recuperacion = System.console().readLine();
           
     if (recuperacion.equals("apto")) {
      System.out.println("\nHas aprobado con el minimo de 5.");
     }
     
     else if (recuperacion.equals("no apto")) {
      System.out.println("\nHas suspendido las recuperaciones.");
     }
     
     else {
      System.out.println("\nEl valor introducido no es valido.");
     }
     
   }
   
   else {
      System.out.println("\nLas notas introducidas no son validas.");
    }
  
  }
}
  
