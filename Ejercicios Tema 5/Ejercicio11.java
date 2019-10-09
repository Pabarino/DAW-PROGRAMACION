import java.util.Scanner;

public class Ejercicio11 {
  
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);

   System.out.print("\nPor favor, introduzca un número entero: ");
   int n = s.nextInt(); 
   
          System.out.printf("Numero | Cuadrado | Cubo\n");
          System.out.printf("-------------------------\n");
   
   for ( int i = n; i < n + 5; i++) {

         
          System.out.printf("%4d    %6d   %8d\n", i, i*i, i*i*i);
          
      }
    }
  }
