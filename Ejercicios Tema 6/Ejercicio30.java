import java.util.Scanner;

public class Ejercicio30 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduce la altura de la pecera (minimo 4 unidades). ");
    System.out.print("Altura: ");
    int altura = s.nextInt();
    System.out.println("Introduce el ancho de la pecera (minimo 4 unidades).");
    System.out.print("Ancho: ");
    int ancho = s.nextInt();
    
    System.out.println();
    
    int posicion = 0;
    int multiplicador = ((ancho - 2) * (altura - 2));
    int posicionPez = 0;
    int posicionCaballito = 0;
    int posicionCaracola = 0;
    
    while ((posicionPez == posicionCaballito) || (posicionPez == posicionCaracola) || (posicionCaracola == posicionCaballito)) {
     
      posicionPez = (int)(Math.random()*(multiplicador)) + 1;    
      posicionCaballito = (int)(Math.random()*(multiplicador)) + 1;   
      posicionCaracola = (int)(Math.random()*(multiplicador)) + 1;
         
    }
    
    if ((ancho < 4) || (altura < 4)) {
    System.out.println("\nEl valor introducido no es valido, minimo 4 unidades.");
    }
    
    else {
      
      //imprimir la parte de arriba de la pecera//
      for (int i = 0; i < ancho; i++) {
        
        System.out.print("* ");
      
      }
      
      System.out.println();
      
      //imprimir la parte del centro//
      for (int i = 0; i < (altura - 2); i++) {
        
        System.out.print("* ");
        
        for (int x = 0; x < (ancho - 2); x++) {
          
          //comprobar posicion del pez//
          if (posicion == posicionPez) {
            System.out.print("& ");
          }
          
          //comprobar posicion del caballito//
          else if (posicion == posicionCaballito) {
            System.out.print("$ ");
          }
          
          //comprobar posicion de la caracola//
          else if (posicion == posicionCaracola) {
            System.out.print("@ ");
          }
          
          //imprimir hueco//
          else {
            System.out.print("  ");
          }
          posicion ++;
        }
        
        System.out.println("* ");
        
      }
      
      //imprimir la base de la pecera//
      for (int i = 0; i < ancho; i++) {
        
        System.out.print("* ");
      
      }
      
    }
  }
}
      

