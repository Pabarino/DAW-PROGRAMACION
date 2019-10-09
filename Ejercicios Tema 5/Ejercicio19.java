import java.util.Scanner;

public class Ejercicio19 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    
    System.out.println("\nIntroduce el caracter con el que se pintara la piramide:");
    char c = s.next().charAt(0);
    System.out.println("Introduce la altura de la piramide (en lineas):");
    int altura = s.nextInt();
    
    int planta = 1;
    int longitudDeLinea = 1;
    int espacios = altura-1;
    
    while (planta <= altura) {
      
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      for (int i = 1; i<= longitudDeLinea; i++) {
        System.out.print(c);
      }
      
      System.out.println();
      
      planta++;
      espacios--;
      longitudDeLinea += 2;
    }
  }
}
    
    
    

