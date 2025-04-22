public class Main_Ex5 {
    public static void main(String[] args) {
        // Criando produtos eletrônicos
        Ex5_Produto produto1 = new Ex5_Eletronico("Smartphone", 1500.0, 100, 10);  // Desconto de 10%

        // Criando produtos de roupa
        Ex5_Produto produto2 = new Ex5_Roupa("Camiseta", 80.0, 50, 20);  // Desconto promocional de 20%

        // Criando produtos alimentícios
        Ex5_Produto produto3 = new Alimento("Arroz", 5.0, 200);  // Preço por quilo

        // Exibindo informações e preços totais para uma quantidade vendida
        int quantidadeVendida1 = 3;
        produto1.exibirInformacoes(quantidadeVendida1);

        System.out.println();

        int quantidadeVendida2 = 10;
        produto2.exibirInformacoes(quantidadeVendida2);

        System.out.println();

        int quantidadeVendida3 = 15;
        produto3.exibirInformacoes(quantidadeVendida3);
    }
}
