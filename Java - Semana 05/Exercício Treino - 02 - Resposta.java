import java.util.Scanner;

public class Eleicao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int votosC1 = 0, votosC2 = 0, votosC3 = 0, votosC4 = 0, votosC5 = 0;
        int votosNulo = 0, votosBranco = 0;
        int totalVotos = 0;

        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        for (int i = 1; i <= totalEleitores; i++) {
            System.out.print("Eleitor " + i + " - Digite o número do candidato (1 a 5), 6 para NULO ou 7 para BRANCO: ");
            int voto = scanner.nextInt();
            totalVotos++;

            switch (voto) {
                case 1:
                    votosC1++;
                    break;
                case 2:
                    votosC2++;
                    break;
                case 3:
                    votosC3++;
                    break;
                case 4:
                    votosC4++;
                    break;
                case 5:
                    votosC5++;
                    break;
                case 6:
                    votosNulo++;
                    break;
                case 7:
                    votosBranco++;
                    break;
                default:
                    System.out.println("Voto inválido! Será considerado como NULO.");
                    votosNulo++;
                    break;
            }
        }

        // Exibindo resultados formatados com printf
        System.out.println("\n--- Resultado da Votação ---");
        System.out.printf("Candidato 1: %d votos (%.2f%%)%n", votosC1, (votosC1 * 100.0 / totalVotos));
        System.out.printf("Candidato 2: %d votos (%.2f%%)%n", votosC2, (votosC2 * 100.0 / totalVotos));
        System.out.printf("Candidato 3: %d votos (%.2f%%)%n", votosC3, (votosC3 * 100.0 / totalVotos));
        System.out.printf("Candidato 4: %d votos (%.2f%%)%n", votosC4, (votosC4 * 100.0 / totalVotos));
        System.out.printf("Candidato 5: %d votos (%.2f%%)%n", votosC5, (votosC5 * 100.0 / totalVotos));
        System.out.println("Votos Nulos: " + votosNulo);
        System.out.println("Votos em Branco: " + votosBranco);

        // Descobrindo o vencedor
        int vencedor = 1;
        int maiorVoto = votosC1;

        if (votosC2 > maiorVoto) {
            maiorVoto = votosC2;
            vencedor = 2;
        }
        if (votosC3 > maiorVoto) {
            maiorVoto = votosC3;
            vencedor = 3;
        }
        if (votosC4 > maiorVoto) {
            maiorVoto = votosC4;
            vencedor = 4;
        }
        if (votosC5 > maiorVoto) {
            maiorVoto = votosC5;
            vencedor = 5;
        }

        // Verificando se houve empate
        int empate = 0;
        if (votosC1 == maiorVoto) empate++;
        if (votosC2 == maiorVoto) empate++;
        if (votosC3 == maiorVoto) empate++;
        if (votosC4 == maiorVoto) empate++;
        if (votosC5 == maiorVoto) empate++;

        if (empate > 1) {
            System.out.println("Resultado: Houve um empate entre os candidatos com maior número de votos.");
        } else {
            System.out.println("Candidato vencedor: Candidato " + vencedor + " com " + maiorVoto + " votos.");
        }

        scanner.close();
    }
}