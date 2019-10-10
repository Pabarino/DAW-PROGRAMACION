import java.util.Scanner;

public class TareaPiramideP2 {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    System.out.println("\nIntroduzca la altura de la piramide.");
    System.out.print("Altura: ");
    int altura = s.nextInt();
    System.out.println("\nIntroduce el caracter con el que se pintara la piramide:");
    System.out.print("Caracter: ");
    char c = s.next().charAt(0);
     
    int anchura = 1;
    int izquierda = altura;
    String a, b;
    String relleno = " ";
    String espacios = " ";
    
    System.out.println();
     
    for (int x = 0; x < altura; x++) {
      
      relleno = " ";
      
      a = String.format("%%%ds", izquierda);
      System.out.printf(a, espacios);
      
      for (int i = 0; i < anchura; i++) {
        b = String.format(c +" ");
        relleno += b;
      }
      
      System.out.printf("%s", relleno);
      anchura ++;
      izquierda --;
      
      System.out.println();
    }
  }
}
  
