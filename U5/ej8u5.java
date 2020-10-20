public class ej8u5 {
  public static void main (String[] args) {
    int num;
    int veces;
    System.out.println("¿que numero quieres que te multiplique?");
    num = Integer.parseInt (System.console().readLine());
    System.out.println("¿hasta cuanto quieres multiplicarlo?");
    veces = Integer.parseInt (System.console().readLine());
    for (int i= 1; i<=veces; i++) {
      System.out.println(num+ " por " +i+ " es " +num*i );
    }
  }
}
