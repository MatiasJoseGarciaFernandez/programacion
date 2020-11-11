public class ej1U6 {
  public static void main(String[] args) {
    int suma=0;
    int tirada;
    System.out.print("tirada de tres dados y suma total ");
    
    for(int i=1; i<=3; i++) {
      tirada=(int)(Math.random()*6)+1;
      System.out.print(tirada + " ");
      suma+=tirada;
    }
    System.out.println();
    System.out.println("el total de la suma es: " +suma);
  }
}
