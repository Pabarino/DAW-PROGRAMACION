import java.util.Scanner;

public class Ejercicio23 { 
  
   public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
     
     System.out.print("\nPor favor, introduzca la base imponible: "); 
     float baseI = s.nextFloat();
     System.out.print("\nIntroduzca el tipo de IVA (general, reducido o superreducido): "); 
     String ivaT = System.console().readLine();    
     System.out.print("\nIntroduzca el código promocional (nopro, mitad, meno5 o 5porc): "); 
     String promo = System.console().readLine(); 
     
     float iva,  precioF, promoC;
     float ivaP = 0;
     
     switch(ivaT) { 
     
     case "general":
     ivaP = 21; 
     break; 
     
     case "reducido":
     ivaP = 10; 
     break; 
     
     case "superreducido": 
     ivaP = 4; 
     break; 
     
     default: System.out.print("El tipo de iva introducido no es correcto.\n");
     }
     
     iva= (baseI/100)*ivaP;
     precioF= baseI + iva; 
     
     
     switch (promo) { 
     
     case "nopro":
     promoC = 0;
     
     if (ivaP == 4) {
     System.out.printf("\nBase imponible %10.2f \n", baseI);
     System.out.printf("IVA (" + ivaP + "%%) %14.2f \n", iva);
     System.out.printf("Precio con IVA %10.2f \n", precioF);
     System.out.printf("Côd. promo (nopro) %6.2f \n", promoC);
     System.out.printf("TOTAL %19.2f \n", (precioF+promoC));
     break; 
     }
     
     else {
     System.out.printf("\nBase imponible %10.2f \n", baseI);
     System.out.printf("IVA (" + ivaP + "%%) %13.2f \n", iva);
     System.out.printf("Precio con IVA %10.2f \n", precioF);
     System.out.printf("Côd. promo (nopro) %6.2f \n", promoC);
     System.out.printf("TOTAL %19.2f \n", (precioF+promoC));
     break; 
     }
     
     case "mitad":
     promoC = -(precioF/2);
     
     if (ivaP == 4) {
     System.out.printf("\nBase imponible %10.2f \n", baseI);
     System.out.printf("IVA (" + ivaP + "%%) %14.2f \n", iva);
     System.out.printf("Precio con IVA %10.2f \n", precioF);
     System.out.printf("Côd. promo (mitad) %6.2f \n", promoC);
     System.out.printf("TOTAL %19.2f \n", (precioF+promoC));
     break; 
     }
     
     else {
     System.out.printf("\nBase imponible %10.2f \n", baseI);
     System.out.printf("IVA (" + ivaP + "%%) %13.2f \n", iva);
     System.out.printf("Precio con IVA %10.2f \n", precioF);
     System.out.printf("Côd. promo (mitad) %6.2f \n", promoC);
     System.out.printf("TOTAL %19.2f \n", (precioF+promoC));
     break; 
     }
     
     case "meno5":
     promoC = -5;
     
     if (ivaP == 4) {
     System.out.printf("\nBase imponible %10.2f \n", baseI);
     System.out.printf("IVA (" + ivaP + "%%) %14.2f \n", iva);
     System.out.printf("Precio con IVA %10.2f \n", precioF);
     System.out.printf("Côd. promo (meno5) %6.2f \n", promoC);
     System.out.printf("TOTAL %19.2f \n", (precioF+promoC));
     break; 
     }
     
     else {
     System.out.printf("\nBase imponible %10.2f \n", baseI);
     System.out.printf("IVA (" + ivaP + "%%) %13.2f \n", iva);
     System.out.printf("Precio con IVA %10.2f \n", precioF);
     System.out.printf("Côd. promo (meno5) %6.2f \n", promoC);
     System.out.printf("TOTAL %19.2f \n", (precioF+promoC));
     break; 
     }
     
     case "5porc":
     promoC = -((precioF/100)*5);
     
     if (ivaP == 4) {
     System.out.printf("\nBase imponible %10.2f \n", baseI);
     System.out.printf("IVA (" + ivaP + "%%) %14.2f \n", iva);
     System.out.printf("Precio con IVA %10.2f \n", precioF);
     System.out.printf("Côd. promo (5porc) %6.2f \n", promoC);
     System.out.printf("TOTAL %19.2f \n", (precioF+promoC));
     break; 
     }
     
     else {
     System.out.printf("\nBase imponible %10.2f \n", baseI);
     System.out.printf("IVA (" + ivaP + "%%) %13.2f \n", iva);
     System.out.printf("Precio con IVA %10.2f \n", precioF);
     System.out.printf("Côd. promo (5porc) %6.2f \n", promoC);
     System.out.printf("TOTAL %19.2f \n", (precioF+promoC));
     break; 
     }
     
     default: System.out.print("El codigo promocional introducido no es correcto.");
     }
     
     } 
    }
