import java.util.Scanner;
import java.util.Arrays;

public class UniaoConjuntos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo o tamanho das sequências
        System.out.print("Digite o tamanho da primeira sequência: ");
        int tamanhoA = scanner.nextInt();
        System.out.print("Digite o tamanho da segunda sequência: ");
        int tamanhoB = scanner.nextInt();

        // Criando os vetores para as sequências
        int[] sequenciaA = new int[tamanhoA];
        int[] sequenciaB = new int[tamanhoB];

        // Lendo os elementos das sequências
        System.out.println("Digite os elementos da primeira sequência:");
        for (int i = 0; i < tamanhoA; i++) {
            sequenciaA[i] = scanner.nextInt();
        }
        System.out.println("Digite os elementos da segunda sequência:");
        for (int i = 0; i < tamanhoB; i++) {
            sequenciaB[i] = scanner.nextInt();
        }

        // Ordenando as sequências para usar a busca binária
        Arrays.sort(sequenciaA);
        Arrays.sort(sequenciaB);

        // Criando os conjuntos A e B, removendo duplicados
        int[] conjuntoA = criarConjunto(sequenciaA);
        int[] conjuntoB = criarConjunto(sequenciaB);

        // Calculando a união dos conjuntos
        int[] conjuntoC = uniao(conjuntoA, conjuntoB);

        // Imprimindo os conjuntos
        System.out.println("Conjunto A: " + Arrays.toString(conjuntoA));
        System.out.println("Conjunto B: " + Arrays.toString(conjuntoB));
        System.out.println("Conjunto C (união): " + Arrays.toString(conjuntoC));
    }

    // Cria um conjunto a partir de uma sequência, removendo duplicados
    public static int[] criarConjunto(int[] sequencia) {
        // ... (implementação da busca binária para remover duplicados)
    }

    // Calcula a união de dois conjuntos
    public static int[] uniao(int[] conjuntoA, int[] conjuntoB) {
        // ... (implementação da união de conjuntos)
    }
}