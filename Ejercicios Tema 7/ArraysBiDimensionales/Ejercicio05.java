import java.util.Scanner;

public class Ejercicio05 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    int[][] enteros = new int[6][10];
    int max = 0;
    int min = 0;
    
    //Filas//
    for (int i = 0; i < 6; i++) {
      
      //Columnas//
      for (int x = 0; x < 10; x++) {
        
        enteros[i][x] = (int)(Math.random()*1001);
        
        if (i == 0) {
          
          min = enteros[i][x];
          
        }
        
        else if (enteros[i][x] > min) {
          
          if (enteros[i][x] > max) {
            
            max = enteros[i][x];
            
          }          
        }
        
        else if (enteros[i][x] < min) {
          
          min = enteros[i][x];
            
        }
        
      }
    }
    
    System.out.println("Maximo: " + max);
    System.out.println("Minimo: " + min);
    
    
    
    
  }
}
