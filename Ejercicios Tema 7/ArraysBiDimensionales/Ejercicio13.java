import java.util.Scanner;

public class Ejercicio13 {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String[] pais = {"España","Rusia","Japón", "Australia"};
    int[][] estaturas = new int[4][10];
    int suma = 0;
    int media = 0;
    int maximo = 140;
    int minimo = 210;
    
    //Rellenamos el array//
    for (int y = 0; y < 4; y++) {
    
      for (int x = 0; x < 10; x++) {
      
        estaturas[y][x] = (int)(Math.random()*(210 - 140 + 1)) + 140;
     
      }
    }
    
    System.out.printf("\n%56s MIN MAX\n", "MED");
    
    //Pintamos la tabla//
    for (int i = 0; i < 4; i++) {
      
      suma = 0;
      minimo = 210;
      maximo = 140;
      System.out.printf("%9s: ", pais[i]);
      
      for (int x = 0; x < 10; x++) {
        
        System.out.print(estaturas[i][x] + " ");
        suma += estaturas[i][x];
        
        //Buscamos maximos y minimos//
        if (estaturas[i][x] > maximo) {
          
          maximo = estaturas[i][x];
          
        }
        
        if (estaturas[i][x] < minimo) {
          
          minimo = estaturas[i][x];
          
        }
        
        
      }
      
      //Hacemos la media//
      media = suma / 10;
      
      System.out.printf("| %d %d %d\n", media, minimo, maximo);
      
    }  
  }
}
    
