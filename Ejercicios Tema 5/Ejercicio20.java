import java.util.Scanner;

public class Ejercicio20 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    
    System.out.println("\nIntroduce el caracter con el que se pintara la piramide:");
    char c = s.next().charAt(0);
    System.out.println("Introduce la altura de la piramide (en lineas):");
    int altura = s.nextInt();
    
    int planta = 1;
    int longitudDeLinea = 1;
    int espacios = altura-1;
    int altura2 = altura-1;
    
    while (planta <= altura2) {
      
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      System.out.print(c);
      
       if (planta != 1) {
         
      for (int i = 1; i<= longitudDeLinea; i++) {
        System.out.print(" ");
        }
        
        longitudDeLinea += 2;
        System.out.print(c);
        
      }
      
      System.out.println();
      
      planta++;
      espacios--;
      
    }
    
    int base = (altura * 2) -1;
    for (int i = 1; i<= base ; i++) {
        System.out.print(c);
  }
}
}
    
    
    
