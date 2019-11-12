import java.util.Scanner;

public class Ejercicio09 {
  
    
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    int[][] matriz = new int[12][12];
    int capa;
    int aux1;
    int aux2;
    
    System.out.println("\n Array sin rotar:");
    System.out.println(" -----------------\n");
    
    for (int y = 0; y < 12; y++) {
      
      for (int x = 0; x < 12; x++) {
        
        matriz[y][x] = (int)(Math.random()*101);
        
        System.out.printf("%3d ", matriz[y][x]);
        
      }
      
      System.out.println("\n");
      
    }
    
    //rotacion//
    
    for (capa = 0; capa < 6; capa ++) {
      
      //rota la parte de arriba//
      aux1 = matriz[capa][11 - capa];
      for (int i = 11 - capa; i > capa; i--) {
        matriz[capa][i] = matriz[capa][i - 1];
      }
      
      //rota la parte de la derecha//
      aux2 = matriz[11 - capa][11 - capa];
      for (int i = 11 - capa; i > capa + 1; i--){
        matriz[i][11 - capa] = matriz[i - 1][11 - capa];
      }
      matriz[capa + 1][11 - capa] = aux1;
      
      //rota la parte de abajo//
      aux1 = matriz[11 - capa][capa];
      for (int i = capa; i < 11 - capa - 1; i++) {
        matriz[11 - capa][i] = matriz[11 - capa][i + 1];
      }
      matriz[11 - capa][11 - capa -1] = aux2;
      
      //rota la parte de la izquierda//
      aux2 = matriz[capa][capa];
      for (int i = capa; i < 11 - capa -1; i++) {
        matriz[i][capa] = matriz[i + 1][capa];
      }
      matriz[11 - capa - 1][capa] = aux1;
    
    } //for capa//
    
    System.out.println("\n\n Array rotado en el sentido de las agujas del reloj:");
    System.out.println(" --------------------------------------------------\n");
    
    for (int y = 0; y < 12; y++) {
      
      for (int x = 0; x < 12; x++) {
        
        System.out.printf("%3d ", matriz[y][x]);
        
      }
      
      System.out.println("\n");
      
    }
    
  }
}
