import java.util.Scanner;

public class Ejercicio29 {
  
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    
    String a = "";
    String b = "";
    String c = "";
    String d = "";
    String p = "| Primavera";
    String v = "Verano";
    String o = "Otoño";
    String i = "Invierno";
    String linea = "-----------------------------------------------";
    
    int minP = (int)(Math.random()*(14 - 10)) + 10;
    int minV = (int)(Math.random()*(22 - 19)) + 19;
    int minO = (int)(Math.random()*(19 - 12)) + 12;
    int minI = (int)(Math.random()*(9 - 8)) + 8;
    int maxP = (int)(Math.random()*(24 - 19)) + 19;
    int maxV = (int)(Math.random()*(30 - 27)) + 27;
    int maxO = (int)(Math.random()*(28 -20)) + 20;
    int maxI = (int)(Math.random()*(18 - 16)) + 16;
    
    int pP = (int)(Math.random()*(5)) + 1;
    switch (pP) {
      
      case 1:
      a = "nublado";
      break;
      
      case 2:
      a = "nublado";
      break;
      
      case 3:
      a = "soleado";
      break;
      
      case 4:
      a = "soleado";
      break;
      
      case 5:
      a = "soleado";
      break;
      
    }
    
    int pV = (int)(Math.random()*(5)) + 1;
    switch (pV) {
      
      case 1:
      b = "nublado";
      break;
      
      case 2:
      b = "soleado";
      break;
      
      case 3:
      b = "soleado";
      break;
      
      case 4:
      b = "soleado";
      break;
      
      case 5:
      b = "soleado";
      break;
      
    }
    
    int pO = (int)(Math.random()*(5)) + 1;
    switch (pO) {
      
      case 1:
      c = "nublado";
      break;
      
      case 2:
      c = "nublado";
      break;
      
      case 3:
      c = "nublado";
      break;
      
      case 4:
      c = "soleado";
      break;
      
      case 5:
      c = "soleado";
      break;
      
    }
    
    int pI = (int)(Math.random()*(5)) + 1;
    switch (pI) {
      
      case 1:
      d = "nublado";
      break;
      
      case 2:
      d = "nublado";
      break;
      
      case 3:
      d = "nublado";
      break;
      
      case 4:
      d = "nublado";
      break;
      
      case 5:
      d = "soleado";
      break;
      
    }
    
    
    System.out.printf("\n%79s", linea);
    System.out.printf("\n%43s |%8s  |%8s  |%10s |", p, v, o, i);
    System.out.printf("\n-------------------------------------------------------------------------------");
    System.out.printf("\n|Temperatura minima absoluta    |%10s |%8s  |%8s  |%10s |", minP, minV, minO, minI);
    System.out.printf("\n-------------------------------------------------------------------------------");
    System.out.printf("\n|Temperatura maxima absoluta    |%10s |%8s  |%8s  |%10s |", maxP, maxV, maxO, maxI);
    System.out.printf("\n-------------------------------------------------------------------------------");
    System.out.printf("\n|Probabilidad de soleado-nublado|%10s |%8s  |%8s  |%10s |", a, b, c, d);
    System.out.printf("\n-------------------------------------------------------------------------------");
     
     
  }
}
