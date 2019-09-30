import java.util.Scanner;

public class Ejercicio27 { 
  
   public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
     
     System.out.println("\nPorfavor introduzca el sabor de la tarta que quiere comprar: ");
     System.out.print("Sabor (manzana/chocolate/fresa): ");
     String sabor = s.next();
     System.out.print("\nQuiere nata?(si/no): "); ;
     String nata = s.next();
     System.out.print("\nQuiere ponerle un nombre?(si/no): "); 
     String nombre = s.next();
     
     double nataExtra, precio, nombreExtra, total;
     nataExtra = 0;
     nombreExtra = 0;
     precio = 0;
     
     switch (sabor) {
       
       case "manzana":
       System.out.printf("\nTarta de manzana: %13.2f €\n", 18.0);
       precio = 18;
       break;
       
       case "fresa":
       System.out.printf("\nTarta de fresa: %15.2f €\n", 16.0);
       precio = 16;
       break;
       
       case "chocolate":
       System.out.print("\nQue tipo de chocolate quiere? (negro/blanco): ");
       String choc = s.next();
       
       if (choc.equals("blanco")) { 
         System.out.printf("\nTarta de chocolate blanco: %.2f €\n", 15.0);
         precio = 15;
         break;
       }
         
       else if (choc.equals("negro")) {
         System.out.printf("\nTarta de chocolate negro: %.2f €\n", 14.0);
         precio = 14;
         break;
       }
       
       else {
         System.out.println("\nTipo de chocolate introducido no es valido.");
         break;
       }
         
       default:
       System.out.println("\nEl sabor elegido no es valido.");
       }
      
      switch (nata) {
        
        case "si":
        System.out.printf("Con nata: %21.2f €\n", 2.5);
        nataExtra = 2.5;
        break;
        
        case "no":
        System.out.printf("Sin nata: %21.2f €\n", 0.0);
        nataExtra = 0;
        break;
        
        default:
        System.out.println("Valor introducido  no es valido");
      }
      
      switch (nombre) {
        
        case "si":
        System.out.printf("Con nombre: %19.2f €\n", 2.75);
        nombreExtra = 2.75;
        break;
        
        case "no":
        System.out.printf("Sin nombre: %19.2f €\n", 0.0);
        nombreExtra = 0;
        break;
        
        default:
        System.out.println("Valor introducido  no es valido");
      }
      
      total= (precio + nombreExtra + nataExtra);
      System.out.printf("Total: %24.2f €.", total);
     
    }
  }
         
    

