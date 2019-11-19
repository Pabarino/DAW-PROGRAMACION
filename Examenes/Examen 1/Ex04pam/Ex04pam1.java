import java.util.Scanner;

public class Ex04pam1 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    boolean repeat = true;
    int izquierda = 0;
    int medio = 20;
    
    System.out.println("\nEste programa dibuja un gusano en la pantalla.");
    System.out.println("Controles: j=abajo-izquierda // k=abajo // l=abajo-derecha (seguido de ENTER) ");
    System.out.println("Para salir, pulse 's'.\n");
    
    
    while ( repeat ) {
      
      for (int i = 0; i < izquierda; i++) {
        
        System.out.print(" ");
        
      }
      
      System.out.print("*");
      
      for (int i = 0; i < medio; i++) {
        
        System.out.print(" ");
        
      }
      
      System.out.print("¿j,k,l,s?:");
      char c = s.next().charAt(0);
      
      switch (c) {
        
        case 'j':
        
        if (izquierda > 0) {
          
          izquierda --;
          medio ++;
        }
        
        break;
        
        case 'k':
        break;
        
        case 'l':
        
        if (izquierda < 10) {
          
          izquierda ++;
          medio --;
        }
        
        break;
        
        case 's':
        repeat = false;
        break;
        
        default:
        break;
        
      }
      
    }
  }
}

//PABLO ARINO MUNOZ//
        
        
    
    
    
    
    
    
