import java.util.Scanner;

public class StringConversion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pede ao usuário para inserir um número em formato de string
        System.out.print("Insira um número: ");
        String input = sc.nextLine();

        // Converte a string para int, double e boolean
        int valorInt = Integer.parseInt(input);
        double valorDouble = Double.parseDouble(input);
        boolean valorBoolean = Boolean.parseBoolean(input);

        // Imprime os resultados
        System.out.println("Valor convertido para int: " + valorInt);
        System.out.println("Valor convertido para double: " + valorDouble);
        System.out.println("Valor convertido para boolean: " + valorBoolean);

        sc.close();
    }
}