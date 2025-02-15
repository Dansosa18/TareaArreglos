package CalculadorMovimientos;

public class CalculadorMovimientos {
    public int[] calcularMovimientos(String cajas) {
        int n = cajas.length();
        int[] resultado = new int[n];

        for (int i = 0; i < n; i++) {
            int movimientos = 0;
            for (int j = 0; j < n; j++) {
                if (cajas.charAt(j) == '1') { // Si hay una bola en la caja j
                    movimientos += Math.abs(i - j); // Distancia entre la caja i y la caja j
                }
            }
            resultado[i] = movimientos;
        }

        return resultado;
    }
}