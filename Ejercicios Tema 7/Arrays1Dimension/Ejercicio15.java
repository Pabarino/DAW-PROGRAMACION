import java.util.Scanner;

public class Ejercicio15 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    int[] ocu = new int[10];
    int[] restante = new int[10];
    int comensales = 0;
    boolean sitio = false;
    boolean completo = false;
    
    for (int i = 0; i < 10; i++) {
      
      ocu[i] = (int)(Math.random()*5);
      restante[i]= 4 - ocu[i];
    
    }
    
    //mostramos los huecos libres en el restaurante//
    System.out.printf("\n-------------------------------------------------------");
    System.out.printf("\n|%-12s| %2d |%2d |%2d |%2d |%2d |%2d |%2d |%2d |%2d |%2d |","Mesa num.",1,2,3,4,5,6,7,8,9,10);
    System.out.printf("\n-------------------------------------------------------");
    System.out.printf("\n|%-12s| %2d |%2d |%2d |%2d |%2d |%2d |%2d |%2d |%2d |%2d |","Ocupacion",ocu[0],ocu[1],ocu[2],ocu[3],ocu[4],ocu[5],ocu[6],ocu[7],ocu[8],ocu[9]);
    System.out.printf("\n-------------------------------------------------------");
    
    while ((comensales != -1) || (!completo)) {
      
      sitio = false;
      
      System.out.print("\n\nCuantos son? (Introduzca -1 para salir del programa): ");
      comensales = s.nextInt();
      
      if (comensales > 4) {
        
        System.out.println("Lo siento, no admitimos grupos de "+ comensales + ", haga grupos de 4 personas \ncomo maximo e intente de nuevo.");
        
      }
      
      else if (comensales != -1) {
        
        for (int i = 0; ((i < 10) && (sitio == false)); i++) {
           
           if (restante[i] == 4) {
             
             ocu[i] += comensales;
             restante[i] = 4 - ocu[i];
             sitio = true;
             
           }
          }
        
        for (int i = 0; ((i < 10) && (sitio == false)); i++) {
          
          if (restante[i] >= comensales) {
            
            ocu[i] += comensales;
            restante[i] = 4 - ocu[i];
            sitio = true;
          }          
        }
        
        if (!sitio) {
          
          System.out.println("\nLo sentimos, no queda sitio.");
          
        }  
        
        if (sitio) {
          
          System.out.printf("\n-------------------------------------------------------");
          System.out.printf("\n|%-12s| %2d |%2d |%2d |%2d |%2d |%2d |%2d |%2d |%2d |%2d |","Mesa num.",1,2,3,4,5,6,7,8,9,10);
          System.out.printf("\n-------------------------------------------------------");
          System.out.printf("\n|%-12s| %2d |%2d |%2d |%2d |%2d |%2d |%2d |%2d |%2d |%2d |","Ocupacion",ocu[0],ocu[1],ocu[2],ocu[3],ocu[4],ocu[5],ocu[6],ocu[7],ocu[8],ocu[9]);
          System.out.printf("\n-------------------------------------------------------");
  
        }           
        
      }
    
    }
    
  }
}
