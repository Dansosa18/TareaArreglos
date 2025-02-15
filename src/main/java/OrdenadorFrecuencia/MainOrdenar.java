package OrdenadorFrecuencia;

import java.util.Arrays;
import java.util.Scanner;

public class MainOrdenar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrdenarPorFrecuencia ordenar = new OrdenarPorFrecuencia();

        System.out.println("Ingrese los números separados por espacios:");
        String entrada = scanner.nextLine();

        // Convertir la entrada en un arreglo de enteros
        String[] numerosTexto = entrada.split("\\s+");
        int[] numeros = Arrays.stream(numerosTexto)
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] resultado = ordenar.ordenarElementosPorFrecuencia(numeros);

        System.out.println("Salida ordenada por frecuencia:");
        System.out.println(Arrays.toString(resultado));
    }
}