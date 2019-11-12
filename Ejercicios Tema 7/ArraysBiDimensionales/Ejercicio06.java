import java.util.Scanner;

public class Ejercicio06 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    int[][] enteros = new int[6][10];
    boolean unico = true;
    int max = 0;
    int min = 0;
    
    //Filas//
    for (int i = 0; i < 6; i++) {
      
      //Columnas//
      for (int x = 0; x < 10; x++) {
        
        //Nos aseguramos de que ningun valor del array esta repetido//
        do {
          
          unico = true;
          enteros[i][x] = (int)(Math.random()*1001);
        
          //Filas//
          for (int z = 0; z < 6; z++) {
            
            //Columnas//
            for (int y = 0; y < 10; y++) {
              
              if ((i == z) && (x == y)) {
                
              }
              
              else if (enteros[i][x] == enteros[z][y]) {
                
                unico = false;
                
              }
            }
          }
                
        } while (!unico);
        
        //Mostramos el array para comprobar si hay alguno repetido//
        System.out.print(enteros[i][x] +" ");
        
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
    
    System.out.println("\n\nMaximo: " + max);
    System.out.println("Minimo: " + min);
    
    
    
    
  }
}

    
