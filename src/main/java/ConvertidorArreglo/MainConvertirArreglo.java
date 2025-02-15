package ConvertidorArreglo;

import java.util.List;
import java.util.Scanner;

public class MainConvertirArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la lista de números
        System.out.print("Ingresa los números separados por comas (ejemplo: 1,3,4,1,2,3,1): ");
        String entrada = scanner.nextLine();

        String[] partes = entrada.split(",");
        int[] numeros = new int[partes.length];

        for (int i = 0; i < partes.length; i++) {
            numeros[i] = Integer.parseInt(partes[i].trim());
        }

        // Convertir el arreglo en una matriz 2D
        ConvertidorArreglo convertidor = new ConvertidorArreglo();
        List<List<Integer>> matriz = convertidor.convertirAMatriz(numeros);

        // Imprimir la matriz resultante
        System.out.println("Matriz resultante: " + matriz);

        // Cerrar Scanner
        scanner.close();
    }
}
