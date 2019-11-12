import java.util.Scanner;

public class Ejercicio01 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    int[][] enteros = new int[3][6];
    
    //asignamos valores indicados por el ejercicio//
    enteros[0][0] = 0;
    enteros[0][1] = 30;
    enteros[0][2] = 2;
    enteros[0][5] = 5;
    enteros[1][0] = 75;
    enteros[1][4] = 0;
    enteros[2][2] = -2;
    enteros[2][3] = 9;
    enteros[2][5] = 11;
    

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
  
