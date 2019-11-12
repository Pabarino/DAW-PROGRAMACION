import java.util.Scanner;

public class Ejercicio03 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    int[][] enteros = new int[4][5];
    int[][] sumas = new int[4][5];
    int[] sumaF = new int[4];
    int[] sumaC = new int[5];
      
    System.out.println("Introduzca 20 numeros enteros.");
    
    //generamos las filas
    for (int i = 0; i < 4; i++) {
    
      //generamos las columnas//
      for (int x = 0; x < 5; x++) {
        
        enteros[i][x] = (int)(Math.random()*((999-100)+1)) + 100;
        
      }
    }
    
    //Generamos la tabla de la array//
    System.out.println("\n-------------------------------------------------------------------");
    
    //filas//
    for (int i = 0; i < 4; i++) {
      
      //columnas//
      for (int x = 0; x < 5; x++) {
      
        System.out.printf("|%-10d",enteros[i][x]);
        
      } 
      
      System.out.printf("|%-10s|", "Fila " + i);
      System.out.println("\n-------------------------------------------------------------------");
      
    }
    
    System.out.printf("|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|", "Columna0", "Columna1", "Columna2", "Columna3", "Columna4","Array num");
    System.out.println("\n-------------------------------------------------------------------");

    
    //Hacemos la suma de las filas//
    for (int i = 0; i < 4;  i++) {
      
      for (int x = 0; x < 5; x++) {
        
        sumaF[i] += enteros[i][x];
      }
      
    }
    
    //Hacemos la suma de las columnas//
    for (int i = 0; i < 5;  i++) {
      
      for (int x = 0; x < 4; x++) {
        
        sumaC[i] += enteros[x][i];
      }
      
    }
    
    //Hacemos la sumas totales//
    for (int i = 0; i < 4;  i++) {
      
      for (int x = 0; x < 5; x++) {
        
        sumas[i][x] = sumaF[i] + sumaC[x];
        
      }
      
    }
    
    //Generamos la tabla de las sumas//
    System.out.println("\n-------------------------------------------------------------------------------");
    
    //filas//
    for (int i = 0; i < 4; i++) {
      
      //columnas//
      for (int x = 0; x < 5; x++) {
      
        System.out.printf("|%-12s", "F" + i + "+" + "C" + x + "= " + sumas[i][x]);
        
      } 
    
      System.out.printf("|\033[31m%-12s\033[97m|", "Suma F" + i + "= " + sumaF[i]);  
      System.out.println("\n-------------------------------------------------------------------------------");
      
    }
    
    for (int i = 0; i < 5; i++) {
      
      System.out.printf("|\033[31m%-12s\033[97m", "Suma C" + i + "= " + sumaC[i]);
      
    }
    
    System.out.printf("|\033[31m%-12s\033[97m|","TOTAL");
    System.out.println("\n-------------------------------------------------------------------------------");
    
  }
}
