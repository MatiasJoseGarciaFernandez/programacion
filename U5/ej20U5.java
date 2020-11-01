public class ej20U5 {
  public static void main(String[] args) {
    int altura;
    String caracter;
   
    System.out.print("dame la altura de la piramide: ");
    altura= Integer.parseInt (System.console().readLine());
    System.out.print("introduce caracter: ");
    caracter=  System.console().readLine();

    for(int i=1;i<=altura; i++) {
      for(int j=1; j<=altura-i; j++) {
        System.out.print(" ");
        
      }
      for(int k=1; k<=(i*2)-1; k++){
        if( k==1 || k==(i*2)-1 || i==altura) {
          System.out.print(caracter);
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
      
    }
  }
}
