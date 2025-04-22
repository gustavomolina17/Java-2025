public class TestaProduto {
    public static void main(String[] args) {

        Produto eletronico = new Eletronico("Smartphone", 1500.0);  // Preço base: 1500
        Produto roupa = new Roupa("Camiseta", 80.0,4);  // Preço base: 80
        Produto livro = new Livro("Java Programming", 100.0,20);  // Preço base: 100


        eletronico.exibirInformacoes();
        System.out.println();
        roupa.exibirInformacoes();
        System.out.println();
        livro.exibirInformacoes();
    }
}
