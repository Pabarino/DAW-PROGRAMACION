import java.util.Scanner;

public class Ejercicio08 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    int[] temp = new int[12];
    String[] mes = new String[12];
    int num = 1;
    mes[0] = "Enero";
    mes[1] = "Febrero";
    mes[2] = "Marzo";
    mes[3] = "Abril";
    mes[4] = "Mayo";
    mes[5] = "Junio";
    mes[6] = "Julio";
    mes[7] = "Agosto";
    mes[8] = "Septiembre";
    mes[9] = "Octubre";
    mes[10] = "Noviembre";
    mes[11] = "Diciembre";
    
    System.out.println("\nIntroduce la temperatura media de cada mes del año");
    
    for (int i = 0; i < 12; i++) {
        
      System.out.print("\nTemperatura media de mes " + num + ": ");
      temp[i] = s.nextInt();
      num ++;
      
    }
      
      System.out.println("\n--------------------------" );
      System.out.printf("|%10s| |%11s|\n", "Meses", "Temperatura" );
      System.out.printf("|%10s| |%11s|\n", " ", "media" );
      System.out.println("--------------------------" );
        
    for (int i = 0; i < 12; i++) {
      
      System.out.printf("|%10s| |%4d grados|\n", mes[i],temp[i] );
      
    }
    
    System.out.println("--------------------------" );
    
  }
}
