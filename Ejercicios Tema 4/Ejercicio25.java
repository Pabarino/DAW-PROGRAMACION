import java.util.Scanner;

public class Ejercicio25 {
  
  public static void main (String args[]) {
    Scanner s= new Scanner(System.in);
    
     System.out.println("\nIntroduzca la altura de la bandera: ");
     System.out.print("Altura (cm): ");
     double altura = s.nextDouble();
     System.out.println("\nIntroduzca la anchura de la bandera: ");
     System.out.print("Anchura (cm): ");
     double ancho = s.nextDouble();
     System.out.println("\n¿Quieres un escudo bordado en la bandera?"); 
     System.out.print("(s/n): ");
     String escudo = s.next();
     
     double precioF, precio, medidas;
     medidas = altura*ancho;
     precio = medidas/100;
     
          
     switch (escudo) {
       
       case ("s"):
       precioF = precio + 2.5 + 3.25;
       System.out.println("\nGracias aqui tienes el desglose de su compra:");
       System.out.printf("Bandera de %d cm2 %14.2f€ \n", (int)medidas, precio);
       System.out.printf("Con escudo: %21.2f€ \n", 2.50);
       System.out.printf("Gastos de envìo: %16.2f€ \n", 3.25);
       System.out.printf("Total: %26.2f€\n", precioF);
       break;
       
       case ("n"):
       precioF = precio + 3.25;
       System.out.println("\nGracias, aqui tienes el desglose de su compra:");
       System.out.printf("Bandera de %d cm2 %14.2f€ \n", (int)medidas, precio);
       System.out.printf("Sin escudo: %21.2f€ \n", 0.0);
       System.out.printf("Gastos de envìo: %16.2f€ \n", 3.25);
       System.out.printf("Total: %26.2f€\n", precioF);
       break;
       
       
     }
       
  }
}


