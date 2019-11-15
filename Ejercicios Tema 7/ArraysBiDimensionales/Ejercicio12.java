import java.util.Scanner;

public class Ejercicio12 {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
   
    int[][] numeros = new int[9][9];
    int[] diagonal = new int[9];
    int max = 0;
    int min = 0;
    int suma = 0;
    int media = 0;
    
    //Rellenamos el array y lo mostramos por pantalla//
    
    System.out.println("\nArray: \n");
    
    for (int y = 0; y < 9; y++) {
      
      for (int x = 0; x < 9; x++) {
        
        numeros[y][x] = (int)(Math.random()*(900 - 500 + 1) + 500);
        System.out.print(numeros[y][x] + " ");
        
      }
      
      System.out.println("\n");
      
    }
    
    System.out.println("\nNumeros de la diagonal:\n");
    
    //Mostramos los numeros en el diagonal//
    for (int i = 0; i< 9; i++) {
      
      diagonal[i] = numeros[8 - i][i];
      System.out.print(diagonal[i] + " ");
      
    }
    
    //Buscamos media, maximo y minimo//
    for (int i = 0; i < 9; i++) {
      
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
