import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Lee la cantidad de números y los genera aleatoriamente
        System.out.println("Ingrese la cantidad de números: ");
        int cantidadNumeros = scanner.nextInt();
        int[] arreglo = new int[cantidadNumeros];
        System.out.println("Números generados: ");
        for (int i = 0; i < cantidadNumeros; i++) {
            arreglo[i] = random.nextInt(100);
            System.out.print(arreglo[i] + " ");
        }
        //Dar espacio entre lineas
        System.out.println();
        //ordenar Arreglo de forma accedente
        Arrays.sort(arreglo);

        // Leer el número a buscar
        System.out.println("Ingrese el número a buscar: ");
        int numero = scanner.nextInt();

        //Elegir el método de búsqueda
        System.out.println("Elija el método de búsqueda: \n 1. Búsqueda secuencial \n 2. Búsqueda binaria ");
        int opcion = scanner.nextInt();

        int indice = -1;
        if (opcion == 1) {
            // Busqueda secuencial
            indice = MetodosDeBusquedaLineal.busquedaSecuencial(arreglo, numero);
        } else if (opcion == 2) {
            // Búsqueda binaria
            indice = MetodoDeBusquedaBinaria.busquedaBinaria(arreglo, numero);
        } else {
            System.out.println("Opción no válida.");
        }

        // Mostrar el resultado de la búsqueda
        if (indice == -1) {
            System.out.println("No se encontró el número.");
        } else {
            System.out.println("El número se encontró en el índice " + indice + ".");
        }
    }
}