import java.text.Normalizer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
    public static String leerEntrada(){
        Scanner tecla = new Scanner(System.in);
        String palabra = tecla.next();
        return palabra;
    }
    public static String limpiarpalabra(String cadena) {
        String limpio = null;
        if (cadena != null) {
            String valor = cadena;
            valor = valor.toLowerCase();
            limpio = Normalizer.normalize(valor, Normalizer.Form.NFD);
            limpio = limpio.replaceAll("[(ASCII 255),(N\u0303)(n\u0303),( )(\u00A1)(\u00BF)(\u00B0)(U\u0308)(u\u0308),(u)]", "");
            limpio = Normalizer.normalize(limpio, Normalizer.Form.NFC);
        }
        return limpio;
    }
}
