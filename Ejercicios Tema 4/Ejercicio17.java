import java.util.Scanner;

public class Ejercicio17 {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    System.out.println("\n Introduce un numero para revertir");
    System.out.print("Respuesta: ");
    int input = s.nextInt();
    
    int last_integer; 
    last_integer = input%10;
    
    System.out.println("El ultimo numero es " + last_integer + ".");
     
  
  
  }
}
