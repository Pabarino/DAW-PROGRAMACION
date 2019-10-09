import java.util.Scanner;

public class Ejercicio23 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduce una seria indeterminada de numeros (concluira cuando suma supere 10000).");
    
    int suma = 0;
    int cantidadNum = 0;
    int media;
    
    do {
      
      System.out.print("Numero: ");
      int num = s.nextInt();
      
      suma = suma + num;
      cantidadNum += 1;
      
    } while ( suma <= 10000); 
    
    media = suma/cantidadNum;
    System.out.println("\nTotal acumulado de los numeros introducidos: " + suma);
    System.out.println("\nContador de numeros introducidos: " + cantidadNum);
    System.out.println("\nMedia de los numeros introducidos: " + media);
    
    
  }
}

