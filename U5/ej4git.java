public class ej4git {
  public static void main(String[] args) {
    int num;
    int start;
    int salto;
    System.out.println("cadena de numeros");
    System.out.print("introduce el valor mas alto: ");
    num= Integer.parseInt (System.console().readLine());
    System.out.print("introduce el valor mas bajo: ");
    start= Integer.parseInt (System.console().readLine());
    System.out.print("introduce el salto: ");
    salto= Integer.parseInt (System.console().readLine());
    for(int i=num; i>=start ; i-=salto) {
      if(i> start) {
        System.out.print(i+"-");
      } else {
        System.out.print(i);
      }
    }
  }
}
      
