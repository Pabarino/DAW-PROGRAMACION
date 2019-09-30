import java.util.Scanner;

public class Ejercicio26 { 
  
   public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
     
     System.out.println("\nPorfavor introduzca la cantidad de entradas que quiere comprar: ");
     System.out.print("Numero de entradas: ");
     double entradas = s.nextDouble();
     System.out.println("\nPorfavor introduzca el dia de la semana (ej.lunes): "); 
     System.out.print("Dias: ");
     String dias = s.next();
     System.out.print("\nTiene tarjeta CineCampa?(s/n): "); 
     String tarjeta = s.next(); 
     
     double precioEntradas, precioF, descuento, parejas, entradas1, precioParejas, precioIndiv;
     
     switch (dias) {
       
       case ("miercoles"):
       entradas1 = entradas;
       precioEntradas = entradas*5;
       
       if (tarjeta.equals("s")) {
         descuento = precioEntradas*0.1;
         precioF = precioEntradas - descuento;
         System.out.println("\nAqui tiene sus entradas. Gracias por su compra.");
         System.out.printf("Entradas individuales %10d \n", (int)entradas1);
         System.out.printf("Precio por entrada individual  %1.2f € \n", 5.00);
         System.out.printf("Total %29.2f € \n", precioEntradas);
         System.out.printf("Descuento %25.2f €\n", descuento);
         System.out.printf("A pagar: %26.2f €\n", precioF);
         break;
       }
       
       else if (tarjeta.equals("n")) {
         descuento = 0.00;
         precioF = precioEntradas - descuento;
         System.out.println("\nAqui tiene sus entradas. Gracias por su compra.");
         System.out.printf("Entradas individuales %10d \n", (int)entradas1);
         System.out.printf("Precio por entrada individual  %1.2f € \n", 5.00);
         System.out.printf("Total %29.2f € \n", precioEntradas);
         System.out.printf("Descuento %25.2f €\n", descuento);
         System.out.printf("A pagar: %26.2f €\n", precioF);
         break;
       }
     
       case ("jueves"):
       parejas = entradas%2;
       entradas1 = (entradas-parejas)/2;
       precioParejas = entradas1*11;
       precioIndiv = parejas*8;
       precioEntradas = (precioIndiv+precioParejas);
       
       if (tarjeta.equals("s")) {
         descuento = precioEntradas*0.1;
         precioF = precioEntradas - descuento;
         System.out.println("\nAqui tiene sus entradas. Gracias por su compra.");
         System.out.printf("Entradas de parejas %12d \n", (int)entradas1);
         System.out.printf("Precio por entrada de pareja  %2.2f € \n", 11.00);
         System.out.printf("Entradas individuales %10d \n", (int)parejas);
         System.out.printf("Precio por entrada individual  %1.2f € \n", 8.00);
         System.out.printf("Total %29.2f € \n", precioEntradas);
         System.out.printf("Descuento %25.2f €\n", descuento);
         System.out.printf("A pagar: %26.2f €\n", precioF);
         break;
       }
       
       else if (tarjeta.equals("n")) {
         descuento = 0.00;
         precioF = precioEntradas - descuento;
         System.out.println("\nAqui tiene sus entradas. Gracias por su compra.");
         System.out.printf("Entradas de parejas %12d \n", (int)entradas1);
         System.out.printf("Precio por entrada de pareja  %2.2f € \n", 11.00);
         System.out.printf("Entradas individuales %10d \n", (int)parejas);
         System.out.printf("Precio por entrada individual  %1.2f € \n", 8.00);
         System.out.printf("Total %29.2f € \n", precioEntradas);
         System.out.printf("Descuento %25.2f €\n", descuento);
         System.out.printf("A pagar: %26.2f €\n", precioF);
         break;
       }
       
       default:
       entradas1 = entradas;
       precioEntradas = entradas*8;
       
       if (tarjeta.equals("s")) {
         descuento = precioEntradas*0.1;
         precioF = precioEntradas - descuento;
         System.out.println("\nAqui tiene sus entradas. Gracias por su compra.");
         System.out.printf("Entradas individuales %10d \n", (int)entradas1);
         System.out.printf("Precio por entrada individual  %1.2f € \n", 8.00);
         System.out.printf("Total %29.2f € \n", precioEntradas);
         System.out.printf("Descuento %25.2f €\n", descuento);
         System.out.printf("A pagar: %26.2f €\n", precioF);
         
       }
       
       else if (tarjeta.equals("n")) {
         descuento = 0.00;
         precioF = precioEntradas - descuento;
         System.out.println("\nAqui tiene sus entradas. Gracias por su compra.");
         System.out.printf("Entradas individuales %10d \n", (int)entradas1);
         System.out.printf("Precio por entrada individual  %1.2f € \n", 8.00);
         System.out.printf("Total %29.2f € \n", precioEntradas);
         System.out.printf("Descuento %25.2f €\n", descuento);
         System.out.printf("A pagar: %26.2f €\n", precioF);
         
       }
       
       
       
       
     }
     
     
     
     
   }
 }
         
       
       
     
     
      
