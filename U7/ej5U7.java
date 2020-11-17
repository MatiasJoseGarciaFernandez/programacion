public class ej5U7 {
  public static void main(String[] args) {
    int[]num= new int[10];
    int min= Integer.MIN_VALUE;
    int max= Integer.MAX_VALUE;
    
    System.out.println("Dame 10 numeros enteros");
    
    for(int i=0; i<10; i++) {
      num[i]= Integer.parseInt (System.console().readLine());
      if(num[i] < min) {
        min=num[i];
      }
      if(num[i]>max) {
        max=num[i];
      }
    }
    
    System.out.println();
    
    for(int i=0; i<10; i++) {
      System.out.print(num[i]);
      if(num[i]== max) {
        System.out.print(" maximo");
      }
      if(num[i]==min) {
        System.out.print(" minimo");
      }
      System.out.println();
    }
  }
}
