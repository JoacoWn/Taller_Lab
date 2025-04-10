import java.util.Scanner;
import java.util.Random;

public class App_Matriz {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion;
        Scanner sc = new Scanner(System.in);
        int[][] matriz = null;
        int filas = 0;
        int cols = 0;

        do {
            mostrarMenu();
            opcion = obtenerOpcion(sc);

            if (opcion >= 1 && opcion <= 4 && matriz == null && opcion != 1) {
                System.out.println("Primero debe crear una matriz (Opción 1)");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese cantidad de filas:");
                    filas = sc.nextInt();
                    System.out.println("Ingrese cantidad de columnas:");
                    cols = sc.nextInt();
                    if (validarDimensiones(filas, cols)) {
                        matriz = crearMatriz(filas, cols);
                        System.out.println("Matriz creada correctamente");
                    }
                    break;
                case 2:
                    matriz = llenarMatriz(matriz);
                    System.out.println("Matriz llenada aleatoriamente");
                    break;
                case 3:
                    mostrarFila(matriz, filas);
                    break;
                case 4:
                    matrizCero(matriz);
                    break;
                case 5:
                    System.out.println("Cerrando programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
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

    public static boolean validarDimensiones(int filas, int cols) {
        if (filas > 0 && cols > 0) {
            return true;
        } else {
            System.out.println("Las filas y columnas deben ser mayores que 0.");
            return false;
        }
    }

    public static int[][] crearMatriz(int filas, int cols) {
        return new int[filas][cols];
    }

    public static int[][] llenarMatriz(int[][] matriz) {
        Random randomNumbers = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = randomNumbers.nextInt(10);
            }
        }
        return matriz;
    }

    public static int preguntarFila() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese fila que quiere ver:");
        return sc.nextInt();
    }

    public static void mostrarFila(int[][] matriz, int filas) {
        int filaPedida = preguntarFila();
        if (filaPedida >= 0 && filaPedida < filas) {
            for (int i = 0; i < matriz[0].length; i++) {
                System.out.print(matriz[filaPedida][i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Ingrese una fila valida entre 0 y " + (filas-1));
        }
    }

    public static boolean matrizCero(int[][] matriz) {
        int contadorCeros = 0;
        int totalElementos = matriz.length * matriz[0].length;

        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor == 0) {
                    contadorCeros++;
                }
            }
        }

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