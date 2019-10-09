import java.util.Scanner;

public class Ejercicio64 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
        
    int altura = 3;
    int anchura = 6;
    int opcion = 0;
    int aux = 0;
    
    System.out.println();
    
    do {
      
      //pintamos el rectangulo/
      for (int i = 0; i < anchura; i++) {
        System.out.print("*");
      }
      
      System.out.println();
      
      for (int i = 0; i < altura - 2; i++) {
        System.out.print("*");
        for (int x = 0; x < anchura - 2; x++) {
           System.out.print(" ");  
         }
         System.out.println("*");       
      }

      for (int i = 0; i < anchura; i++) {
        System.out.print("*");
      }
      
      System.out.println();
      
      //Creamos el menu//
      System.out.print("\n1. Agrandarlo ");
      System.out.print("\n2. Achicarlo ");
      System.out.print("\n3. Cambiar la orentacion ");
      System.out.print("\n4. Salir ");
      System.out.print("\nIndique que quiere hacer con el rectangulo (numero): ");
      opcion = s.nextInt();
      
      //introducimos las opciones//
      switch (opcion) {
        
        case 1:
        altura++;
        anchura++;
        break;
        
        case 2:
        if ((anchura > 2) && (altura > 2)) {
          anchura--;
          altura--;
        }
        break;
        
        case 3:
        aux = altura;
        altura = anchura;
        anchura = aux;
        break;     
        
        default: 
      } 
      
      System.out.println();

    } while (opcion != 4);
  }
}
    
