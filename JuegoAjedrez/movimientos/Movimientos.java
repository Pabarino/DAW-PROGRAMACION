package movimientos;

public class Movimientos {
  
  public static boolean MovimientoTorre (String tablero[][],String VACIO, boolean ilegal, int fila, int columna,int filaObjetivo,int columnaObjetivo, int x, int y) {
   
   
    if ((fila == filaObjetivo) && (columna == columnaObjetivo)) {
          
          System.out.print("\nTienes que mover la ficha.");
          return false;
          
        }
        
    else if (fila == filaObjetivo) {
          
      for (x = columna + 1; ((x < columnaObjetivo) && (!ilegal)); x++) {
        
        if (tablero[fila][x] != VACIO) {
          
          ilegal = true;
          System.out.print("\n\nMovimiento ilegal.");
          return false;
          
        }            
      }      
    }
    
    else if (columna == columnaObjetivo) {
          
      for (y = fila + 1; ((y < filaObjetivo) && (!ilegal)); y++) {
        
        if (tablero[columna][y] != VACIO) {
          
          ilegal = true;
          System.out.print("\n\nMovimiento ilegal.");
          return false;
        }            
      }
    }
    
   if (!ilegal) {
        
        tablero[filaObjetivo][columnaObjetivo] = tablero[fila][columna];
        tablero[fila][columna] = VACIO;
    }  
    
    return true;
     
  }
}
