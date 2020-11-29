public class ej12U7 {
  public static void main(String[] args) {
    int[]num= new int[10];
    int[]resultado= new int[10];
    int primero;
    int ultimo;
    boolean valido;
    
    
    System.out.println("dame un total de 10 numeros: ");
    for(int i=0; i<10; i++) {
      num[i]= Integer.parseInt (System.console().readLine());
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
    
    do {
      valido= true;
      
      System.out.print("introduce la primera posición(del 0 al 9): ");
      primero= Integer.parseInt (System.console().readLine());
      if((primero<0)||(primero>9)){
        System.out.println("ese numero no me vale, ponmelo bien");
        valido=false;
      }
      
      System.out.print("introduce la ultima posición(del 0 al 9): ");
      ultimo= Integer.parseInt (System.console().readLine());
      if((ultimo<0)||(ultimo>9)){
        System.out.println("ese numero no me vale, ponmelo bien");
        valido=false;
      }
      
      if(primero>=ultimo) {
        System.out.println("tampoco me vale, el primero debe ser mas pequeño que el ultimo");
        valido=false;
      }
    }while(!valido);
    
    for(int i=0;i <10;i++) {
      resultado[i]=num[i];
    }
    resultado[ultimo]=num[primero];
    
    for(int i=ultimo+1; i<10; i++) {
      resultado[i]=num[i-1];
    }
    resultado[0]= num[9];
    
    for(int i=0; i<primero; i++) {
      resultado[i+1]= num[i];
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
      System.out.printf("|%4d", resultado[i]);
    }
    System.out.println("\n--------------------------------------------------------------");

      
    
  
  
  }
}
