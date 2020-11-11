public class ej5U6 {
  public static void main(String[] args) {
    int n;
    int max=100;
    int min=199;
    int suma=0;
    
    
    for(int i=1; i<= 50; i++) {
      n= (int)(Math.random()*100)+100;
      System.out.print(n + " ");
      suma +=n;
      
      if(n < min) {
        min = n;
      }
      if(n > max) {
        max = n;
      }
    }
    System.out.println("\nminimo : " +min+ "\nmaximo: " +max+ "\nmedia: " +suma/50);
  }
}
