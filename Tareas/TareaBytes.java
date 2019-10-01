import java.util.Scanner;

public class TareaBytes {
  
  public static void main(String arg[]) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("\nIntroduce una cantidad de bytes");
    System.out.print("Bytes: ");
    long B = s.nextLong();
    
    long B1, B2, B3, GB, MB, KB, BD1, BD2, BD3;
    B1 = (B%1024);
    BD1 = (B1/1024);
    KB = ((B/1024)-BD1);
    B2 = (KB%1024);
    BD2 = (KB%1024)/1024;
    MB = ((KB/1024)-BD2);
    B3 = (MB%1024);    
    BD3 = (MB%1024)/1024;
    GB = ((MB/1024)-BD3);
    
    System.out.println("\n"+ B + " bytes es equivalente a: \n"); 
    System.out.println(KB + " kilobytes con " + (B1) +" bytes.\n"); 
    System.out.println(MB + " megabytes con "+ (B2) +" kilobytes y "+ (B1) +" bytes.\n"); 
    System.out.println(GB + " gigabytes con "+ (B3) +" megabytes, "+ (B2) +" kilobytes y "+ (B1) +" bytes.\n"); 
    
   }
 }
