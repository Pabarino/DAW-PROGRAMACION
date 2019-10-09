import java.util.Scanner;
 
  public class Ejercicio17 {
    
    public static void main (String args []) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce un numero entero y positivo en el teclado. ");
    System.out.print("Numero: ");
    int num = s.nextInt();
    
    int n = 0;
    
    if (num >= 0) {
      
      for (int i = 0; i < num + 100; i++) {
      n += i;
      }
        System.out.println("La suma del numero introducido y de los 100 numeros siguientes es "+ n +".");
    } 
    else {
      System.out.println("El numero introducido no es correcto");
    }
     
 }
}
      
