import java.util.Scanner;

public class TareaTicketConBucles {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
  
    System.out.print("\nCuantos articulos vas a registrar: ");
    int articulos = s.nextInt();
    
    int rep = 0;
    int totalT = 0;
    
    do {
      
      System.out.println("\nIntroduce el nombre del producto.");
      System.out.print("Nombre: ");
      String nombre = s.next();
      System.out.println("\nIntroduce la cantidad del producto.");
      System.out.print("Cantidad: ");
      int cantidad = s.nextInt();
      System.out.println("\nIntroduce el precio del producto.");
      System.out.print("Precio: ");
      int precio = s.nextInt();
      
      int total = precio*cantidad;
      
      System.out.printf("\nNombre:              %s",nombre);
      System.out.printf("\nCantidad:            %d",cantidad);
      System.out.printf("\nPrecio Individual:   %d$",precio);
      System.out.printf("\nTotal:               %d$",total);
      System.out.println("\n--------------------------------------");
      
      totalT = totalT + total;
      rep++;
      
    } while (rep < articulos );
    
    System.out.println("\n--------------------------------------");
    System.out.printf("\nTOTAL:               %d$",totalT);
    System.out.println("\n--------------------------------------");
    
  }
}
      
      
      
      
      
