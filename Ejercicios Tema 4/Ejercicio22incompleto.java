import java.util.Scanner;

public class Ejercicio22incompleto {
  
  public static void main (String args[]) {
   Scanner s= new Scanner(System.in);

   System.out.print ("\nIntroduce el dia de la semana: ");
   String dia= s.nextLine();
   System.out.print ("\nIntroduce la hora en formato 24 horas: ");
   int hora= s.nextInt(); 
   System.out.print ("\nIntroduce los minutos: ");
   int minutos= s.nextInt(); 
   
   
   int tiempoResMin, tiempoResHora;
   int diaN = 0;
   tiempoResMin = 60 - minutos;
   tiempoResHora = 14 - hora;
   String fecha;
   
   if (dia.equals("lunes")) {
      diaN = 1;
    }
    
    else if (dia.equals("martes")) {
      diaN = 2;
    }
    
    else if (dia.equals("miercoles")) {
      diaN = 3;
    }
    
    else if (dia.equals("jueves")) {
      diaN = 4;
    }
    
    else if (dia.equals("viernes")) {
      diaN = 5;
    }
    
    if ((tiempoResMin > 60) || (tiempoResMin < 0) || (tiempoResHora > 14) ||(tiempoResHora < 0)) {
      System.out.println("Valor incorrecto introducido.");
     }
     
     switch (diaN) {
      
      case 1:
      fecha = "Quedan 4 dias";
      System.out.println("\n" + fecha + ", " + tiempoResHora + " horas y " + tiempoResMin + " minutos hasta el fin de semana.");
      break;
      
      case 2:
      fecha = "Quedan 3 dias";
      System.out.println("\n" + fecha + ", " + tiempoResHora + " horas y " + tiempoResMin + " minutos hasta el fin de semana.");
      break;
      
      case 3:
      fecha = "Quedan 2 dias";
      System.out.println("\n" + fecha + ", " + tiempoResHora + " horas y " + tiempoResMin + " minutos hasta el fin de semana.");
      break;
      
      case 4:
      fecha = "Quedan 1 dias";
      System.out.println("\n" + fecha + ", " + tiempoResHora + " horas y " + tiempoResMin + " minutos hasta el fin de semana.");
      break;
      
      case 5:
      fecha = "Quedan 0 dias";
      System.out.println("\n" + fecha + ", " + tiempoResHora + " horas y " + tiempoResMin + " minutos hasta el fin de semana.");
      break;
      
      default:
      System.out.println("La fecha introducida no es valida");
     }
   
 }
}
