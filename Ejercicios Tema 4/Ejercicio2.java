import java.util.Scanner;

public class Ejercicio2 {
  
  public static void  main (String args []) {
  Scanner s= new Scanner(System.in);
   
   System.out.print("Escribe una hora: ");
   int hora= s.nextInt();
   int horA;
   horA = 0;
   
   String saludo;
   
   if (6<= hora) {
     if ( hora <= 12) {
     horA = 1;
    }
   }
   
   if (13<= hora) {
     if ( hora <= 20) {
     horA = 2;
    }
   }
   
   if (21<= hora) {
     if ( hora <= 24) {
     horA = 3;
    }
   }
   
   if (1<= hora) {
     if ( hora <= 5) {
     horA = 3;
    }
   }
   
   
   
   switch (horA) {
     
     case 1:
      saludo = "Good morning, nadal.";
      System.out.println(saludo);
      break;
      
     case 2:
      saludo = "Good evening, nada.";
      System.out.println(saludo);
      break;
      
     case 3:
      saludo = "Good night, nadal";
      System.out.println(saludo);
      break;
      
     default:
      System.out.println("Esta hora no existe, tiene que estar en el formato 24 horas.");
    }
    
    
  }
}


