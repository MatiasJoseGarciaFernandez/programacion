public class ej23U5 {
  public static void main(String[] args) {
    int num;
    int contador=0;
    int suma=0;
    
    System.out.println("introduce numeros, te los sumare y te hare la media: ");
    do {
      num= Integer.parseInt (System.console().readLine());
      contador++;
      suma += num;
    } while (suma< 10000);
    System.out.println("hay un total de " +contador+ " numeros y la media es " +(suma-num)/(contador-1));
  }
}
