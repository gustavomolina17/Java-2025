class Eletronico extends Produto {

    private static final int quantidadeEstoque = 0;

    public Eletronico(String nome, double precoBase) {
        super(nome, precoBase, quantidadeEstoque);
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase * 0.90;  // Desconto de 10%
    }
}
