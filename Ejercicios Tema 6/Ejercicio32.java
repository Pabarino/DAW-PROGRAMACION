import java.util.Scanner;

public class Ejercicio32 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduce la longitud del sendero en metros. ");
    System.out.print("Longitud: ");
    int longitud = s.nextInt();
    
    int espacio = 4;
    int izquierda = 20;
    String obstaculo = "";
    
    System.out.println();
    
    for (int x = 0; x < longitud; x++) {
      
      int posicionIzq = (int)(Math.random()*3) + 1;
      int posicionPlanta = (int)(Math.random()*4) + 1;
      int posicionPiedra = (int)(Math.random()*4) + 1;
      int obstaculoNum = (int)(Math.random()*4) + 1;
      
      //aclaramos la direccion del sendero//
      switch (posicionIzq) {
        
        case 1:
        izquierda ++;
        break;
        
        case 2:
        izquierda = izquierda;
        break;
        
        case 3:
        izquierda --;
        break;
        
        default:
        
      }
      
      //vemos si hay un obstaculo, y si lo hay que tipo de obstaculo es//
      switch (obstaculoNum) {
        
        case 1:
        obstaculo = "piedra";
        break;
        
        case 2:
        obstaculo = "planta";
        break;
        
        case 3:
        case 4:
        break;
        
        
        default:
        
      }
      
      //pintamos el sendero//
      for (int j = 0; j < izquierda; j++) {
        
        System.out.print(" ");
        
      }
        
      System.out.print("|");
      
      //pintamos el espacio y los obstaculos//
      for (int i = 0; i < espacio; i++) {
        
        if (obstaculo.equals("planta")) {
          
          if (i == posicionPlanta) {
            
            System.out.print("*");
            
          }
          
          else {
            
            System.out.print(" ");
            
          }
        }
        
         else if (obstaculo.equals("piedra")) {
          
          if (i == posicionPiedra) {
            
            System.out.print("O");
            
          }
          
          else {
            
            System.out.print(" ");
            
          }
        }
        
        //si no hay un obstaculo simplemente pintamos espacios toda la linea//
        else {
          
          System.out.print(" ");
        
        }
      }
      
      System.out.println("|");
      
    }
  }
}
