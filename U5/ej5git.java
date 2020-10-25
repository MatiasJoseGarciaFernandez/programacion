public class ej5git {
  public static void main(String[] args) {
    int altura;
    System.out.print("introduce la altura: ");
    altura= Integer.parseInt (System.console().readLine());
    for(int i=1; i<= altura; i++) {
      for(int j= 1; j<=i; j++) {
        System.out.print(" ");
      }
      System.out.print(i);
      System.out.println("");
    }

    for(int i=1; i<=altura;i++){
      for(int j=1; j<i;j++){
        System.out.print(" ");
      }
      for(int k=1; k<=i;k++){
        System.out.print(k);
        }
      System.out.println("");
    }
    for(int i=0; i<altura;i++){
      for(int j=0; j<i;j++){
        System.out.print(" ");
      }
      for(int k=altura; k>=altura-i;k--){
        System.out.print(k);
        }
      System.out.println("");
    }
  
  }
}
