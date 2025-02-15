package OrdenadorFrecuencia;
import java.util.Scanner;

public class MainOrdenar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la cantidad de elementos
        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        // Leer los números
        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        scanner.close();

        // Procesar y ordenar el arreglo usando la clase OrdenadorFrecuencia
        int[] resultado = OrdenarPorFrecuencia.ordenarPorFrecuencia(numeros);

        // Mostrar el resultado
        System.out.println("Arreglo ordenado por frecuencia:");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }
}