import java.util.Scanner;

public class Ejercicio11 {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[][] numeros = new int[10][10];
    int[] diagonal = new int[10];
    int max = 0;
    int min = 0;
    int suma = 0;
    int media = 0;
    
    //Rellenamos el array y lo mostramos por pantalla//
    
    System.out.println("\nArray: \n");
    
    for (int y = 0; y < 10; y++) {
      
      for (int x = 0; x < 10; x++) {
        
        numeros[y][x] = (int)(Math.random()*(300 - 200 + 1) + 200);
        System.out.print(numeros[y][x] + " ");
        
      }
      
      System.out.println("\n");
      
    }
    
    System.out.println("\nNumeros de la diagonal:\n");
    
    //Mostramos los numeros en el diagonal//
    for (int y = 0; y < 10; y++) {
      
      for (int x = 0; x < 10; x++) {
        
        if (x == y) {
          
          diagonal[y] = numeros[y][x];
          System.out.print(diagonal[y] + " ");
          
        }
        
      }      
    }
    
    //Buscamos media, maximo y minimo//
    for (int i = 0; i < 10; i++) {
      
      if (i == 0) {
        
        min = diagonal[i];
        
      }
      
      else if (diagonal[i] > min) {
        
        if (diagonal[i] > max) {
        
          max = diagonal[i];
        
        }
        
      }
      
      else if (diagonal[i] < min) {
        
        min = diagonal[i];
        
      }
      
      suma += diagonal[i];
      
    }
    
    media = suma / 10;
    
    System.out.println("\n\n Maximo: " + max);
    System.out.println("\n Minimo: " + min);
    System.out.println("\n Media: " + media);
    
  }
}
    
