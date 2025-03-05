import java.util.Scanner;

public class VolumeLataOleo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        double V; // Volume
        double R; // Raio
        double A; // Altura

        // Solicitar ao usuário que insira o raio e a altura
        System.out.print("Digite o raio da lata de óleo: ");
        R = scanner.nextDouble();

        System.out.print("Digite a altura da lata de óleo: ");
        A = scanner.nextDouble();

        // Cálculo do volume usando a fórmula V = π * R * R * A
        V = 3.14159 * R * R * A;

        // Exibir apenas o volume calculado
        System.out.printf("%.2f%n", V);

        // Fechar o scanner
        scanner.close();
    }
}