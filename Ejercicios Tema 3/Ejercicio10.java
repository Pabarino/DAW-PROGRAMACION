import java.util.Scanner;

public class Ejercicio10 {
  
  public static void main (String args[]) {
  Scanner s= new Scanner(System.in);
  
  System.out.print ("Introduce la cantidad de Mb para convertir a Kb: ");
  double Mb= s.nextDouble(); 
  double Kb;
  Kb = Mb*1024;
  
  System.out.println ("El equivalente en Kb es de: " + Kb +" Kb");
  
  
  
  
  }
}



