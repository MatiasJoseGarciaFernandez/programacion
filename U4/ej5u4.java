import java.util.Scanner;
public class ej5u4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("este programa resuelve ecuaciones de primer grado ax + b = 0");
    System.out.print("dame el valor de a : ");
    double a = s.nextDouble();
    
    System.out.print("dame el valor de b : ");
    double b = s.nextDouble();
    
    double result = (-b / a);
    if (a != 0) {
      System.out.println( "x = " +result);
    }
    
    if (a == 0) {
      System.out.println("esa ecuacion no tiene solucion real");
    }
  }
}
