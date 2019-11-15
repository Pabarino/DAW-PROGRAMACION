import java.util.Scanner;

public class Ejercicio10 {
  
  static final String JUGADOR = "X";
  static final String ORDENADOR = "O";
    
  public static void main(String[] args) 
    throws InterruptedException {  
    Scanner s = new Scanner(System.in);
    
    String[][] tablero = new String[3][3];
    int columna = 0;
    int fila = 0;
    int movimientos = 0;
    boolean jugadorGana = false;
    boolean ordenadorGana = false;
    boolean movimiento = false;
    String nombreFila = "cba";
    
    //Inicializamos el array//
    for (int y = 0; y < 3; y++) {
      
      for (int x = 0; x < 3; x++) {
        
        tablero[y][x] = " ";
        
      }
    } 
    
    System.out.println("\nBienvenido al tres en ralla! \nLas columnas van del 1 al 3 y las filas van de la \"a\" a la \"c\" (Ej: a2).");

    
    //Pintamos el tablero//
    System.out.println("\n-------------");
    
    for (int y = 0; y < 3; y++) {
      
      for (int x = 0; x < 3; x++) {
        
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
        String posicion = s.next(); 
        fila = nombreFila.indexOf(posicion.charAt(0)); 
        columna = (posicion.charAt(1)) - 1 -48;
        
        if (tablero[fila][columna].equals(" ")) {
        
          movimiento = true;
          tablero[fila][columna] = JUGADOR;
          
        }
        
      }
        
      movimientos++;
      
      //Pintamos el tablero con jugada 1//
      System.out.println("\n-------------");
    
      for (int y = 0; y < 3; y++) {
        
        for (int x = 0; x < 3; x++) {
        
        if (tablero[y][x] == JUGADOR) {
        
          System.out.printf("|%2s ", JUGADOR);
          
        }
        
        else if (tablero[y][x] == ORDENADOR) {
            
            
            System.out.printf("|%2s ", ORDENADOR);
            
          }
        
        else {
          
          System.out.printf("|%2s ", " ");
          
        }
        
        
        }
        
        System.out.println("|\n-------------");
        
      }
      
      //Comprobamos si gana el jugador 1//
      jugadorGana = (
      (tablero[0][0] == JUGADOR) && (tablero[0][1] == JUGADOR) && (tablero[0][2] == JUGADOR)
    || 
      (tablero[1][0] == JUGADOR) && (tablero[1][1] == JUGADOR) && (tablero[1][2] == JUGADOR)
    ||
      (tablero[2][0] == JUGADOR) && (tablero[2][1] == JUGADOR) && (tablero[2][2] == JUGADOR)
    ||
      (tablero[0][0] == JUGADOR) && (tablero[1][0] == JUGADOR) && (tablero[2][0] == JUGADOR)
    ||
      (tablero[0][1] == JUGADOR) && (tablero[1][1] == JUGADOR) && (tablero[2][1] == JUGADOR)
    ||
      (tablero[0][2] == JUGADOR) && (tablero[1][2] == JUGADOR) && (tablero[2][2] == JUGADOR)
    ||
      (tablero[0][0] == JUGADOR) && (tablero[1][1] == JUGADOR) && (tablero[2][2] == JUGADOR)
    ||
      (tablero[0][2] == JUGADOR) && (tablero[1][1] == JUGADOR) && (tablero[2][0] == JUGADOR)
      );
    
      if (!jugadorGana && (movimientos < 9)) {
        //le toca al ordenador//
        do {
          
          fila = (int)(Math.random()*3);
          columna = (int)(Math.random()*3);
          
        } while (!tablero[fila][columna].equals(" "));
        
        tablero[fila][columna] = ORDENADOR;
        movimientos ++;
        
        //Pintamos el tablero con jugada ordenador//
        System.out.println("\n-------------");
        Thread.sleep(2000);
        
        for (int y = 0; y < 3; y++) {
          
          for (int x = 0; x < 3; x++) {
          
            if (tablero[y][x] == ORDENADOR) {
              
              
              System.out.printf("|%2s ", ORDENADOR);
              
            }
            
            else if (tablero[y][x] == JUGADOR) {
              
              System.out.printf("|%2s ", JUGADOR);
              
            }
            
            else {
              
              System.out.printf("|%2s ", " ");
              
            }
          }
          
          System.out.println("|\n-------------");
          
        }
        
        //Comprobamos si gana el ordenador//
          ordenadorGana = (
          (tablero[0][0] == JUGADOR) && (tablero[0][1] == JUGADOR) && (tablero[0][2] == JUGADOR)
        || 
          (tablero[1][0] == JUGADOR) && (tablero[1][1] == JUGADOR) && (tablero[1][2] == JUGADOR)
        ||
          (tablero[2][0] == JUGADOR) && (tablero[2][1] == JUGADOR) && (tablero[2][2] == JUGADOR)
        ||
          (tablero[0][0] == JUGADOR) && (tablero[1][0] == JUGADOR) && (tablero[2][0] == JUGADOR)
        ||
          (tablero[0][1] == JUGADOR) && (tablero[1][1] == JUGADOR) && (tablero[2][1] == JUGADOR)
        ||
          (tablero[0][2] == JUGADOR) && (tablero[1][2] == JUGADOR) && (tablero[2][2] == JUGADOR)
        ||
          (tablero[0][0] == JUGADOR) && (tablero[1][1] == JUGADOR) && (tablero[2][2] == JUGADOR)
        ||
          (tablero[0][2] == JUGADOR) && (tablero[1][1] == JUGADOR) && (tablero[2][0] == JUGADOR)
          );
      }
    }
    
    if (jugadorGana) {
      
      System.out.println("\nEnhorabuena has ganado!");
      
    }
    
    else if (ordenadorGana) {
      
      System.out.println("\nGana el ordenador.");
      
    }
    
    else {
     
     System.out.println("\nEmpate. No gana nadie.");
      
    }
  }
}
