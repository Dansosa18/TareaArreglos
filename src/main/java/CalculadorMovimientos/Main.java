package CalculadorMovimientos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cadena de cajas
        System.out.print("Ingresa la cadena de cajas (ejemplo: 11001): ");
        String cajas = scanner.nextLine();

        // Validar que solo contenga '0' y '1'
        if (!cajas.matches("[01]+")) {
            System.out.println("Error: La cadena solo debe contener '0' y '1'.");
            return;
        }

        // Calcular los movimientos mínimos
        CalculadorMovimientos calculador = new CalculadorMovimientos();
        int[] resultado = calculador.calcularMovimientos(cajas);

        // Imprimir resultado
        System.out.print("Salida: [");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]);
            if (i < resultado.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        // Cerrar el Scanner
        scanner.close();
    }
}