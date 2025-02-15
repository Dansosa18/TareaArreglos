package OrdenadorFrecuencia;

public class OrdenarPorFrecuencia {
    public int[] ordenarElementosPorFrecuencia(int[] numeros) {
        int n = numeros.length;
        int[] frecuencias = new int[n];
        int[] resultado = new int[n];

        // Contar frecuencias
        for (int i = 0; i < n; i++) {
            frecuencias[i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (numeros[i] == numeros[j]) {
                    frecuencias[i]++;
                }
            }
        }

        // Crear arreglo de pares (número, frecuencia)
        int[][] pares = new int[n][2];
        for (int i = 0; i < n; i++) {
            pares[i][0] = numeros[i];
            pares[i][1] = frecuencias[i];
        }

        // Ordenar por frecuencia y mantener el orden relativo
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (pares[j][1] < pares[j + 1][1] ||
                    (pares[j][1] == pares[j + 1][1] && pares[j][0] > pares[j + 1][0])) {
                    int[] temp = pares[j];
                    pares[j] = pares[j + 1];
                    pares[j + 1] = temp;
                }
            }
        }

        // Construir el arreglo resultante
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < pares[i][1]; j++) {
                resultado[index++] = pares[i][0];
            }
        }

        return resultado;
    }
}