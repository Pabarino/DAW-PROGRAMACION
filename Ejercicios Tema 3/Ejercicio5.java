import java.util.Scanner;

public class Ejercicio5 {
  
  public static void main (String args[]) {
  Scanner s= new Scanner(System.in);
  
  System.out.print ("Escribe la altura del triangulo: ");
  float altura= s.nextFloat(); 
  System.out.print ("Escribe la base del triangulo: ");
  float base= s.nextFloat(); 
  float area;
  area= (altura*base)/2;
  
  System.out.println ("El area del triangulo es: " + area);
  
  
  
  
  }
}


