public class NumerosDivisiveisPor5 {
    public static void main(String[] args) {
        System.out.println("Números divisíveis por 5 de 0 a 1000:");

        // Imprime os números divisíveis por 5 de 0 a 1000
        for (int i = 0; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println(); // Nova linha após a lista de números
    }
}