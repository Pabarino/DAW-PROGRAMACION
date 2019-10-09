import java.util.Scanner;

public class Ejercicio30 {
  
  public static void main (String args []) {
    Scanner s = new Scanner(System.in);
    
    int primerDia = 0;
    int segundoDia = 0;
    int primeraHora;
    int segundaHora;
    String nombrePrimerDia = " ";
    String nombreSegundoDia = " ";
    String dia1;
    String dia2;
    boolean datosCorrectos = true;
    
    
    do {
      
    System.out.println("\nIntroduce la primera hora.");
    System.out.print("Hora: ");
    primeraHora = s.nextInt();
    s.nextLine();
    System.out.println("\nIntroduce el dia de la semana.");
    System.out.print("Dia: ");
    dia1 = s.nextLine();
    
    switch (dia1) {
      
      case "lunes":
      case "1":
      primerDia = 1;
      nombrePrimerDia ="Lunes";
      break;
      
      case "martes":
      case "2":
      primerDia = 2;
      nombrePrimerDia ="Martes";
      break;
      
      case "miercoles":
      case "3":
      primerDia = 3;
      nombrePrimerDia ="Miercoles";
      break;
      
      case "jueves":
      case "4" :
      primerDia = 4;
      nombrePrimerDia ="Jueves";
      break;
      
      case "viernes":
      case "5":
      primerDia = 5;
      nombrePrimerDia ="Viernes";
      break;
      
      case "sabado":
      case "6":
      primerDia = 6;
      nombrePrimerDia ="Sabado";
      break;
      
      case "domingo":
      case "7":
      primerDia = 7;
      nombrePrimerDia ="Domingo";
      break;
      
      default:
      primerDia = 0;
    }
    
    System.out.println("\nIntroduce la segunda hora.");
    System.out.print("Hora: ");
    segundaHora = s.nextInt();
    s.nextLine();
    System.out.println("\nIntroduce el dia de la semana.");
    System.out.print("Dia: ");
    dia2 = s.nextLine();
    
    switch (dia2) {
      
      case "lunes":
      case "1":
      segundoDia = 1;
      nombreSegundoDia ="Lunes";
      break;
      
      case "martes":
      case "2":
      segundoDia = 2;
      nombreSegundoDia ="Martes";
      break;
      
      case "miercoles":
      case "3":
      segundoDia = 3;
      nombreSegundoDia ="Miercoles";
      break;
      
      case "jueves":
      case "4":
      segundoDia = 4;
      nombreSegundoDia ="Jueves";
      break;
      
      case "viernes":
      case "5":
      segundoDia = 5;
      nombreSegundoDia ="Viernes";
      break;
      
      case "sabado":
      case "6":
      segundoDia = 6;
      nombreSegundoDia ="Sabado";
      break;
      
      case "domingo":
      case "7":
      segundoDia = 7;
      nombreSegundoDia ="Domingo";
      break;
      
      default: 
      segundoDia = 0;
    }
    
    datosCorrectos = true;
    
    if (segundoDia <= primerDia) {
      System.out.println("El segundo dia debe ser posterior al primero.");
      datosCorrectos = false;
    }
    
    if ((primerDia == 0) || (segundoDia == 0)) {
      System.out.println("No se ha introducido correctamente el dia de la semana.");
      System.out.println("Los dias validos son: lunes, martes, miercoles, jueves y viernes. ");
      datosCorrectos = false;
    }
    
    if ((primeraHora < 0) || (primeraHora > 23) || (segundaHora < 0) || (segundaHora > 23)) {
      System.out.println("No se ha introducido correctamente la hora del dia.");
      System.out.println("Las horas validas estan entre 0 y 23.");
      datosCorrectos = false;
    }
    
    } while (!datosCorrectos);
  
    System.out.print("Entre las "+ primeraHora +":00h del "+ nombrePrimerDia);
    System.out.print(" y las "+ segundaHora +":00h del "+ nombreSegundoDia);
    System.out.println(" hay "+ (((segundoDia * 24) + segundaHora) - ((primerDia * 24) + primeraHora)) + "horas.");
    
  }
}
