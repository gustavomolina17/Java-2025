import java.util.Scanner;

public class TipoTriângulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o comprimento do primeiro lado: ");
        double a = sc.nextDouble();

        System.out.print("Digite o comprimento do segundo lado: ");
        double b = sc.nextDouble();

        System.out.print("Digite o comprimento do terceiro lado: ");
        double c = sc.nextDouble();

        if (a == b && b == c) {
            System.out.println("Equilátero");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isósceles");
        } else {
            System.out.println("Escaleno");
        }

        sc.close();
    }


}