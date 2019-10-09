import java.util.Scanner;

public class Ejercicio42 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduzca un numero entero.");
    System.out.print("Numero: ");
    int entero = s.nextInt();
    
    int num = Math.abs(entero);
    boolean primo;
    
    for ( int a = num; a < num + 5; a++) {
      primo = true;
      for ( int b = 2; b < a; b++) {
      
        if ((a % b) == 0) {
          primo = false;
        }
      }
      
      if (primo) {
      System.out.println(a +" es primo.");     
      }
      
      else {
      System.out.println(a +" no es primo.");     
      }
    }
    System.out.println();
  }
}
    
    
