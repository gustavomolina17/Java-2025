import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar ao usuário que insira a temperatura em Celsius
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();

        // Conversões
        double fahrenheit = celsius * 1.8 + 32;
        double kelvin = celsius + 273.15;
        double reaumur = celsius * 0.8;
        double rankine = celsius * 1.8 + 32 + 459.67;

        // Exibir os resultados usando String.format
        System.out.println("Temperatura em Fahrenheit: " + String.format("%.2f", fahrenheit) + " °F");
        System.out.println("Temperatura em Kelvin: " + String.format("%.2f", kelvin) + " K");
        System.out.println("Temperatura em Réaumur: " + String.format("%.2f", reaumur) + " °Re");
        System.out.println("Temperatura em Rankine: " + String.format("%.2f", rankine) + " °Ra");

        // Fechar o scanner
        sc.close();
    }
}