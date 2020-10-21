public class ej14u5 {
  public static void main(String[] args) {
    int b;
    int e;
    int valor=0;
    System.out.println("potencia de un numero");
    System.out.println("dame la base");   
    b= Integer.parseInt (System.console().readLine());
    System.out.println("dame el exponente");
    e= Integer.parseInt (System.console().readLine());
     for (int i= 1; i<=e; i++) {
      if( i== 1) {
        valor = b;
      } else {
        valor= b * valor;
      }
    }
    System.out.println(b + "^" +e+ " da " +valor);
  }
}
