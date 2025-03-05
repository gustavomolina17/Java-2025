public class Casting {
    public static void main(String[] args) {

        double valorDouble = 9.99;

        // CASTING
        int valorInt = (int) valorDouble;

        System.out.println("Valor original (double): " + valorDouble);
        System.out.println("Valor após o casting (int): " + valorInt);

        System.out.println("Nota: O casting de double para int resulta na perda da parte decimal. " +
                "Neste caso, 9.99 se torna 9.");
    }
}