import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite a altura em metros: ");
        double altura = sc.nextDouble();

        System.out.print("Digite o sexo (1 para feminino, 2 para masculino): ");
        int sexo = sc.nextInt();

        double pesoIdeal = 0;


        if (sexo == 1) {
            pesoIdeal = (62.1 * altura) - 44;
        } else if (sexo == 2) {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            System.out.println("Sexo inválido. Por favor, insira 1 para feminino ou 2 para masculino.");
            sc.close();
        }

        // Exibição do resultado com saída formatada

        System.out.printf("O peso ideal é: %.2f kg%n", pesoIdeal);

        sc.close();
    }
}