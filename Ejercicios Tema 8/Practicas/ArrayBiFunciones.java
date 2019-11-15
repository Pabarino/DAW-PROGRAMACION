import matematicas.Varios;

public class ArrayBiFunciones {
  public static void main(String[] args) {
    
    int[][] n = new int[6][9];
    
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 9; j++) {
        n[i][j] = (int)(Math.random()*100000);
      }
    }
    
    muestraArrayIntBi(n);
  }
  
  public static int filasArrayIntBi(int x[][]) {
    return x.length;
  }
  
  public static int columnasArrayIntBi(int x[][]) {
    return x[0].length;
  }
  
  public static int maximoArrayIntBi(int x[][]) {
    
    int maximo = Integer.MIN_VALUE;
    
    for (int f = 0; f < filasArrayIntBi(x); f++) {
      for (int c = 0; c < columnasArrayIntBi(x); c++) {
        if (x[f][c] > maximo) {
          maximo = x[f][c];
        }
      }
    }
    return maximo;
  }
    
  public static void muestraArrayIntBi(int x[][]) {
      
    String formatoNumero = "%" + matematicas.Varios.digitos(maximoArrayIntBi(x)) + "d";
      
    for (int f = 0; f < filasArrayIntBi(x); f++) {
      for (int c = 0; c < columnasArrayIntBi(x); c++) {
        System.out.printf(formatoNumero + " ", x[f][c]);
      }
    System.out.println();
    
    }
  }
}
      

