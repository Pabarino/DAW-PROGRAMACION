import java.util.Scanner;

public class Ejercicio3 {
  
  public static void main (String args[]) {
  Scanner s= new Scanner(System.in);
  
  System.out.print ("Escribe la cantidad de pesetas para convertir a euros: ");
  double pesetas= s.nextDouble(); 
  double euros;
  euros= pesetas/166.4;
  System.out.println (pesetas + " pesetas equivalen a " + euros + " euros.");
  
  
  }
}
