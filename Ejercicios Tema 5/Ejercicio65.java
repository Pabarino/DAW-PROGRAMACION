import java.util.Scanner;

public class Ejercicio65 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("\nIntroduzca la altura de la A (mayor o igual a 3). ");
    System.out.print("\nAltura: ");
    int altura = s.nextInt();
    
    //comprobamos si la altura es valida//
    if (altura < 3) {
      System.out.println("La altura introducida no es valida.");
    } 
    
    else {
     
      System.out.print("\nIntroduzca la fila del palito horizontal (entre 2 y "+ (altura-1) +"): ");
      System.out.print("\nFila: ");
      int fila = s.nextInt();
      
      //comprobamos si la fila es valida//
      if ((fila < 2) || (fila >= altura)) {
        System.out.println("\nLa fila introducida no es valida.");
      } 
      
      else {
        
        int izquierda = altura - 1;
        int espacios = -1;
        int espacios2 = (fila * 2) -1;
        int relleno = 1;
    
        System.out.println();
        
        //pintamos la A//
        for (int x = 0; x < altura; x++) {
      
          for (int i = 0; i < izquierda; i++) {
            System.out.print(" ");      
          }
                    
          System.out.print("*");
          
          //pintamos la fila//
          if (x == (fila - 1)) {
            for (int i = 0; i < espacios2-1; i++) {
              System.out.print("*");  
            }
          }
      
          else if (x >= 1) {
        
            for (int j = 0; j < espacios; j++) {
              System.out.print(" ");      
            }
            System.out.print("*"); 
          }
              
          izquierda--;
          espacios += 2;
          
          System.out.println();
          
        }
      }
    }
  }
}
