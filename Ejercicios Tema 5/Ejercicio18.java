import java.util.Scanner;

  public class Ejercicio18 {
    
    public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    int num1,num2;
    
    do {
    
    System.out.print("\nIntroduce un numero entero por teclado: ");
    num1 = s.nextInt();
    System.out.print("Introduce un segundo numero entero distinto al anterior: ");
    num2 = s.nextInt();
    
    if (num1 == num2) {
      System.out.println("Los numeros introducidos tienen que ser distintos entre ellos.");
    }
  } while (num1 == num2);
  
    if (num1 > num2) {
      int aux = num1;
      num1 = num2;
      num2 = aux;
    }
    
    System.out.println("\nEl numero mas pequenyo incrementado por 7 hasta el numero mas grande: "); 
     
    for (int i = num1; i <= num2; i += 7) {
      System.out.println("\n" + i);
    }
  }
}
    
