public class WideningCasting {
    public static void main(String[] args) {
        // Declara uma variável do tipo byte e atribui um valor
        byte valorByte = 10;

        // Faz o widening casting para double
        double valorDouble = valorByte;

        // Imprime ambos os valores
        System.out.println("Valor original (byte): " + valorByte);
        System.out.println("Valor após o widening casting (double): " + valorDouble);
    }
}