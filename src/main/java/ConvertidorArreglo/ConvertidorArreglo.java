package ConvertidorArreglo;

import java.util.*;

public class ConvertidorArreglo {
    public List<List<Integer>> convertirAMatriz(int[] numeros) {
        Map<Integer, List<Integer>> mapa = new HashMap<>();

        // Agrupar números en listas según su primera aparición
        for (int numero : numeros) {
            if (!mapa.containsKey(numero)) {
                mapa.put(numero, new ArrayList<>());
            }
            mapa.get(numero).add(numero);
        }

        // Construir la matriz resultante
        List<List<Integer>> matriz = new ArrayList<>(mapa.values());

        return matriz;
    }
}