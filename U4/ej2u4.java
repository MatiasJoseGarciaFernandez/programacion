public class ej2u4 {
  public static void main (String[] args){
    
    System.out.println ("dame una hora");
    int n = Integer.parseInt(System.console().readLine());
    
    if ((n >= 6) && (n <= 12)) {
      System.out.println("buenos dias");
    }
    
    if ((n >= 13) && (n <= 20)) {
      System.out.println ("buenas tardes");
    }
    
    if (((n >= 21) && (n < 24)) || ((n<=5) && (n>=0))) {
      System.out.println("buenas noches");
    }
  }
}
      
