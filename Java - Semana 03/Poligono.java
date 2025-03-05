import java.util.Scanner;

public class Poligono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o número de lados do polígono: ");
        int lados = sc.nextInt();

        if (lados < 3) {
            System.out.println("Não é um Poligono");
        } else if (lados > 5) {
            System.out.println("Poligono não identificado");
        } else {

            // SE for Triângulo
            switch (lados) {
                case 3:
                    System.out.print("Digite o valor da base em cm: ");
                    double base = sc.nextDouble();
                    System.out.print("Digite o valor da altura em cm: ");
                    double altura = sc.nextDouble();
                    double areaTriangulo = (base * altura) / 2;
                    System.out.printf("TRIÂNGULO\nÁrea: %.2f cm²%n", areaTriangulo);
                    break;

                case 4: // Quadrado
                    System.out.print("Digite o valor do lado do quadrado: ");
                    double lado = sc.nextDouble();
                    double areaQuadrado = Math.pow(lado, 2);
                    System.out.printf("QUADRADO\nÁrea: %.2f cm²%n", areaQuadrado);
                    break;

                case 5: // Pentágono
                    System.out.println("PENTÁGONO");
                    break;

                default:
                    System.out.println("Número de lados não suportado.");
                    break;
            }

            sc.close();
        }
    }
}