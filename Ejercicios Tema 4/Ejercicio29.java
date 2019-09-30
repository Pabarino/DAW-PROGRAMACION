import java.util.Scanner;

public class Ejercicio29 { 
  
   public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
     
     System.out.println("\nPorfavor introduzca su desayuno: ");
     System.out.print("Desayuno (palmera/donut/pitufo): ");
     String desayuno = s.next();
     System.out.print("\nQuiere zumo?(si/no): "); ;
     String zumo = s.next();
     System.out.print("\nQuiere cafe?(si/no): "); 
     String cafe = s.next();
     
     double zumoExtra, precio, cafeExtra, total;
     zumoExtra = 0;
     cafeExtra = 0;
     precio = 0;
     
     switch (desayuno) {
       
       case "palmera":
       System.out.printf("\nPalmera: %16.2f €\n", 1.4);
       precio = 1.4;
       break;
       
       case "donut":
       System.out.printf("\nDonut: %18.2f €\n", 1.0);
       precio = 1.0;
       break;
       
       case "pitufo":
       System.out.print("\nQue prefiere con su pitfuo? (con aceite/tortilla): ");
       String pitufo = s.next();
       
       if (pitufo.equals("aceite")) { 
         System.out.printf("\nPitufo con aceite: %.2f €\n", 1.2);
         precio = 1.2;
         break;
       }
         
       else if (pitufo.equals("tortilla")) {
         System.out.printf("\nPitufo con tortilla: %.2f €\n", 1.4);
         precio = 1.4;
         break;
       }
       
       else {
         System.out.println("\nEl pitufo introducido no es valido.");
         break;
       }
         
       default:
       System.out.println("\nEl desayuno elegido no es valido.");
       }
      
      switch (zumo) {
        
        case "si":
        System.out.printf("Con zumo: %15.2f €\n", 1.5);
        zumoExtra = 1.5;
        break;
        
        case "no":
        System.out.printf("Sin zumo: %15.2f €\n", 0.0);
        zumoExtra = 0;
        break;
        
        default:
        System.out.println("Valor introducido  no es valido");
      }
      
      switch (cafe) {
        
        case "si":
        System.out.printf("Con cafe: %15.2f €\n", 1.2);
        cafeExtra = 1.2;
        break;
        
        case "no":
        System.out.printf("Sin cafe: %15.2f €\n", 0.0);
        cafeExtra = 0;
        break;
        
        default:
        System.out.println("Valor introducido  no es valido");
      }
      
      total= (precio + cafeExtra + zumoExtra);
      System.out.printf("Total desayuno: %9.2f €.", total);
     
    }
  }
         
    


