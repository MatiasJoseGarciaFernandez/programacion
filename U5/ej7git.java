public class ej7git {
  public static void main(String[] args) {
    int altura;
    System.out.print("introduce el numero de altura: ");
    altura= Integer.parseInt (System.console().readLine());
    for(int i=1; i<=altura; i++) {
      for(int j=(altura-1); j>= i; j--) {
        System.out.print(" ");
      }
      for(int k= 1; k<= i; k++) {
        System.out.print(i);
      }
      System.out.println("");
    }
    for(int i=altura; i>= 1; i--) {
      for(int j=2; j<=i; j++) {
        System.out.print(" ");
      }
  
      for(int k= altura; k>= i; k--) {
        System.out.print(i);
      }
      System.out.println("");
    }
    for ( int i = 1; i <= altura; i++){
      for ( int j = altura - 1 ;j >= i; j--){
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++){
        System.out.print(k);
      }
        System.out.println("");
      }

  }
}

