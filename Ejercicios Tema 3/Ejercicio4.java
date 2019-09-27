import java.util.Scanner;

public class Ejercicio4 {
  
  public static void main (String args[]) {
  Scanner s= new Scanner(System.in);
  
  System.out.print ("Escribe un numero para las equaciones: ");
  float numero1= s.nextFloat(); 
  System.out.print ("Escribe el segundo numero para las equaciones: ");
  float numero2= s.nextFloat(); 
  
  float suma, resta, mult, div;
  suma= numero1+numero2;
  resta= numero1-numero2;
  mult= numero1*numero2;
  div=numero1/numero2;
  
  System.out.println ("La suma de los dos numeros es: " + suma);
  System.out.println ("La resta de los dos numeros es: " + resta);
  System.out.println ("La multiplicacion de los dos numeros es: " + mult);
  System.out.println ("La division de los dos numeros es:"  + div);
  
  
  
  
  }
}
