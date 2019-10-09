import java.util.Scanner;

public class Ejercicio66 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("\nIntroduzca la altura de la figura (impar mayor o igual a 3). ");
    System.out.print("\nAltura: ");
    int altura = s.nextInt();
    
    int izquierda = 0;
    int espacios = 4;
    int altura1 = ((altura / 2));
    int altura2 = altura - altura1;
    
    if ((altura < 3) || (altura%2 == 0)) {
      System.out.println("La altura introducida no es valida, debe de ser un numero impar \nmayor o igual que 3.");
    } 
    
    else {
     
      System.out.println();
      
      //primera mitad//
      for (int x = 0; x < altura1; x++) {
        for (int j = 0; j < izquierda; j++) {
         System.out.print(" "); 
        }
        System.out.print("*");
        for ( int i = 0; i < espacios; i++) {
          System.out.print(" ");
        }
        System.out.println("*");
        
        izquierda++;
        
      }
      
      //segunda mitad//
      for (int x = 0; x < altura2; x++) {
        for (int j = 0; j < izquierda; j++) {
         System.out.print(" "); 
        }
        System.out.print("*");
        for ( int i = 0; i < espacios; i++) {
          System.out.print(" ");
        }
        System.out.println("*");
        
        izquierda--;
        
      }
      
    }
  }
}
