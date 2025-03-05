import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        char continuar;

        do {
            System.out.print("Digite um número de 0 a 10: ");
            numero = sc.nextInt();

            // Verifica se o número está no intervalo permitido
            if (numero < 0 || numero > 10) {
                System.out.println("Por favor, digite um número entre 0 e 10.");
            } else {
                System.out.println("Tabuada de " + numero + ":");
                for (int i = 0; i <= 10; i++) {
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                }
            }

            System.out.print("Deseja continuar? (s/n): ");
            continuar = sc.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        sc.close();
        System.out.println("Programa encerrado.");
    }
}