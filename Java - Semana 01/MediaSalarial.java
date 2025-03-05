import java.util.Scanner;

public class MediaSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar os salários e a soma
        double salario1, salario2, salario3, soma;

        // Solicitar ao usuário que insira os salários
        System.out.print("Digite o salário do funcionário 1: ");
        salario1 = scanner.nextDouble();

        System.out.print("Digite o salário do funcionário 2: ");
        salario2 = scanner.nextDouble();

        System.out.print("Digite o salário do funcionário 3: ");
        salario3 = scanner.nextDouble();

        // Calcular a soma dos salários
        soma = salario1 + salario2 + salario3;

        // Calcular a média salarial
        double media = soma / 3;

        // Exibir a média salarial
        System.out.printf("A média salarial da empresa é: %.2f%n", media);

        // Fechar o scanner
        scanner.close();
    }
}