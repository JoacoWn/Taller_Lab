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
        } while (opcion != 6);
    }

    public static void mostrarMenu() {
        System.out.println("___Bienvenido a calculadora de Matriz___");
        System.out.println("___Que operación matricial quiere hacer?___");
        System.out.println("___Opción 1: Crear Matriz___");
        System.out.println("___Opción 2: Llena matriz___");
        System.out.println("___Opción 3: Mostrar Filas___");
        System.out.println("___Opción 4: Matriz Cero___");
        System.out.println("___Opción 5: Cerrar Programa___");
    }

    public static int obtenerOpcion(Scanner sc) {
        System.out.print("Ingrese una opción: ");
        return sc.nextInt();
    }

    public static void ejecutarOpcion(int opcion, Scanner sc) {
        int filas = matriz[i].lenght;

        switch (opcion) {
            case 1:
                crearMatriz(int filas,int cols);
                break;
            case 2:
                llenarMatriz(int[][] matriz);
                break;
            case 3:
                mostrarFila(int[][] matriz, int filas);
                break;
            case 4:
                matrizCero(int[][] matriz);
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

    public static boolean validarDimensiones(int filas, int cols) {
        cantidadFilasCols();
        boolean validar = false;
        if (filas > 0 && cols > 0) {
            validar = true;
            return true;
        } else {
            System.out.println("Las filas y columnas deben ser mayores que 0.");
        }
        return false;
    }

    public static int[][] crearMatriz(int filas, int cols) {
        int[][] matriz = new int[filas][cols];
        return matriz;
    }

    public static int[][] llenarMatriz(int[][] matriz) {
        Random randomNumbers = new Random();
        int filas = matriz.length;
        int cols = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                matriz[i][j] = randomNumbers.nextInt(10);
            }
        }
        return matriz;
    }

    public static int preguntarFila() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese fila que quiere ver:");
        int filaPedida = sc.nextInt();
        return filaPedida;
    }

    public static void mostrarFila(int[][] matriz, int filas) {
        int filaPedida = preguntarFila();
        if (filaPedida < filas) {
            for (int i = 0; i < matriz[0].length; i++) {
                System.out.println(matriz[filaPedida][i]);
            }
        } else {
            System.out.println("Ingrese una fila valida de las: " + matriz.length);
        }
    }

    public static boolean matrizCero(int[][] matriz) {
        int filas = matriz.length;
        int cols = matriz[0].length;
        int contadorCeros = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                if (matriz[i][j] == 0) {
                    contadorCeros++;
                }
            }
        }

        int totalElementos = filas * cols;
        double porcentajeCeros = (double) contadorCeros / totalElementos;

        if (porcentajeCeros > 0.5) {
            System.out.println("La matriz es de Tipo Cero");
            return true;
        } else {
            System.out.println("La matriz No es de Tipo Cero");
            return false;
        }
    }
}