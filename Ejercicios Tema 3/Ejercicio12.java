import java.util.Scanner;

public class Ejercicio12 {
  
  public static void main (String args[]) {
  Scanner s= new Scanner(System.in);
  
  System.out.print ("Introduce la nota del primer examen (sobre 10): ");
  float nota1= s.nextFloat(); 
  System.out.print ("Introduce la nota que deseas sacar en el trimestre (sobre 10): ");
  float notaD= s.nextFloat(); 
  float nota2, nota1P, nota2P, trim;
  nota1P = (nota1/10)*4 ;
  trim = notaD-nota1P;
  nota2P = 6-trim;
  
  
  if (nota2P >= 0) {
  nota2 = (10*trim)/6;
  System.out.println ("La nota que necesitas sacar en el segundo examen es de: " + nota2 +" sobre 10");
  } 
  
  else 
  System.out.println("No es posible sacar esta nota.");
  
  
  
  
  
  
  
  
  }
}



