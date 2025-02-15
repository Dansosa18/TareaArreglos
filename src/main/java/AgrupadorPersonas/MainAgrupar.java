package AgrupadorPersonas;


import java.util.List;
import java.util.Scanner;

public class MainAgrupar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los tamaños de los grupos
        System.out.print("Ingresa los tamaños de grupos separados por comas (ejemplo: 3,3,3,3,1,3): ");
        String entrada = scanner.nextLine();

        String[] partes = entrada.split(",");
        int[] tamanosGrupos = new int[partes.length];

        for (int i = 0; i < partes.length; i++) {
            tamanosGrupos[i] = Integer.parseInt(partes[i].trim());
        }

        // Agrupar personas
        AgrupadorPersonas agrupador = new AgrupadorPersonas();
        List<List<Integer>> grupos = agrupador.agruparPersonas(tamanosGrupos);

        // Imprimir los grupos
        System.out.println("Grupos formados: " + grupos);

        // Cerrar Scanner
        scanner.close();
    }
}