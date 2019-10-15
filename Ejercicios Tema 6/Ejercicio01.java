import java.util.Scanner;

public class Ejercicio01 {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    int suma = 0;
    
    System.out.println();
    
    for (int i = 0; i < 3 ; i++) {
    
      int dados = (int)(Math.random()*6) + 1;
      
      suma += dados;
      
    }
    
    System.out.println("La suma de la tirada de los tres dados es: "+ suma);
  }
}
