public class ej9U7 {
  public static void main(String[] args) {
    int[]num=new int[8];
    
    
    System.out.println("dame un total de 8 numeros enteros, pulsa INTRO para introducir los siguientes");
    for(int i=0; i<8; i++) {
      num[i]= Integer.parseInt (System.console().readLine());
    }
    for(int i=0; i<8; i++) {
      if((num[i]%2)==0) {
        System.out.println(num[i]+ " par");
      } else {
        System.out.println(num[i]+ " impar");
      }
    }
  }
}
