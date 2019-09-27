import java.util.Scanner;

public class Ejercicio1 {
  
  public static void main (String args[]) {
  Scanner s= new Scanner(System.in);
  
  System.out.print ("Dime un numero entero: ");
  int numero1= s.nextInt(); 
  System.out.print ("Dime otro numero entero: ");
  int numero2= s.nextInt();
  int mult;
  mult= numero1*numero2;

  System.out.println ("Los dos numeros enteros multiplicados el uno por el otro equivalen a: " + mult);
    
  }
}

