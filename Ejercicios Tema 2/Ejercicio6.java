public class Ejercicio6 {
  
  public static void main (String args[]) {
   
   double facturaConIva, facturaSinIva, iva;
   facturaSinIva=900;
   iva=(facturaSinIva/100)*21;
   facturaConIva= facturaSinIva+iva;
   
   System.out.println ("La factura es de " + facturaConIva +" euros.");
  }
}
