public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int numeroDos = 2;
        int numeroTres = 3;

        int suma = numeroDos + numeroTres;
        int resta = numeroDos - numeroTres;
        int numeroDosConCambioDeSigno = -numeroDos;
        int multiplicacion = numeroDos * numeroTres;
        double division = (double) numeroDos / numeroTres;
        int modulo = numeroDos % numeroTres;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Numero dos con cambio de signo: " + numeroDosConCambioDeSigno);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Modulo: " + modulo);

    }
}
