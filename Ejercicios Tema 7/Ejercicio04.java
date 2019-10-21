import java.util.Scanner;

public class Ejercicio04 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    int[] num = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    
    System.out.printf("\n%10s %10s %10s\n\n", "Numero", "Cuadrado", "Cubo");
    
    for (int i = 0; i < 100; i++) {
      
      int numero = (int)(Math.random()*100) + 1;
      num[i] = numero;
      cuadrado[i] = (int)(Math.pow(numero, 2));
      cubo[i] = (int)(Math.pow(numero, 4));
      
      System.out.printf("%10d %10d %10d\n", num[i], cuadrado[i], cubo[i]);
      
    }
    
    
    
  }
}
    
