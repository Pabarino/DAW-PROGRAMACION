import java.util.Scanner;

public class Ejercicio20 {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    System.out.println("\nPor favor, introduzca un número entero (de 5 cifras como máximo): ");
    int input = s.nextInt();
    
    int reversedNum = 0;
    int last_integer = 0; 
    int input2 = input;
    
    if (input<100000) {
    
     while (input != 0) {
       last_integer = input%10;
       reversedNum = (reversedNum * 10) + last_integer;
       input = input / 10;
     }
    
     if (reversedNum == input2) {
       System.out.println("El numero introducido es capicua.");
     }
     
     else {
       System.out.println("El numero introducido no es capicua.");
     }
     
   }
   
    else {
      System.out.println("El numero introducido contiene mas de 5 digitos.");
    }
       
  }
}
