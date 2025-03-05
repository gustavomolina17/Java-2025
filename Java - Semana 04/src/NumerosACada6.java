public class NumerosACada6 {
    public static void main(String[] args) {
        System.out.println("Números de 0 a 1000, um a cada 6:");


        for (int i = 0; i <= 1000; i += 6) {
            System.out.print(i + " ");
        }

        System.out.println(); // Nova linha após a lista de números
    }
}