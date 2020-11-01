public class ej25U5 {
  public static void main(String[] args) {
    int num;
    int div;
    int resultado=0;
    System.out.print("dame un numero y te lo muestro al reves: ");
    num= Integer.parseInt (System.console().readLine());
    do {
      div= num%10;
      resultado= resultado*10+num%10;
      num=num/10;
    } while(num !=0);
    System.out.println(resultado);
  }
}
