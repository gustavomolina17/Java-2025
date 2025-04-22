class Livro extends Produto {


    public Livro(String nome, double precoBase, int quantidadeEstoque) {
        super(nome, precoBase, quantidadeEstoque);
    }


    @Override
    public double calcularPrecoFinal() {
        return precoBase * 0.95;  // Desconto de 5%
    }
}
