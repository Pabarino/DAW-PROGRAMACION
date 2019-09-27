import java.util.Scanner;

public class Ejercicio4extra {
  
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
  
  System.out.println (numero1 + "+" + numero2 +"=" + suma);
  System.out.println (numero1 + "-" + numero2 +"=" + resta);
  System.out.println (numero1 + "*" + numero2 +"=" + mult);
  System.out.println (numero1 + "/" + numero2 +"=" + div);

  
  
  
  
  }
}

