import java.util.Scanner;

public class Ejercicio28 { 
  
   public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
     
     System.out.println("\nA continuacion tienen el juego piedra, papel y tijera: ");
     System.out.print("\nTurno del jugador 1 (introduzca piedra, papel o tijera): ");
     String player1 = s.next();
     System.out.print("\nTurno del jugador 2 (introduzca piedra, papel o tijera): "); ;
     String player2 = s.next();
     
     int variable1, variable2;
    
    switch (player1) {
      
      case "piedra":
      
      if (player2.equals("tijera")) {
        System.out.println("\nGana el jugador 1.");
        break;
      }
        
      else if (player2.equals("piedra")) {
        System.out.println("\nEmpate.");
        break;
      }
        
      else if (player2.equals("papel")) {
        System.out.println("\nGana el jugador 2.");
        break;
      }
        
      case "papel":
      
      if (player2.equals("tijera")) {
        System.out.println("\nGana el jugador 2.");
        break;
      }
        
      else if (player2.equals("piedra")) {
        System.out.println("\nGana el jugador 1.");
        break;
      }
        
      else if (player2.equals("papel")) {
        System.out.println("\nEmpate.");
        break;
      }
      
      case "tijera":
      
      if (player2.equals("tijera")) {
        System.out.println("\nEmpate.");
        break;
      }
        
      else if (player2.equals("piedra")) {
        System.out.println("\nGana el jugador 2.");
        break;
      }
        
      else if (player2.equals("papel")) {
        System.out.println("\nGana el jugador 1.");
        break;
      }
      
      default:
      System.out.println("\nEl valor introducido no es valido");
    }
  }
}
    
    
