import java.util.Scanner;

public class Ejercicio18extra {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    System.out.println("\n Introduce un numero");
    System.out.print("Respuesta: ");
    int input = s.nextInt();
    
    int primeraCifra = 0;
    int reversedNum = 0;
    int last_integer = 0; 
    
    while (input != 0) {
      last_integer = input%10;
      reversedNum = (reversedNum * 10) + last_integer;
      input = input / 10;
      
    }
    
    primeraCifra = reversedNum%10;
    
    System.out.println("La primera cifra de este numero es " + primeraCifra + ".");
     
  
  
  }
}
