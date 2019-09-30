import java.util.Scanner;

public class Ejercicio07 {
  
  public static void main (String args[]) {
  Scanner s= new Scanner(System.in);
  
  System.out.print ("Introduce la base imponible: ");
  float facturaSinIva= s.nextFloat(); 
  float facturaConIva, iva;
  iva=(facturaSinIva/100)*21;
  facturaConIva= facturaSinIva+iva;
  
  System.out.println ("La factura total es de: " + facturaConIva);
  
  
  
  
  }
}

