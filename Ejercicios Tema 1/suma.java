public class suma {
  
  public static void main (String [] args) { 
    
    float numero1;
    float numero2;
    
    numero1=(float)2.4;
    numero2=(float)5.6;
    
    float resultado;

    resultado= numero1+numero2;
    
    //System.out.println("El resultado de la suma es "+numero1+" y "+numero2+" es:")
    System.out.printf("El resultado de la suma es %f y %f es:\n", numero1, numero2);
    //System.out.println(resultado);
    System.out.printf("%.2f", resultado);
  
}
}
