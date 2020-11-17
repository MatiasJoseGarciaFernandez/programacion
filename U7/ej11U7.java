public class ej11U7 {
  public static void main(String[] args) {
    int[]num= new int[10];
    int[]primo= new int[10];
    int[]noprimo= new int[10];
    int primos=0;
    int noprimos=0;
    boolean esprimo= false;
    
    System.out.println("dame un total de 10 numeros: ");
    for(int i=0; i<10; i++) {
      num[i]= Integer.parseInt (System.console().readLine());
      esprimo=true;
      for(int j=2; j<num[i]-1;j++) {
        if(num[i] % j==0) {
          esprimo=false;
        }
      }
      
      if(esprimo) {
        primo[primos++]= num[i];
      }else {
        noprimo[noprimos++]= num[i];
      }
    }
    
    
    System.out.println("Array original");
    System.out.println("\n--------------------------------------------------------------");
    System.out.print("| indice ");
    for(int i=0; i<10; i++) {
      System.out.printf("|%4d", i);
    }
    System.out.println("\n--------------------------------------------------------------");
    System.out.print("| valor ");
    for(int i=0; i<10;i++) {
      System.out.printf("|%4d", num[i]);
    }
    System.out.println("\n--------------------------------------------------------------");
    
    for(int i=0; i<primos; i++) {
      num[i] = primo[i];
    }
    
    for(int i=primos; i<primos+noprimos; i++) {
      num[i]= noprimo[i-primos];
    }
    System.out.println("Array final");
    System.out.println("\n--------------------------------------------------------------");
    System.out.print("| indice ");
    for(int i=0; i<10; i++) {
      System.out.printf("|%4d", i);
    }
    System.out.println("\n--------------------------------------------------------------");
    System.out.print("| valor ");
    for(int i=0; i<10;i++) {
      System.out.printf("|%4d", num[i]);
    }
    System.out.println("\n--------------------------------------------------------------");
  }
}
