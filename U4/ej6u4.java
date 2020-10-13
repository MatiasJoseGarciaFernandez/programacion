public class ej6u4 {
  final static double g = 9.81;
  public static void main(String[] args) {
    System.out.println("calculo de cuanto tarda un objeto en caer");
    System.out.print("dame la altura : ");
    double a = Double.parseDouble(System.console().readLine());
    double result= Math.sqrt(2*a/g);
    if (a > 0) {
      System.out.println( "t = " +result);
    }
    
    if (a <= 0) {
      System.out.println("el objeto se encuentra ya en suelo");
    }
  }
}
