import java.util.Scanner;

public class Ejercicio24 { 
  
   public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
     
     System.out.println("\nPorfavor elige tu cargo de los siguientes: ");
     System.out.println("\n1-Programador junior. ");
     System.out.println("2-Programador senior. ");
     System.out.println("3-Jefe de proyecto. "); 
     System.out.print("\nCargo (1-3): ");
     int cargo = s.nextInt();
     System.out.println("\n¿Cuàntos dìas ha estado de viaje visitando clientes?"); 
     System.out.print("Dias: ");
     float dias = s.nextFloat();
     System.out.println("\nIntroduzca su estado civil (casado/soltero). ");     
     System.out.print("Estado: ");
     String estado = System.console().readLine(); 

     float sueldo, extra, total, resta;
     sueldo = 0;
     
     
     switch(cargo) { 
     
     case 1:
     sueldo = 950; 
     break; 
     
     case 2:
     sueldo = 1200; 
     break; 
     
     case 3: 
     sueldo = 1600; 
     break; 
     
     default: System.out.print("\nEl numero introducido no es valido.\n");
     }
     
     extra = dias*30;
     
     if ((dias <= 31) && (dias >= 0)) {
     
     switch(estado) { 
     
     case "soltero":
     resta= ((sueldo + extra)/100)*25;
     
     if (dias < 10) {
     System.out.printf("\n-----------------------------------\n");
     System.out.printf("| Sueldo base %19.2f |\n", sueldo); 
     System.out.printf("| Dietas ("+ dias +" viajes) %11.2f |\n", extra);
     System.out.printf("|---------------------------------|\n");
     System.out.printf("| Sueldo bruto %18.2f |\n", sueldo+extra);
     System.out.printf("| Retenciòn IRPF (25%%) %10.2f |\n",resta);
     System.out.printf("|---------------------------------|\n");
     System.out.printf("| Sueldo neto %19.2f |\n", ((sueldo+extra)-resta));
     System.out.printf("-----------------------------------");
     break; 
     }
     
     else {
     System.out.printf("\n-----------------------------------\n");
     System.out.printf("| Sueldo base %19.2f |\n", sueldo); 
     System.out.printf("| Dietas ("+ dias +" viajes) %10.2f |\n", extra);
     System.out.printf("|---------------------------------|\n");
     System.out.printf("| Sueldo bruto %18.2f |\n", sueldo+extra);
     System.out.printf("| Retenciòn IRPF (25%%) %10.2f |\n",resta);
     System.out.printf("|---------------------------------|\n");
     System.out.printf("| Sueldo neto %19.2f |\n", ((sueldo+extra)-resta));
     System.out.printf("-----------------------------------");
     break;
     }
     
     
     case "casado":
     resta= ((sueldo + extra)/100)*20;
     
     if (dias < 10) {
     System.out.printf("\n-----------------------------------\n");
     System.out.printf("| Sueldo base %19.2f |\n", sueldo); 
     System.out.printf("| Dietas ("+ dias +" viajes) %11.2f |\n", extra);
     System.out.printf("|---------------------------------|\n");
     System.out.printf("| Sueldo bruto %18.2f |\n", sueldo+extra);
     System.out.printf("| Retenciòn IRPF (25%%) %10.2f |\n",resta);
     System.out.printf("|---------------------------------|\n");
     System.out.printf("| Sueldo neto %19.2f |\n", ((sueldo+extra)-resta));
     System.out.printf("-----------------------------------");
     break; 
     }
     
     else {
     System.out.printf("\n-----------------------------------\n");
     System.out.printf("| Sueldo base %19.2f |\n", sueldo); 
     System.out.printf("| Dietas ("+ dias +" viajes) %10.2f |\n", extra);
     System.out.printf("|---------------------------------|\n");
     System.out.printf("| Sueldo bruto %18.2f |\n", sueldo+extra);
     System.out.printf("| Retenciòn IRPF (25%%) %10.2f |\n",resta);
     System.out.printf("|---------------------------------|\n");
     System.out.printf("| Sueldo neto %19.2f |\n", ((sueldo+extra)-resta));
     System.out.printf("-----------------------------------");
     break;
     }
     
     default: System.out.print("El estado introducido no es valido.");
     }
    }
    
    else {
    System.out.println("\nNo es posible esta cantidad de dias.");
    }
    
  }
 }
