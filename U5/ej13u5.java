public class ej13u5 {
  public static void main(String[] args) {
    int num;
    int numeropos=0;
    int numeroneg=0;
    String total="";
    System.out.println("introduce 10 numeros enteros, pueden ser negativos y positivos");
    for (int i=0; i<=9; i++) {
      num= Integer.parseInt (System.console().readLine());
      if (num<0) {
      numeroneg++;
      }else {
      numeropos++;
      }
    }
    System.out.println("hay " +numeropos+ " positivos y " +numeroneg+ " negativo");
  }
}
      
      
      
      
