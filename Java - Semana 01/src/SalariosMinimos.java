import java.util.Scanner;

public class SalariosMinimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar ao usuário que insira o valor do salário mínimo
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = sc.nextDouble();

        // Solicitar ao usuário que insira o valor do seu salário
        System.out.print("Digite o valor do seu salário: ");
        double salarioUsuario = sc.nextDouble();

        // Calcular a quantidade de salários mínimos
        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

        // Exibir o resultado
        System.out.printf("Você ganha %.2f salários mínimos.%n", quantidadeSalariosMinimos);

        // Fechar o scanner
        sc.close();
    }
}