import java.util.Scanner;

public class Ejercicio2 {
  
  public static void main (String args[]) {
  Scanner s= new Scanner(System.in);
  
  System.out.print ("Escribe la cantidad de euros para convertir a pesetas: ");
  double euros= s.nextDouble(); 
  double pesetas;
  pesetas= euros*166.4;
  System.out.println (euros + " euros equivalen a " + pesetas + " pesetas.");
  
  
  }
}

