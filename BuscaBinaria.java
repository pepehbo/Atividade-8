import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Lendo os 10 números ordenados
        System.out.println("Digite 10 números em ordem crescente:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nDigite o número a ser pesquisado:");
            int numero = scanner.nextInt();

            int comparacoes = buscaBinaria(vetor, numero);

            if (comparacoes != -1) {
                System.out.println("O número " + numero + " foi encontrado na posição " + comparacoes + ".");
            } else {
                System.out.println("O número " + numero + " não foi encontrado.");
            }

            System.out.println("Deseja continuar? (s/n)");
            String resposta = scanner.next();
            continuar = resposta.equalsIgnoreCase("s");
        }

        scanner.close();
    }

    public static int buscaBinaria(int[] vetor, int numero) {
        int esquerda = 0;
        int direita = vetor.length - 1;
        int comparacoes = 0;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;
            comparacoes++;

            if (vetor[meio] == numero) {
                return meio;
            } else if (vetor[meio] < numero) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }

        return -1; // Número não encontrado
    }
}