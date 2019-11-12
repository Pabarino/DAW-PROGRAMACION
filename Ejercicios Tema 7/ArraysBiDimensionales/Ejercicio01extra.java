import java.util.Scanner;

public class Ejercicio01extra {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    int[][] enteros = new int[3][6];
    
    //generamos las filas//
    for (int i = 0; i < 3; i++) {
      
      //generamos las columnas//
      for (int x = 0; x < 6; x++) {
        
        enteros[i][x] = (int)(Math.random()*101);
        
      }
      
    }

    //Generamos la tabla del array num//
    System.out.println("\n------------------------------------------------------------------------------");
    System.out.printf("|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|", "Array num", "Columna0", "Columna1", "Columna2", "Columna3", "Columna4", "Columna5");
    System.out.println("\n------------------------------------------------------------------------------");
    
    //filas//
    for (int i = 0; i < 3; i++) {
      
      System.out.printf("|%-10s|", "Fila " + i);
      
      //columnas//
      for (int x = 0; x < 6; x++) {
      
        System.out.printf("%10d|",enteros[i][x]);
        
      } 
      
      System.out.println("\n------------------------------------------------------------------------------");
      
    }
  }
}
  
