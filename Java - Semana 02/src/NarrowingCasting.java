public class NarrowingCasting {
    public static void main(String[] args) {

        float valorFloat = 9.75f;
        // Faz o narrowing casting para int
        int valorInt = (int) valorFloat;

        // Imprime ambos os valores
        System.out.println("Valor original (float): " + valorFloat);
        System.out.println("Valor após o narrowing casting (int): " + valorInt);
    }
}