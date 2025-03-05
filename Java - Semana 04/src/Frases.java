import java.util.Scanner;
public class Frases {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String frase;

        System.out.println("Digite suas frases (digite 'PARE' para sair):");

        while (true) {
            frase = sc.nextLine();
            if (frase.equalsIgnoreCase("PARE")) {
                break;
            }
            System.out.println("Você digitou: " + frase);
        }

        System.out.println("Programa encerrado.");
        sc.close();



    }
}