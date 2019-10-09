import java.util.Scanner;

public class Ejercicio09 {
  
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);

   System.out.print("\nPor favor, introduzca un número entero: "); 
   int n = s.nextInt();
   
   int cantidadNum = 0;
   int constante = 1;
   int absN = Math.abs(n);
   
   do {
     
      cantidadNum = cantidadNum + 1;
      constante = constante*10;
      }
      
      while (absN > constante);
      
      System.out.println("\nEl numero introducido tiene " + cantidadNum + " digitos."); 
      
    }
  }
