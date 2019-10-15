import java.util.Scanner;

public class Ejercicio09 {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    int numero = 0;
    int longitud = 0;
    
    System.out.println();
    
    do {
      
      numero = (int)(Math.random()*100) + 1;
      
      if (numero % 2 == 0) {
        System.out.println(numero);
        longitud ++;
      }
      
      
    } while (numero != 24);
    
    System.out.println("\nSe han impreso "+ longitud +" numeros.");
  }
}
