import java.util.Scanner;

public class TareaPiramide {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
  
    System.out.println("\nIntroduzca la altura de la piramide.");
    System.out.print("Altura: ");
    int altura = s.nextInt();
    System.out.println("\nIntroduce el caracter con el que se pintara la piramide:");
    System.out.print("Caracter: ");
    char c = s.next().charAt(0);
     
    int anchura = 1;
    int izquierda = altura - 1;
    
    System.out.println();
     
    for (int x = 0; x < altura; x++) {
      
      for (int i = 0; i < izquierda; i++) {
        System.out.print(" ");
      }
      for (int i = 0; i < anchura; i++) {
        System.out.print(c +" ");
      }
      
      anchura ++;
      izquierda --;
      
      System.out.println();
    }
  }
}
  
  
