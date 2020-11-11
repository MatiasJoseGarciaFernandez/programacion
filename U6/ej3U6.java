public class ej3U6 {
  public static void main(String[] args) {
    
    String palo= " ";
    String carta= " ";
    
    int numpalo= (int)(Math.random()*4)+1;
    
    switch(numpalo) {
      case 1:
        palo= "oros";
        break;
      case 2:
        palo="copas";
        break;
      case 3:
        palo="bastos";
        break;
      case 4:
        palo="espadas";
        break;
      default:
    }
    
    int numerocarta = (int)(Math.random()*11)+1;
    
    switch (numerocarta) {
        case 1:
          carta = "As";
          break;
        case 11:
          carta = "Sota";
          break;
        case 12:
          carta= "Caballo";
          break;
        case 13:
          carta= "Rey";
          break;
        default:
          carta= String.valueOf(numerocarta);
      }
      
      System.out.println(carta+ " de " +palo);
    }
  }

