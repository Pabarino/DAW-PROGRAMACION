import java.util.Scanner;

public class Ejercicio06 {
  
  public static void main (String args[]) {
  Scanner s= new Scanner(System.in);
  
  System.out.print ("Escribe la altura del rectangulo: ");
  float altura= s.nextFloat(); 
  System.out.print ("Escribe la base del rectangulo: ");
  float base= s.nextFloat(); 
  float area;
  area= (altura*base);
  
  System.out.println ("El area del rectangulo es: " + area);
  
  
  
  
  }
}
