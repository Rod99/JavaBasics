public class Literales {
    public static void main(String[] args) {
        int enteroDecimal = 100;
        int enteroOctal = 0100;
        int enteroHexadecimal = 0x100;

        System.out.println("Entero decimal: " + enteroDecimal);
        System.out.println("Entero octal: " + enteroOctal);
        System.out.println("Entero hexadecimal: " + enteroHexadecimal);

        long enteroDecimalL = 100L;
        double enteroDecimalD = 100.0;
        float enteroDecimalF = 100.0f;

        int numeroConGuiones = 1_000_000;

        System.out.println("Entero decimal long: " + enteroDecimalL);
        System.out.println("Entero decimal double: " + enteroDecimalD);
        System.out.println("Entero decimal float: " + enteroDecimalF);
        System.out.println("Entero decimal con guiones: " + numeroConGuiones);

        char caracter = 'a';
        char caracter2 = '\u0061';

        System.out.println("Caracter: " + caracter);
        System.out.println("Caracter 2: " + caracter2);

        String nullString = null;
        String string = "Hola";
    }
}
