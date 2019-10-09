import java.util.Scanner;

public class Ejercicio69 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("\nIntroduzca la altura de la piramide maya (entero mayor o igual a 3). ");
    System.out.print("\nAltura: ");
    int altura = s.nextInt();
    
    if (altura < 3) {
      System.out.println("La altura introducida no es valida.");
    }
    
    else {
    
      System.out.println();
      
      int izquierda = altura;
      int espacios = 4;
      int terraza = 6;
      int laterales = 2;
      int centrales = terraza + 4;
    
      //imprimos la terraza//
      for (int i = 0; i < izquierda; i++) {
        System.out.print(" ");
      }
      for (int i = 0; i < terraza; i++) {
        System.out.print("*");
      }
      
      System.out.println();
    
      //resto de la piramide//
      for (int x = 1; x < altura; x++) {
        
        //imprimimos los laterales//
        if ((x % 2) == 1) {
          
          for (int i = 1; i < izquierda; i++) {
            System.out.print(" ");
          }
          for (int i = 0; i < laterales; i++) {
            System.out.print("*");
          }
          for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
          }
          for (int i = 0; i < laterales; i++) {
            System.out.print("*");
          }
          laterales += 2;
        }
        
        //imprimimos los centros//
        else {
          
          for (int i = 1; i < izquierda; i++) {
            System.out.print(" ");
          }
          for (int i = 0; i < centrales; i++) {
            System.out.print("*");
          }
          centrales += 4;
        }
        
        izquierda--;
        System.out.println();
      }
    }
  }
}

