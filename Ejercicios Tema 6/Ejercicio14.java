import java.util.Scanner;

public class Ejercicio14 {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    int oportunidades = 5;
    boolean bool = false;
    String respuesta = " ";
    int min = 0;
    int max = 100;
    int suma = 1;
    
      
    do {
      
      int aux = 1;
      int multiplicador = (+max - +min);
      int adivina = (int)(Math.random()*(multiplicador)) + (+min);
        
      while (aux != 0) {
      
        aux = 0;
        
        System.out.println("\nEstas pensando en el numero "+ adivina +" ?");
        System.out.print("si/no: ");
        respuesta = s.nextLine();
        
        if (respuesta.equals("no")) {
          
          System.out.println("\nTu numero es mayor o menor?.");
          System.out.print("mayor/menor: ");
          String size = s.nextLine();
          
          if (size.equals("mayor")) {
            min = adivina;
            
          }
          
          else if (size.equals("menor")) {
            max = adivina;
          }
          
          else {
          System.out.println("\nPor favor debe introducir mayor o menor");
          aux = 1;
        }   
          
        }
        
        
        else if (respuesta.equals("si")) {
          bool = true;
          System.out.println("\nQue facil.");
        }
        
        else {
          System.out.println("\nPor favor debe introducir si o no");
          aux = 1;
        }     
      
        oportunidades --;
      }
      
    } while (!bool && (oportunidades > 0));
  }
}

