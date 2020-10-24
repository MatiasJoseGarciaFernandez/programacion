public class ej27u5 {
  public static void main(String[] args) {
    int num;
    int cuenta= 0;
    int suma= 0;
    System.out.println("introduce un numero");
    num= Integer.parseInt (System.console().readLine());
    for(int i=1; i<=num; i++)  {
      if ((i%3)==0) {
        System.out.println(i + " ");
        cuenta++;
        suma +=1;
      }
    }
    System.out.print("Desde 1 hasta " + num + " hay " + cuenta + " múltiplos de 3 y suman " + suma);
  }
}

        
