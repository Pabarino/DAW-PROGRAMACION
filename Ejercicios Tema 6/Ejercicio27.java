import java.util.Scanner;

public class Ejercicio27 {
  
  public static void main (String args []) {
    Scanner s= new Scanner(System.in);
    
    System.out.print("\nTurno del jugador (introduzca piedra, papel o tijeras): ");
    String tirada = s.nextLine();
    
    String tiradaOrdenador = " ";
    
    int ordenador = (int)(Math.random()*(3)) + 1;
    
    switch (ordenador) {
      
      case 1:
      tiradaOrdenador = "piedra";
      break;
      
      case 2:
      tiradaOrdenador = "papel";
      break;
      
      case 3:
      tiradaOrdenador = "tijera";
      break;
      
    }
    
    System.out.println("Turno del ordenador: "+ tiradaOrdenador);
    
    
    switch (tirada) {
      
      case "piedra":
        
        if (ordenador == 1) {
          System.out.println("\nEmpate.");
        }
        
        else if (ordenador == 2) {
          System.out.println("\nGana el ordenador.");
        }
        
        else {
          System.out.println("\nGana el jugador.");
        }
        
      break;
      
      case "papel":
      
      if (ordenador == 1) {
          System.out.println("\nGana el jugador.");
        }
        
        else if (ordenador == 2) {
          System.out.println("\nEmpate.");
        }
        
        else {
          System.out.println("\nGana el ordenador.");
        }
        
      break;
      
      case "tijeras":
      
      if (ordenador == 1) {
          System.out.println("\nGana el ordenador.");
        }
        
        else if (ordenador == 2) {
          System.out.println("\nGana el jugador.");
        }
        
        else {
          System.out.println("\nEmpate.");
        }
        
      break;
      
      default:
      System.out.println("El valor introducido no es valido.");
      break;
      
    }
  }
}
