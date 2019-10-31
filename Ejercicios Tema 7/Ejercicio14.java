import java.util.Scanner;

public class Ejercicio14 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    String[] palabras = new String[8];
    String[] aux = new String[8];
    int x = 0;
    int y = 7;
    
    System.out.println("\nA continuacion, introduzca ocho palabras:");
    
    //guardamos las palabras introducidas//
    for (int i = 0; i < 8; i++) {
      
      System.out.print("\nPalabra "+ (i + 1) +": ");
      palabras[i] = s.nextLine();
      
    }
    
    System.out.println();
    
    //Imprimimos el array original//
    System.out.println("\nArray Original.");
    System.out.printf("-------------------------------------------------------------------------");
    System.out.printf("\n|%7d |%7d |%7d |%7d |%7d |%7d |%7d |%7d |",0,1,2,3,4,5,6,7);
    System.out.printf("\n-------------------------------------------------------------------------");
    System.out.printf("\n|%7s |%7s |%7s |%7s |%7s |%7s |%7s |%7s |",palabras[0],palabras[1],palabras[2],palabras[3],palabras[4],palabras[5],palabras[6],palabras[7]);
    System.out.printf("\n-------------------------------------------------------------------------");
    
    for (int i = 0; i < 8; i++) {
      
      if ((palabras[i].equals("verde")) || (palabras[i].equals("rojo" )) || (palabras[i].equals("azul")) || 
      (palabras[i].equals("amarillo")) || (palabras[i].equals("naranja")) || (palabras[i].equals("rosa")) || 
      (palabras[i].equals("negro")) || (palabras[i].equals("blanco")) || (palabras[i].equals("morado"))) {
      
        aux[x] = palabras[i];
        x++;
        
      }
      
      else {
        
        aux[y] = palabras[i];
        y--;      
        
      }
    }
    
    System.out.println("\nArray Resultado.");
    System.out.printf("-------------------------------------------------------------------------");
    System.out.printf("\n|%7d |%7d |%7d |%7d |%7d |%7d |%7d |%7d |",0,1,2,3,4,5,6,7);
    System.out.printf("\n-------------------------------------------------------------------------");
    System.out.printf("\n|%7s |%7s |%7s |%7s |%7s |%7s |%7s |%7s |",aux[0],aux[1],aux[2],aux[3],aux[4],aux[5],aux[6],aux[7]);
    System.out.printf("\n-------------------------------------------------------------------------");
    
    
  }
}
    
