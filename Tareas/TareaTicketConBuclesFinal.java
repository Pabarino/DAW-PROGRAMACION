import java.util.Scanner;

public class TareaTicketConBuclesFinal {
  
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
  
    System.out.print("\nCuantos articulos vas a registrar: ");
    double articulos = s.nextInt();
    
    double rep = 0;
    double totalTConIva = 0;
    double totalTSinIva = 0;
    double ivaTotal = 0;
    String a, b, c, d, e, f, g, h;
    String ticket = " ";
    
    do {
      
      System.out.println("\nIntroduce el nombre del producto.");
      System.out.print("Nombre: ");
      String nombre = s.next();
      System.out.println("\nIntroduce la cantidad del producto.");
      System.out.print("Cantidad: ");
      double cantidad = s.nextInt();
      System.out.println("\nIntroduce el precio del producto.");
      System.out.print("Precio: ");
      double precio = s.nextInt();
      System.out.println("\nIntroduce el tipo de iva del producto.");
      System.out.print("IVA (%): ");
      double ivaP = s.nextInt();
      
      double iva = ((precio/100)*ivaP);
      double ivaT = iva*cantidad;
      double totalConIva = (precio+iva)*cantidad;
      double totalSinIva = precio*cantidad;
      
      a = String.format("\n--------------------------------------");
      b = String.format("\nNombre: %17s",nombre);
      c = String.format("\nCantidad: %12.0f",cantidad);
      d = String.format("\nPrecio Individual: %6.2f$",precio);
      e = String.format("\nIva Indiv.: %13.2f$",iva);
      f = String.format("\nIva Total: %14.2f$",ivaT);
      g = String.format("\nTotal: %18.2f$",totalConIva);
      h = String.format("\n--------------------------------------");
      
      ticket = (ticket + (a + b + c + d + e + f + g + h));
      totalTConIva = totalTConIva + totalConIva;
      totalTSinIva = totalTSinIva + totalSinIva;
      ivaTotal = ivaTotal + ivaT;
      rep++;
      
      System.out.println("\n--------------------------------------");
      
    } while (rep < articulos );
    
    System.out.println("\n------------TICKET COMPRA-------------");
    System.out.println(ticket);
    System.out.println("\n--------------------------------------");
    System.out.printf("TOTAL SIN IVA: %8.2f$",totalTSinIva);
    System.out.printf("\nTOTAL IVA: %12.2f$",ivaTotal);
    System.out.printf("\nTOTAL: %16.2f$",totalTConIva);
    System.out.println("\n--------------------------------------");
    
  }
}
      
      
      
      
