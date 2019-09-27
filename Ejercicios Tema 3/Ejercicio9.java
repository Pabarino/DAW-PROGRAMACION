import java.util.Scanner;

public class Ejercicio9 {
  
  public static void main (String args[]) {
  Scanner s= new Scanner(System.in);
  
  System.out.print ("Escribe la altura del cono: ");
  double altura= s.nextDouble(); 
  System.out.print ("Escribe el radio del cono: ");
  double radio= s.nextDouble(); 
  double volumen= ((1.0/3.0)*Math.PI*Math.pow(radio, 2)*altura);
  
  System.out.println ("El volumen del cono es: " + volumen);
  
  
  
  
  }
}

