import java.util.Scanner;

public class Ejercicio35 { 
  
  public static void main (String args []) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduce la altura de la X hecha de asteriscos.");
    System.out.print("Altura (superior a 3): "); //A partir del numero impar 79 la X se distorsiona.
    int altura = s.nextInt();
    
    int base = altura - 2;
    int separacion1 = 1;
    int separacion2 = 1;
    int medio = 1;
    int cuenta = 1;
    
    System.out.println();
    
    if ((altura%2 == 0) || (altura < 3)) {
      System.out.println("El numero introducido no es valido, tiene que ser impar y superior a 3.");
    }
    
    else{
      
      medio = (altura%2) + (altura/2);
      
      for ( int a = 0; a < medio; a++) {
        System.out.print("*");
          
        for (int b = 0; b < base; b++) {
          System.out.print(" ");
        }
        
        if ( cuenta < medio) {
          System.out.print("*");
        
          System.out.println();
        
          for (int c = 0; c < separacion1; c++) {
            System.out.print(" ");
          }
        }
         
        base -= 2;
        cuenta ++;
        separacion1 ++;
      
      }
      
      System.out.println();
      
      while (medio > 1) {
      
        for ( int d = medio; d > 2; d--) {
          System.out.print(" ");
        }
          
          System.out.print("*");
          
          
          for (int e = 0; e < separacion2; e++) {
            System.out.print(" ");
          }
          
          System.out.println("*");
          
          separacion2 += 2;
          medio --;
        
        }
    
    }
  }
}
