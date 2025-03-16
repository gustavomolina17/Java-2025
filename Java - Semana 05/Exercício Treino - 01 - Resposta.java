import java.util.Scanner;

public class Cp_noite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalVendas = 0;
        double qtdVendas = 0;
        double menorValor = Double.MAX_VALUE; // Inicializa com o maior valor possível
        double maiorValor = 0;

        while (true) {
            System.out.println("\nDigite o valor da venda, ou digite 0 para finalizar: ");
            double valorVenda = sc.nextDouble();

            if (valorVenda == 0) {
                break;
            }
            if (valorVenda < 0) {
                System.out.println("Digite um valor válido!\n");
                continue;
            }

            totalVendas += valorVenda;
            qtdVendas++;

            if (valorVenda > maiorValor) {
                maiorValor = valorVenda;
            }

            if (valorVenda < menorValor) {
                menorValor = valorVenda; // Atualiza menorValor se o valorVenda for menor
            }
        }

        sc.close();

        if (qtdVendas > 0) { // Verifica se houve vendas para calcular a média
            System.out.printf("\nTotal de vendas: R$ %.2f", totalVendas);
            System.out.println("\nQuantidade de vendas: " + qtdVendas);
            System.out.printf("Média de vendas: R$ %.2f ", totalVendas / qtdVendas);
            System.out.printf("\nMaior valor: R$ %.2f ", maiorValor);
            System.out.printf("\nMenor valor: R$ %.2f", menorValor);
        } else {
            System.out.println("\nNenhuma venda registrada.");
        }
    }
}