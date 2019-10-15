import java.util.Scanner;

public class Ejercicio24 {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    System.out.println("Introduzca un numero entero positivo.");
    System.out.print("Numero: ");
    int num = s.nextInt();
    
    int numero = num;
    int longitud = 0;
    int numAleatorio;
    
    while (numero != 0) {
      
      longitud ++;
      numero /= 10;
      
    }
    
    int posicion = (int)(Math.random()*(longitud)) + 1;
    int restante = num / ((int)Math.pow(10, (longitud - posicion)));
    numAleatorio = restante % 10;
    
    System.out.println(numAleatorio);
  }
}
