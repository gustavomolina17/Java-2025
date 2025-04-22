public class Ex1_Main {
    public static void main(String[] args) {

        Ex1_Forma forma1 = new Ex1_Circulo(5);


        Ex1_Forma forma2 = new Ex1_Retangulo(4, 6);


        System.out.println("Círculo:");
        System.out.println("Área: " + forma1.calcularArea());
        System.out.println("Perímetro: " + forma1.calcularPerimetro());

        System.out.println("\nRetângulo:");
        System.out.println("Área: " + forma2.calcularArea());
        System.out.println("Perímetro: " + forma2.calcularPerimetro());
    }
}
