class Roupa extends Produto {


    public Roupa(String nome, double precoBase, int quantidadeEstoque) {
        super(nome, precoBase,quantidadeEstoque);
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase * 0.80;  // Desconto de 20%
    }
}
