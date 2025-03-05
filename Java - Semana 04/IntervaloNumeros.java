import java.util.Scanner;

public class IntervaloNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de início: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o valor de final: ");
        int fim = sc.nextInt();

        System.out.println("Números no intervalo de " + inicio + " a " + fim + ":");

        // Imprime os números no intervalo
        for (int i = inicio; i <= fim; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        sc.close();
    }
}