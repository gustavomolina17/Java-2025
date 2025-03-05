import java.util.Scanner;

public class MultiplicacaoSequencial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de início: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o valor de final: ");
        int fim = sc.nextInt();

        // Variável para armazenar o valor anterior
        int anterior = inicio;

        System.out.println("Resultado da multiplicação sequencial:");

        for (int i = inicio; i <= fim; i++) {
            if (i == inicio) {
                System.out.print(anterior + " "); // Imprime o primeiro número
            } else {
                anterior *= i; // Multiplica pelo número anterior
                System.out.print(anterior + " ");
            }
        }

        System.out.println();
        sc.close();
    }
}