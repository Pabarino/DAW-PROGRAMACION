import java.util.Scanner;

public class Ejercicio34extra {
  
  public static void main (String args []) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduzca un numero.");
    System.out.print("Numero: ");
    int num1 = s.nextInt();
    System.out.println("\nIntroduzca otro numero.");
    System.out.print("Numero: ");
    int num2 = s.nextInt();
    
    int numero1 = 0;
    int numero2 = 0;
    int par = 0;
    int impar = 0;
    int sumaN = num1 + num2;
    
    do {
      
      numero1 = num1%10;
      
      if (numero1%2 ==0) {  // comprobamos a si el num1 es par o impar con el if, pero se ponen del reves
        
        par = (par*10) + numero1;
      }
      
      else {
        impar = (impar*10) + numero1;
      }
      
      num1 = num1 / 10;
        
      numero2 = num2%10;
    
      if (numero2%2 ==0) {  // comprobamos a si el num2 es par o impar con el if, pero ponen del reves
        
        par = (par*10) + numero2;
      }
    
      else {
        impar = (impar*10) + numero2;
      }
    
      num2 = num2 / 10;
      sumaN = num1 + num2;
        
    } while ( sumaN != 0);
    
    int last_integer1 = 0;
    int reversedNum1 = 0;
    int last_integer2 = 0;
    int reversedNum2 = 0;
    
     while (par != 0) {  //revertir los pares
      last_integer1 = par%10;
      reversedNum1 = (reversedNum1 * 10) + last_integer1;
      par = par / 10;
      
    }
    
    while (impar != 0) {  //revertir los impares
      last_integer2 = impar%10;
      reversedNum2 = (reversedNum2 * 10) + last_integer2;
      impar = impar / 10;
      
    }
    
    
    System.out.println("\nEl numero formado por los numeros pares es "+ reversedNum1);
    System.out.println("El numero formado por los numeros impares es "+ reversedNum2);
    
  }
}


