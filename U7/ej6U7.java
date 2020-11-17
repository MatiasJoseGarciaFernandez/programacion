public class ej6U7 {
  public static void main(String[] args) {
    int[]num=new int[15];
    
    
    System.out.println("dame un total de 15 numeros");
    for(int i=0; i<15;i++) {
      num[i]= Integer.parseInt (System.console().readLine());
    }
    int aux=num[14];
    for(int i=14; i>0; i--) {
      num[i]= num[i-1];
    }
    num[0]=aux;
    
    System.out.println("numeros rotados: ");
    for(int i=0; i<15; i++) {
      System.out.print(num[i]+ " ");
    }
  }
}
    
    
