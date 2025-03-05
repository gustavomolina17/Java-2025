import java.util.Scanner;

public class PrimeiroUltimoNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int primeiro = 0;
        int ultimo = 0;
        boolean primeiroDigitado = false;

        System.out.println("Digite vários números (digite '0' para sair):");

        while (true) {
            numero = sc.nextInt();

            if (numero == 0) {
                break; // Interrompe se o usuário digitar 0
            }

            if (!primeiroDigitado) {
                primeiro = numero; // Armazena o primeiro número
                primeiroDigitado = true;
            }
            ultimo = numero; // Atualiza o último número
        }

        if (primeiroDigitado) {
            System.out.println("Primeiro número digitado: " + primeiro);
            System.out.println("Último número digitado: " + ultimo);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }

        sc.close();
    }
}