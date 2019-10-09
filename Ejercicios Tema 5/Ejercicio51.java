import java.util.Scanner;

public class Ejercicio51 {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca un numero entero.");
    System.out.print("Numero (mayor que cero): ");
    int entero = s.nextInt();
    
    int num = entero;
    int volteado = 0;
    boolean numeroComido = false;
    
    do {
    
      if ((num % 10 != 0) && (num % 10 != 8)) {
        volteado = (volteado * 10) + (num % 10);
      } 
      
      else {
        numeroComido = true;
      }
    
      num /= 10;
      
    } while (num > 0);
    
    num = volteado;
    volteado = 0;
    
    while (num > 0) {
      
      volteado = (volteado * 10) + (num % 10);
      num /= 10;
    }
    
    if (numeroComido) {
    System.out.print("Despues de habersido comido por el gusando numerico,");
    System.out.println(" se queda en "+ volteado);
    }
    
    else {
      System.out.println ("El gusando numerico no se ha comido ningun digito.");
    }
  }
}

