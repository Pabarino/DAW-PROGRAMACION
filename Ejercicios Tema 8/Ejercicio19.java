import ConversorNumeros.ConversorNumeros;
import java.util.Scanner;

public class Ejercicio19 {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String num;
    String input;
    String convertir;
    
    boolean salir = false;
    
    long numero;
    long n = 0;
    
    System.out.print("\nQue tipo de numero quiere introducir (BINARIO, HEXA, DECIMAL o OCTAL): ");
    input = s.nextLine();
    System.out.print("\nIntroduzca el numero: ");
    num = s.nextLine();
    
    while (!salir) {
      
      System.out.print("\nQuiere convertir su numero a BINARIO, HEXA, DECIMAL o OCTAL?\n(Escriba S para salir): ");
      convertir = s.nextLine();
      
      switch (input.toLowerCase()){
        
        case "binario":
                    
          numero = Long.parseLong(num);
          
          if (convertir.toLowerCase().equals("decimal")) {
            
            num = ConversorNumeros.ADecimalFromBinario(numero) + "";
            
          }
          
          else if (convertir.toLowerCase().equals("hexa")) {
            
            n = ConversorNumeros.ADecimalFromBinario(numero);
            num = ConversorNumeros.AHexadecimal(n);
            
          }
          
          else if (convertir.toLowerCase().equals("octal")) {
            
            n = ConversorNumeros.ADecimalFromBinario(numero);
            num = ConversorNumeros.AOctal(n) + "";
            
          }
          
          else if (convertir.toLowerCase().equals("s")) {
            
            salir = true;
          }
        
        break;
        
        case "decimal":
          
          numero = Long.parseLong(num);
          
          if (convertir.toLowerCase().equals("binario")) {
            
            num = ConversorNumeros.ABinario(numero) + "";
            
          }
          
          else if (convertir.toLowerCase().equals("hexa")) {
            
            num = ConversorNumeros.AHexadecimal(numero);
            
          }
          
          else if (convertir.toLowerCase().equals("octal")) {
            
            num = ConversorNumeros.AOctal(numero) + "";
            
          }
          
          else if (convertir.toLowerCase().equals("s")) {
            
            salir = true;
          }          
        
        break;
        
        case "hexa":
          
          if (convertir.toLowerCase().equals("decimal")) {
            
            num = ConversorNumeros.ADecimalFromHexa(num) + "";
            
          }
          
          else if (convertir.toLowerCase().equals("binario")) {
            
            n = ConversorNumeros.ADecimalFromHexa(num);
            num = ConversorNumeros.ABinario(n) + "";
            
          }
          
          else if (convertir.toLowerCase().equals("octal")) {
            
            n = ConversorNumeros.ADecimalFromHexa(num);
            num = ConversorNumeros.AOctal(n) + "";
            
          }
          
          else if (convertir.toLowerCase().equals("s")) {
            
            salir = true;
          }
        
        break;
        
        case "octal":
          
          numero = Long.parseLong(num);
          
          if (convertir.toLowerCase().equals("decimal")) {
            
            num = ConversorNumeros.ADecimalFromOctal(numero) + "";
            
          }
          
          else if (convertir.toLowerCase().equals("hexa")) {
            
            n = ConversorNumeros.ADecimalFromOctal(numero);
            num = ConversorNumeros.AHexadecimal(n);
            
          }
          
          else if (convertir.toLowerCase().equals("binario")) {
            
            n = ConversorNumeros.ADecimalFromOctal(numero);
            num = ConversorNumeros.ABinario(n) + "";
            
          }
          
          else if (convertir.toLowerCase().equals("s")) {
            
            salir = true;
          }
        
        break;
        
        default:
        break;     
      }
      
      if (convertir.toLowerCase().equals("s")) {
            
            salir = true;
      }
      
      else {
      
        input = convertir;
     
        System.out.println("\nConversion: "+ num);
      }
        
        
    } 
  }
}
    
