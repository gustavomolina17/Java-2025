import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar ao usuário que insira um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        // Calcular o antecessor e o sucessor
        int antecessor = numero - 1;
        int sucessor = numero + 1;

        // Exibir o resultado
        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);

        // Fechar o scanner
        sc.close();
    }
}