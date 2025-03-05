import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float valor1, valor2, valor3;

        System.out.println("Digite o primeiro valor (float): ");
        valor1 = sc.nextFloat();
        System.out.println("Digite o segundo valor (float): ");
        valor2 = sc.nextFloat();
        System.out.println("Digite o terceiro valor (float): ");
        valor3 = sc.nextFloat();

        float media = (valor1 + valor2 + valor3) / 3;
        System.out.println("A média é: " + media);
        sc.close();
    }
}