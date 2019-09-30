import java.util.Scanner;

public class Ejercicio01 {
  
  public static void  main (String args []) {
  Scanner s= new Scanner(System.in);
   
   System.out.print("Introduce el dia de la semana para el que quieres consultar la asignatura: ");
   String dia= s.nextLine();
   int diA;
   diA = 0;
   
   String nombreAsignatura;
   
   if (dia.equals ("lunes")) {
     diA = 1;
   }
   
   if (dia.equals ("martes")) {
     diA = 2;
   }
   
   if (dia.equals ("miercoles")) {
     diA = 3;
   }
   
   if (dia.equals ("jueves")) {
     diA = 4;
   }
   
   if (dia.equals ("viernes")) {
     diA = 5;
   }
   
   switch (diA) {
     
     case 1:
      nombreAsignatura = "EED";
      System.out.println("El dia " + dia + " tienes " + nombreAsignatura + " a primera hora");
      break;
      
     case 2:
      nombreAsignatura = "PRO";
      System.out.println("El dia " + dia + " tienes " + nombreAsignatura + " a primera hora");
      break;
      
     case 3:
      nombreAsignatura = "PRO";
      System.out.println("El dia " + dia + " tienes " + nombreAsignatura + " a primera hora");
      break;
      
     case 4:
      nombreAsignatura = "PRO";
      System.out.println("El dia " + dia + " tienes " + nombreAsignatura + " a primera hora");
      break;
     
     case 5:
      nombreAsignatura = "FOL";
      System.out.println("El dia " + dia + " tienes " + nombreAsignatura + " a primera hora");
      break;
     
     default:
      System.out.println ("Este dia no existe o no hay clase.");
    }
    
    
  }
}
