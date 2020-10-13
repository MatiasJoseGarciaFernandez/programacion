import java.util.Scanner;
public class ej12u3 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("introducir primera nota y la deaseada en el trimestre: ");
    double n1= s.nextDouble();
    double n2= s.nextDouble();
   
    
    double ex2= (n2-n1*0.4)/0.6;
    System.out.print("tienes que sacar en el segundo examen " +ex2);
  }
}
