import java.util.Scanner;

public class Ejercicio3 {
  
  public static void  main (String args []) {
  Scanner s= new Scanner(System.in);
   
   System.out.print("Introduce un numero de la semana (del 1 al 7): ");
   int num= s.nextInt();
   
   String diaSemana;
   
   switch (num) {
     
     case 1:
      diaSemana = "lunes";
      System.out.println("El numero " + num + " equivale a " + diaSemana + ".");
      break;
      
     case 2:
      diaSemana = "martes";
      System.out.println("El numero " + num + " equivale a " + diaSemana + ".");
      break;
      
     case 3:
      diaSemana = "miercoles";
      System.out.println("El numero " + num + " equivale a " + diaSemana + ".");
      break;
      
     case 4:
      diaSemana = "jueves";
      System.out.println("El numero " + num + " equivale a " + diaSemana + ".");
      break;
     
     case 5:
      diaSemana = "viernes";
      System.out.println("El numero " + num + " equivale a " + diaSemana + ".");
      break;
      
    case 6:
      diaSemana = "sabado";
      System.out.println("El numero " + num + " equivale a " + diaSemana + ".");
      break;
      
    case 7:
      diaSemana = "domingo";
      System.out.println("El numero " + num + " equivale a " + diaSemana + ".");
      break;
     
     default:
      System.out.println ("Este dia no existe.");
    }
    
    
  }
}
