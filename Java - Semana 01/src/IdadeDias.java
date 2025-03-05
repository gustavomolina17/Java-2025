import java.util.Scanner;

public class IdadeDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler a idade em anos, meses e dias
        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite a idade em meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite a idade em dias: ");
        int dias = scanner.nextInt();

        // Calcular a idade total em dias
        int totalDias = (anos * 365) + (meses * 30) + dias;

        // Exibir o resultado
        System.out.println("A idade total em dias é: " + totalDias);

        // Fechar o scanner
        scanner.close();
    }
}