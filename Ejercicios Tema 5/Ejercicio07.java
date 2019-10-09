public class Ejercicio07 {
  
  public static void main (String  args[]) {
    
    System.out.println("\nIntroduce la combinacion de cuatro cifras (tienes cuatro intentos): ");
    
    int oportunidad = 4;
    
    do {
      System.out.print("\nCombinacion: ");
      int combinacion = Integer.parseInt(System.console().readLine());
      
      if (combinacion == 1234) {
      System.out.println("\nLa caja fuera se ha abierto satisfactoriamente.");
      oportunidad = -1;
      }
      
      else {
      System.out.println("\nLo siento, esa no es la combinacion.");
      oportunidad --;
    }

      
    }   
    
    while (oportunidad > 0); 
    
    if (oportunidad == 0) {
    System.out.println("\n---------------------------------");
    System.out.println("\nHas fallado los cuatro intentos");
    }
    
  }
}
    



