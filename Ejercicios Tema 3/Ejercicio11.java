import java.util.Scanner;

public class Ejercicio11 {
  
  public static void main (String args[]) {
  Scanner s= new Scanner(System.in);
  
  System.out.print ("Introduce la cantidad de Kb para convertir a Mb: ");
  double Kb= s.nextDouble(); 
  double Mb;
  Mb = Kb/1024;
  
  System.out.println ("El equivalente en Mb es de: " + Mb +" Mb");
  
  
  
  
  }
}




