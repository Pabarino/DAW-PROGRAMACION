import java.util.Scanner;

public class Ejercicio11 {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    int turnos = 20;
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    int e = 0;
    String nota = " ";
    
    System.out.println("\n\n");
    
    do {
      
      int numNotas = (int)(Math.random()*5) + 1;
      
      switch (numNotas) {
       
       case 1:
       nota = "suspenso";
       a ++;
       break;
       
       case 2:
       nota = "suficiente";
       b ++;
       break;
       
       case 3:
       nota = "bien";
       c ++;
       break;
       
       case 4:
       nota = "notable";
       d ++;
       break;
       
       case 5: 
       nota = "sobresaliente";
       e ++;
       break;
       
       default:
              
      }
      
      System.out.println(nota);
      turnos --;
      
    } while (turnos > 0);
    
    System.out.println("\n\n");
    System.out.println("Suspensos: "+ a);
    System.out.println("Suficientes: "+ b);
    System.out.println("Bienes: "+ c);
    System.out.println("Notable: "+ d);
    System.out.println("Sobresalientes: "+ e);
    
    
  
  }
}
