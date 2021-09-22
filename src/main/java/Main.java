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
    public static void mostrarMenu(){
        System.out.println("Ingrese la opcion que desea realizar:");
        System.out.println("1)verificar si es un palindromo");
        System.out.println("2)verificar y mostrar si es un palindromo");
        System.out.println("3)Salir");
    }
    public static void opcionMenu(){
        Scanner tecla = new Scanner(System.in);
        int aux = 0;
        while (aux==0){
            mostrarMenu();
            String opcion = tecla.next();
            switch (opcion){
                case "1":

                    break;
                case "2":

                    break;
                case "3":
                    aux =1;
                    break;
                default:
                    System.err.println("opcion ingresada no valida, intentelo nuevamente");
                    break;
            }
        }
        }
}


