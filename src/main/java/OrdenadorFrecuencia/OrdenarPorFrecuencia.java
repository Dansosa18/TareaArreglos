package OrdenadorFrecuencia;

public class OrdenarPorFrecuencia {
    public static int[] ordenarPorFrecuencia(int[] nums) {
        int maxValor = Integer.MIN_VALUE;

        // Encontrar el valor máximo para definir el rango de frecuencias
        for (int num : nums) {
            if (num > maxValor) maxValor = num;
        }

        int[] frecuencia = new int[maxValor + 1];
        int[] orden = new int[nums.length];

        // Contar frecuencia de cada número
        for (int num : nums) {
            frecuencia[num]++;
        }

        // Copiar el arreglo original para mantener el orden de aparición
        System.arraycopy(nums, 0, orden, 0, nums.length);

        // Ordenar según la frecuencia y el orden de aparición
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (frecuencia[orden[i]] < frecuencia[orden[j]] ||
                        (frecuencia[orden[i]] == frecuencia[orden[j]] && posicion(nums, orden[i]) > posicion(nums, orden[j]))) {
                    // Intercambio
                    int temp = orden[i];
                    orden[i] = orden[j];
                    orden[j] = temp;
                }
            }
        }

        return orden;
    }

    // Obtener la primera aparición de un número en el array original
    public static int posicion(int[] nums, int valor) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}