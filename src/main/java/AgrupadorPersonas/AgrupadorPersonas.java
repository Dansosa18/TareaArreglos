package AgrupadorPersonas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AgrupadorPersonas {
    public List<List<Integer>> agruparPersonas(int[] tamanosGrupos) {
        List<List<Integer>> grupos = new ArrayList<>();
        HashMap<Integer, List<Integer>> mapaGrupos = new HashMap<>();

        for (int i = 0; i < tamanosGrupos.length; i++) {
            int tamano = tamanosGrupos[i];

            if (!mapaGrupos.containsKey(tamano)) {
                mapaGrupos.put(tamano, new ArrayList<>());
            }

            mapaGrupos.get(tamano).add(i);

            if (mapaGrupos.get(tamano).size() == tamano) {
                grupos.add(new ArrayList<>(mapaGrupos.get(tamano)));
                mapaGrupos.get(tamano).clear();
            }
        }

        return grupos;
    }
}
