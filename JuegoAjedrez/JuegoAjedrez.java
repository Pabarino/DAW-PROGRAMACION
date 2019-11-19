import java.util.Scanner;
import movimientos.Movimientos.MovimientoTorre

public class JuegoAjedrez {
  
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    final String VACIO = "";
    final String peonB = "P";
    final String torreB = "T";
    final String alfilB = "A";
    final String caballoB = "C";
    final String reinaB = "Q";
    final String reyB = "K";
    final String peonN = "\033[31mP\033[97m";
    final String torreN = "\033[31mT\033[97m";
    final String alfilN = "\033[31mA\033[97m";
    final String caballoN = "\033[31mC\033[97m";
    final String reinaN = "\033[31mQ\033[97m";
    final String reyN = "\033[31mK\033[97m";
    
    int x;
    int y;
    int columnaObjetivo;
    int filaObjetivo;
    int columna;
    int fila;
    boolean ilegal = false;
    boolean vJ1 = false;
    boolean vJ2 = false;
    String[][] tablero = new String[8][8];
    
    //Inicializamos el array//
    for (y = 0; y < 8; y++) {
      for (x = 0; x < 8; x++) {
        
        //Inicializamos las negras//
        if ((y == 0) && ((x == 0) ||(x == 7))) {
        
          tablero[y][x] = torreN ;
          
        }
        
        else if ((y == 0) && ((x == 1) || (x == 6))) {
        
          tablero[y][x] = caballoN ;
          
        }
        
        else if ((y == 0) && ((x == 2) || (x == 5))) {
        
          tablero[y][x] = alfilN ;
          
        }
        
        else if ((y == 0) && (x == 3)) {
        
          tablero[y][x] = reinaN ;
          
        }
        
        else if ((y == 0) && (x == 4)) {
        
          tablero[y][x] = reyN ;
          
        }
        
        else if (y == 1) {
        
          tablero[y][x] = peonN ;
          
        }
        
        //Inicializamos las blancas
        else if ((y == 7) && ((x == 0) || (x == 7))) {
        
        tablero[y][x] = torreB;
        
        }
        
        else if ((y == 7) && ((x == 1) || (x == 6))) {
        
          tablero[y][x] = caballoB;
          
        }
        
        else if ((y == 7) && ((x == 2) || (x == 5))) {
        
          tablero[y][x] = alfilB;
          
        }
        
        else if ((y == 7) && (x == 3)) {
        
          tablero[y][x] = reinaB;
          
        }
        
        else if ((y == 7) && (x == 4)) {
        
          tablero[y][x] = reyB;
          
        }
        
        else if (y == 6) {
        
          tablero[y][x] = peonB;
          
        }
        
        //Inicializamos los huecos//
        
        else {
          
          tablero[y][x] = VACIO;
          
        }
        
      }      
    }
    
    
    //Mostramos el tablero//
    System.out.println("\n  ---------------------------------");
    
    for (y = 0; y < 8; y++) {
      
      System.out.print((y + 1) + " ");
      
      for (x = 0; x < 8; x++) {
        
        if ((y == 0) || (y == 1) || (y == 6) || (y == 7)) {
          
          System.out.print("| " + tablero[y][x] + " ");
          
        }
        
        else {
        
          System.out.print("|   ");
          
        }
        
      }
      
      System.out.println("|\n  ---------------------------------");
      
    }
    
    System.out.printf("%5s%4s%4s%4s%4s%4s%4s%4s\n","a","b","c","d","e","f","g","h");
    
    //Pedimos el movimiento jugador 1// 
    do {
      
      System.out.print("\nDeclare la ficha que desea mover Jugador 1\n(E.j h6 para mover el peon al principio): ");
      String posicionFicha = s.nextLine();
      columna = (int)(posicionFicha.charAt(0)) - 96;
      fila = (int)(posicionFicha.charAt(1)) - 48;
      
      if ((columna > 8) || (columna < 1) || (fila > 8) || (fila < 1)) {
        
        System.out.print("\nFicha inexistente.");
        
      }
      
    } while ((columna > 8) || (columna < 1) || (fila > 8) || (fila < 1));
    
    //Comprobamos si el movimiento es posible//
    do {
      ilegal = false; 
      
      System.out.print("\nDeclare donde desea mover la ficha (tiene que ser un movimiento legal): ");
      String objetivoFicha = s.nextLine();
      columnaObjetivo = (int)(objetivoFicha.charAt(0)) - 96;
      filaObjetivo = (int)(objetivoFicha.charAt(1)) - 48;
      
      if ((columnaObjetivo > 8) || (columnaObjetivo < 1) || (filaObjetivo > 8) || (filaObjetivo < 1)) {
        
        System.out.print("\nMovimiento ilegal.");
        
      }
      
      else if (tablero[fila][columna] == torreB) {
        
        movimientos.Movimientos.MovimientoTorre(tablero[][]);
        
      }
      
    } while ((columnaObjetivo > 8) || (columnaObjetivo < 1) || (filaObjetivo > 8) || (filaObjetivo < 1));    
  }
}
    
    
    
    
