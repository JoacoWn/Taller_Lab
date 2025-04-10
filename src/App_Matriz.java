import java.util.Scanner;
import java.util.Random;

public class App_Matriz {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion;
        Scanner sc = new Scanner(System.in);
        do {
            mostrarMenu();
            opcion = obtenerOpcion(sc);
            ejecutarOpcion(opcion, sc);
        } while (opcion != 7);
    }

    public static void mostrarMenu() {
        System.out.println("___Bienvenido a calculadora de Matriz___");
        System.out.println("___Que operación matricial quiere hacer?___");
        System.out.println("___Opción 1: Crear Matriz___");
        System.out.println("___Opción 2: Restar Matriz___");
        System.out.println("___Opción 3: Multiplicar Matriz___");
        System.out.println("___Opción 4: Inversa de la Matriz___");
        System.out.println("___Opción 5: Dividir Matriz___");
        System.out.println("___Opción 6: Cerrar Programa___");
    }

    public static int obtenerOpcion(Scanner sc) {
        System.out.print("Ingrese una opción: ");
        return sc.nextInt();
    }

    public static void ejecutarOpcion(int opcion, Scanner sc) {
        switch (opcion) {
            case 1:
                crearMatriz(sc);
                break;
            case 2:
                llenarMatriz(sc);
                break;
            case 3:
                mostrarFila(sc);
                break;
            case 4:
                matrizCero(sc);
                break;
            case 5:
                System.out.println("Cerrando programa...");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
    public static int[][] cantidadFilasCols() {
        System.out.println("Ingrese cantidad de filas");
        Scanner filas = new Scanner(System.in);
        System.out.println("Ingrese cantidad de Columnas");
        Scanner cols = new Scanner(System.in);
        int[][] cantidad = new int[filas.nextInt()][cols.nextInt()];
        return cantidad;
    }

    boolean validarDimensiones(int filas, int cols) {
        cantidadFilasCols();
        boolean validar = false;
        if (filas > 0 && cols > 0) {
            validar = true;
            return true;
        } else {
            System.out.println("Error: Las filas y columnas deben ser mayores que 0.");
        }
        return false;
    }
    public static int [ ][ ] crearMatriz(int filas, int cols) {

        /* Una vez estén capturadas y validadas las dimensiones de la matriz,
        se debe crear la matriz, por lo que recibe como parámetros las dimensiones y devuelve una matriz de enteros, considere:
         */
        int[][] matriz = new int[filas][cols];
        return matriz;
    }

    public static int[][] llenarMatriz(int[][] matriz) {

        /* La matriz debe ser llenada con datos de tipo entero, de forma aleatoria, entre 0 y 9, considere: */
        Random randomNumbers = new Random();
        crearMatriz();
        int filas = matriz.length;
        int cols = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                matriz[i][j] = randomNumbers.nextInt(10);
            }
        }
        return matriz;
    }
}
    public static void preguntarFila(Scanner filaPedida){

        System.out.println("Ingrese fila que quiere ver:");
        return filaPedida;
    }

    void mostrarFila(int matriz[ ][ ], int filas) {

        /* Muestre por pantalla toda la fila que desee el usuario, considere: */
        preguntarFila();
        if (filaPedida <= filas) {
            for (int i = 0; i < columnas; i++) {
                System.out.println(matriz[sc][i]);

            }
        }
        else (filaPedida > filas) {
            System.out.println("Ingrese una fila valida de las :" &filas);
        }

    }

    boolean matrizCero(int matriz[ ][ ] ) {

            /* Verifique si la matriz es de TIPO CERO, esto sucede cuando más del 50% de los valores de la matriz son CERO, considere:*/
...

    }

}