import java.util.Scanner;

public class ReajusteSaldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar o saldo ao usuário
        System.out.print("Digite o saldo: ");
        double saldo = sc.nextDouble();

        // Calcular o saldo com reajuste de 1%
        double reajuste = saldo * 0.01;
        double saldoComReajuste = saldo + reajuste;

        // Exibir o saldo com reajuste com formatação manual
        String saldoOriginal = "R$ " + String.format("%.2f", saldo);
        String saldoReajustado = "R$ " + String.format("%.2f", saldoComReajuste);

        System.out.println("Saldo original: " + saldoOriginal);
        System.out.println("Saldo com reajuste de 1%: " + saldoReajustado);

        // Fechar o scanner
        sc.close();
    }
}