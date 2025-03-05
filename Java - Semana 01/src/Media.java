public class Media {
    public static void main(String[] args) {
        // Números para a primeira média
        double n1 = 9;
        double n2 = 8;
        double n3 = 7;

        // Números para a segunda média
        double n4 = 4;
        double n5 = 5;
        double n6 = 6;

        // Calcular a média dos números 8, 9 e 7
        double media1 = (n1+n2+n3)/3;
        // Calcular a média dos números 4, 5 e 6
        double media2 = (n4+n5+n6)/3;

        // Calcular a soma das duas médias
        double somaDasMedias = media1 + media2;

        // Calcular a média das médias
        double mediaDasMedias = (media1 + media2) / 2;

        // Exibir os resultados
        System.out.println("Média dos números 8, 9 e 7: " + media1);
        System.out.println("Média dos números 4, 5 e 6: " + media2);
        System.out.println("Soma das duas médias: " + somaDasMedias);
        System.out.println("Média das médias: " + mediaDasMedias);
    }
}