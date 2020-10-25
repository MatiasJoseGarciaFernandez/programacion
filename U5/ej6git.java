public class ej6git {
  public static void main(String[] args) {
  String longitud="";
    int altura=1;
    System.out.println("media piramide");
    System.out.print("introduce el numero de altura: ");
    altura= Integer.parseInt (System.console().readLine());

    
    for(int i= 1; i<=altura; i++) {
      
      longitud= longitud+i;
      System.out.println(longitud);
    }
    for(int i=1; i<= altura; i++) {
      for(int j= 1; j<=i; j++) {
        System.out.print(i);
      }
      System.out.println("");
  
    }
    for(int i=altura; i>=1; i--) {
      for(int j= altura; j>=i; j--) {
        System.out.print(i);
      }
      System.out.println("");
    }
  }
}
