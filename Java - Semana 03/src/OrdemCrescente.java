import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = sc.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int valor3 = sc.nextInt();

        // Ordenação dos valores
        int menor, medio, maior;

        if (valor1 > valor2 && valor1 > valor3) {
            maior = valor1;
            if (valor2 > valor3) {
                medio = valor2;
                menor = valor3;
            } else {
                medio = valor3;
                menor = valor2;
            }
        } else if (valor2 > valor1 && valor2 > valor3) {
            maior = valor2;
            if (valor1 > valor3) {
                medio = valor1;
                menor = valor3;
            } else {
                medio = valor3;
                menor = valor1;
            }
        } else {
            maior = valor3;
            if (valor1 > valor2) {
                medio = valor1;
                menor = valor2;
            } else {
                medio = valor2;
                menor = valor1;
            }
        }

        // Exibição dos valores em ordem crescente
        System.out.println("Valores em ordem crescente: " + menor + ", " + medio + ", " + maior);

        sc.close();
    }
}