import java.util.Scanner;

public class Ejercicio10 {
  
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);

   System.out.println("\nPor favor, introduzca los numero postivos para sacar la media \n(para concluir introduce un numero negativo): "); 
   
   int i = 1;
   int cantidadNum = 0;
   int media;
   int suma = 0;
   int constante = 1;
   
   do {
      
      System.out.print("Numero: ");
      int n = s.nextInt();
      cantidadNum = cantidadNum + 1;
      
      if (n >= 0) {
        suma += n;
      }
      
      else if (n < 0) {
        i = 0;
      }
        
      }
      
      while (i != 0);
      
      media = suma/(cantidadNum-1);     
      System.out.println("La media de los numeros introducidos es "+ media +".");
      
    }
  }

