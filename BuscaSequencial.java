import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Lendo os 10 números
        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nDigite o número a ser pesquisado:");
            int numero = scanner.nextInt();

            System.out.println("Escolha o tipo de busca:");
            System.out.println("1 - Sequencial");
            System.out.println("2 - Sequencial com Sentinela");
            int opcao = scanner.nextInt();

            int comparacoes = 0;
            int indice = -1;

            switch (opcao) {
                case 1:
                    indice = buscaSequencial(vetor, numero, comparacoes);
                    break;
                case 2:
                    indice = buscaSequencialComSentinela(vetor, numero, comparacoes);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            if (indice != -1) {
                System.out.println("O número " + numero + " foi encontrado na posição " + indice + ".");
                System.out.println("Número de comparações: " + comparacoes);
            } else {
                System.out.println("O número " + numero + " não foi encontrado.");
            }

            System.out.println("Deseja continuar? (s/n)");
            String resposta = scanner.next();
            continuar = resposta.equalsIgnoreCase("s");
        }

        scanner.close();
    }

    public static int buscaSequencial(int[] vetor, int numero, int comparacoes) {
        for (int i = 0; i < vetor.length; i++) {
            comparacoes++;
            if (vetor[i] == numero) {
                return i;
            }
        }
        return -1;
    }

    public static int buscaSequencialComSentinela(int[] vetor, int numero, int comparacoes) {
        int[] vetorComSentinela = new int[vetor.length + 1];
        System.arraycopy(vetor, 0, vetorComSentinela, 0, vetor.length);
        vetorComSentinela[vetor.length] = numero;

        int i = 0;
        while (vetorComSentinela[i] != numero) {
            i++;
            comparacoes++;
        }

        if (i < vetor.length) {
            return i;
        } else {
            return -1; // Número não encontrado
        }
    }
}