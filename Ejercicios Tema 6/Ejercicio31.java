import java.util.Scanner;

public class Ejercicio31 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduce la cantidad de dinero que quiere apostar. ");
    System.out.print("Cantidad: ");
    int cantidad = s.nextInt();
    
    int dinero = cantidad;
    int sumaD1 = 0;
    int sumaD2 = 0;
    int tirada = 0;
    
    while (dinero != 0) {
      
      int dado1 = (int)(Math.random()*(6)) + 1;   
      int dado2 = (int)(Math.random()*(6)) + 1;
      sumaD1 = dado1 + dado2;
      sumaD2 = sumaD1;

      System.out.println("\nPrimer dado: "+ dado1);
      System.out.println("Segundo dado: "+ dado2);
      System.out.println("Suma de los dados: "+ sumaD1);
      
      if ((sumaD1 == 7) || (sumaD1 == 11)) {
        
        System.out.println("\nHas ganado: "+ dinero);
        dinero += dinero;
        System.out.println("\nTotal: "+ dinero);
        
      }
      
      else if ((sumaD1 == 2) || (sumaD1 == 3) || (sumaD1 == 12)) {
        
        System.out.println("\nHas perdido: "+ dinero);
        
        dinero -= dinero;
        
      }
      
      else {
        
        dado1 = (int)(Math.random()*(6)) + 1;   
        dado2 = (int)(Math.random()*(6)) + 1;
        sumaD1 = dado1 + dado2;

        System.out.println("\nPrimer dado: "+ dado1);
        System.out.println("Segundo dado: "+ dado2);
        System.out.println("Suma de los dados: "+ sumaD1);
        
        if (sumaD2 == sumaD1) {
        
        System.out.println("\nHas ganado: "+ dinero);
        dinero += dinero;
        System.out.println("\nTotal: "+ dinero);
      
        }
        
        else if (sumaD2 == 7) {
          
          System.out.println("\nHas perdido: "+ dinero);
          
          dinero -= dinero;
          
        }
        
        tirada ++;
        
      }  
      
      tirada ++;
      
    }
    
    System.out.println("\nHas durado "+ tirada +" turnos.");    
    
  }
}
    
    
    
    
    
    
