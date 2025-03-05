import java.util.Scanner;

public class AnguloTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o valor do primeiro ângulo: ");
        double a1 = sc.nextDouble();

        System.out.print("Digite o valor do segundo ângulo ");
        double a2 = sc.nextDouble();

        System.out.print("Digite o valor do terceiro ângulo: ");
        double a3 = sc.nextDouble();

        double soma = a1 + a2 + a3;

        if (soma > 180) {
            System.out.println("A soma dos ângulos de um triângulo não pode ser maior que 180º.");
        } else if (a1 < 0 || a2 < 0 || a3 < 0 || soma < 0) {
            System.out.println("Os ângulos devem ser positivos");

        } else {

            if (a1 == 90 || a2 == 90 || a3 == 90) {
                System.out.println("Retângulo");
            } else if (a1 > 90 || a2 > 90 || a3 > 90) {
                System.out.println("Obtusângulo");
            } else {
                System.out.println("Acutângulo");
            }

            sc.close();
        }
    }
}