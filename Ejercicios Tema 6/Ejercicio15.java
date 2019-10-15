import java.util.Scanner;

public class Ejercicio15 {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    String nota = " ";
    String primeraNota= " ";
    int sizeMelody = 3;
    int aux = 1;
    
    System.out.println();
    
    while (sizeMelody%2 == 1) {
      sizeMelody = (int)(Math.random()*24) + 4;
    }
    
    for (int x = 0; x < (sizeMelody/4) - 1; x++) {
      
      for (int i = 0; i < 4; i++) {
        
        int numNota = (int)(Math.random()*7) + 1;
    
        switch (numNota) {
      
          case 1: 
          nota = "do";
          System.out.print(nota + " ");
          break;
      
          case 2:
          nota = "re";
          System.out.print(nota + " ");
          break;
      
          case 3:
          nota = "mi";
          System.out.print(nota + " ");
          break;
      
          case 4 :
          nota = "fa";
          System.out.print(nota + " ");
          break;
      
          case 5:
          nota = "sol";
          System.out.print(nota + " ");
          break;
      
          case 6:
          nota = "la";
          System.out.print(nota + " ");
          break;
      
          case 7:
          nota = "si";
          System.out.print(nota + " ");
          break;
      
          default:
        }
        while (aux > 0) {
          primeraNota = nota;
          aux --;
        }
      }
      System.out.print("| ");      
    }
    
    for (int i = 0; i < 3; i++) {
        
      int numNota = (int)(Math.random()*7) + 1;
    
      switch (numNota) {
    
        case 1: 
        nota = "do";
        System.out.print(nota + " ");
        break;
      
        case 2:
        nota = "re";
        System.out.print(nota + " ");
        break;
      
        case 3:
        nota = "mi";
        System.out.print(nota + " ");
        break;
      
        case 4 :
        nota = "fa";
        System.out.print(nota + " ");
        break;
    
        case 5:
        nota = "sol";
        System.out.print(nota + " ");
        break;
      
        case 6:
        nota = "la";
        System.out.print(nota + " ");
        break;
      
        case 7:
        nota = "si";
        System.out.print(nota + " ");
        break;
      
        default:
      }
      
      while (aux > 0) {
          primeraNota = nota;
          aux --;
      }
    }
      System.out.print(primeraNota + " ");
      System.out.print("|| ");
  }
}
    
    
