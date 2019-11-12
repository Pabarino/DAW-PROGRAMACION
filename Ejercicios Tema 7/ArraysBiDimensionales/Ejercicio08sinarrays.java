import java.util.Scanner;

public class Ejercicio08sinarrays {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    int columna = 0;
    
    //Pedimos la posicion del alfil//
    System.out.println("Introduce la posicion del alfil.");
    System.out.print("Fila (1-8): ");
    int fila = s.nextInt();
    System.out.print("Columna (a-h): ");
    char c = s.next().charAt(0); 
    
    //Convertimos la letra a un entero para la posicion de la columna//
    switch (c) {
      
      case 'a':
      columna = 0;
      break;
      
      case 'b':
      columna = 1;
      break;
      
      case 'c':
      columna = 2;
      break;
      
      case 'd':
      columna = 3;
      break;
      
      case 'e':
      columna = 4;
      break;
      
      case 'f':
      columna = 5;
      break;
      
      case 'g':
      columna = 6;
      break;
      
      case 'h':
      columna = 7;
      break;
      
      default:
            
    }
    
    System.out.println("\nPosicions a las que puede saltar:");
    
    int filaAux = fila - 1;
    int columnaAux = columna;
    
    //Comprobamos en las cuatro direcciones//
       
    //Abajo a la izquierda//
    
    System.out.println("\nAbajo a la izquierda: ");
    
    while ((filaAux > 0) && (columnaAux > 0)) {
       
       filaAux --;
       columnaAux--;
       
      //Convertimos numero en char//
      switch (columnaAux) {
        
        case 0:
        c = 'a';
        break;
        
        case 1:
        c = 'b';
        break;
        
        case 2:
        c = 'c';
        break;
        
        case 3:
        c = 'd';
        break;
        
        case 4:
        c = 'e';
        break;
        
        case 5:
        c = 'f';
        break;
        
        case 6:
        c = 'g';
        break;
        
        case 7:
        c = 'h';
        break;
        
        default:
        
      }
      
      System.out.println((filaAux + 1) + "," + c);
      
    } 
     
    filaAux = fila - 1;
    columnaAux = columna;
     
     
     //Abajo a la derecha//
     
      System.out.println("\nAbajo a la derecha: ");
     
     while ((filaAux > 0) && (columnaAux < 8)) {
       
       filaAux --;
       columnaAux++;
       
      //Convertimos numero en char//
      switch (columnaAux) {
        
        case 0:
        c = 'a';
        break;
        
        case 1:
        c = 'b';
        break;
        
        case 2:
        c = 'c';
        break;
        
        case 3:
        c = 'd';
        break;
        
        case 4:
        c = 'e';
        break;
        
        case 5:
        c = 'f';
        break;
        
        case 6:
        c = 'g';
        break;
        
        case 7:
        c = 'h';
        break;
        
        default:
        
      }
      
      System.out.println((filaAux + 1) + "," + c);
      
    } 
     
    filaAux = fila - 1;
    columnaAux = columna;
     
     //Arriba a la izquierda//
     
      System.out.println("\nArriba a la izquierda: ");
     
     while ((filaAux < 8) && (columnaAux > 0)) {
       
       filaAux ++;
       columnaAux--;
       
      //Convertimos numero en char//
      switch (columnaAux) {
        
        case 0:
        c = 'a';
        break;
        
        case 1:
        c = 'b';
        break;
        
        case 2:
        c = 'c';
        break;
        
        case 3:
        c = 'd';
        break;
        
        case 4:
        c = 'e';
        break;
        
        case 5:
        c = 'f';
        break;
        
        case 6:
        c = 'g';
        break;
        
        case 7:
        c = 'h';
        break;
        
        default:
        
      }
      
      System.out.println((filaAux + 1) + "," + c);
      
    } 
     
    filaAux = fila - 1;
    columnaAux = columna;
     
    //Arriba a la derecha//
    
     System.out.println("\nArriba a la derecha: ");
    
    while ((filaAux < 8) && (columnaAux < 8)) {
       
       filaAux ++;
       columnaAux++;
       
      //Convertimos numero en char//
      switch (columnaAux) {
        
        case 0:
        c = 'a';
        break;
        
        case 1:
        c = 'b';
        break;
        
        case 2:
        c = 'c';
        break;
        
        case 3:
        c = 'd';
        break;
        
        case 4:
        c = 'e';
        break;
        
        case 5:
        c = 'f';
        break;
        
        case 6:
        c = 'g';
        break;
        
        case 7:
        c = 'h';
        break;
        
        default:
        
      }
      
      System.out.println((filaAux + 1) + "," + c);
      
    } 
  }
}
    
    
    
    
