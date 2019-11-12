import java.util.Scanner;

public class Ejercicio10 {
  
  static final String JUGADOR = "X";
  static final String ORDENADOR = "O";
    
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    String[][] tablero = new String[3][3];
    int columnaJ = 0;
    int filaJ = 0;
    int movimientos = 0;
    boolean jugadorGana = false;
    boolean ordenadorGana = false;
    boolean movimiento = false;
    
    //Inicializamos el array//
    for (int y = 1; y <= 3; y++) {
      
      for (int x = 1; x <= 3; x++) {
        
        tablero[y][x] = " ";
        
      }
    } 
    
    System.out.println("\nBienvenido al tres en ralla! \nLas filas van del 1 al 3 y las columnas van de la \"a\" a la \"c\" (Ej: 2a).");

    
    //Pintamos el tablero//
    System.out.println("\n-------------");
    
    for (int y = 1; y <= 3; y++) {
      
      for (int x = 1; x <= 3; x++) {
        
      System.out.printf("|%2s ", "");
      
      
      }
      
      System.out.println("|\n-------------");
      
    }
    
    System.out.println("\nJugador 1 = X");
    System.out.println("Jugador 2 = O");
    
    
    while ((!jugadorGana) && (!ordenadorGana) && (movimientos < 9)) {
      
      movimiento = false;
      
      //JUGADOR 1//
      //Comprobamos que el movimiento es valido//
      while (!movimiento) {
        
        System.out.print("\nIntroduzca las coordenadas: ");
        String posicionJ = s.next(); 
        columnaJ = (int)(posicionJ.charAt(0)) - 48; 
        filaJ = (int)(posicionJ.charAt(1)) - 96;
        tablero[filaJ][columnaJ] = JUGADOR;
        
        if (tablero[filaJ][columnaJ] == 0) {
        
          movimiento = true;
          
        }
        
      }
        
      movimientos++;
      
      //Pintamos el tablero con jugada 1//
      
      
    }
  }
}
