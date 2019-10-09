import java.util.Scanner;

public class Ejercicio34 {
  
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
    int par1 = 0;
    int par2 = 0;
    int impar1 = 0;
    int impar2 = 0;
    int x = 1;
    
    do {
      
      numero1 = num1%10;
      
      if (numero1%2 ==0) {
        par1 = (par1*10) + numero1;
      }
      
      else {
        impar1 = (impar1*10) + numero1;
      }
      
      num1 = num1 / 10;
      
      if ( x > 0) {
        
        do {
        
        numero2 = num2%10;
      
        if (numero2%2 ==0) {
          par2 = (par2*10) + numero2;
        }
      
        else {
          impar2 = (impar2*10) + numero2;
        }
      
        num2 = num2 / 10;
        
        } while (num2 != 0);
      } 
      
      x = 0;
    
    } while ( num1 != 0);
    
    System.out.println("El numero formado por los numeros pares es "+ par1 + par2);
    System.out.println("El numero formado por los numeros impares es "+ impar1 + impar2);
    
  }
}

        
