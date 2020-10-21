public class ej17u5 {
  public static void main(String[] args) {
    int n;
    System.out.println("dame un numero al que quieras sumarle sus 100 siguientes valores");
    n= Integer.parseInt (System.console().readLine());
    for (int i= 1; i<=100; i++) {
      System.out.println(n+i);
    }
  }
}
