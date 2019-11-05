import java.util.Scanner;

public class Ejercicio20 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    System.out.print("\nIntroduzca el numero total de nombres de reyes: ");
    int num = s.nextInt();
    
    String[] total = new String[num];
    
    System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");
    
    //Recogemos los nombres en un array String//
    for (int i = 0; i < num; i++){
      
      total[i] = s.next();
    
    }
  
    System.out.println("\nLos reyes introducidos son: ");
    
    //comprobamos si hay mas de uno y lo mostramos por pantalla//
    for (int i = 0; i < num; i++){
      
      int orden = 1;
      
      for (int x = 0; x < i; x++) {
        
        if(total[i].equals(total[x])) {
        
          orden++;
        
        }
      }
      
      System.out.println(total[i] + " " + orden + "o");
      
    }
  }
}
