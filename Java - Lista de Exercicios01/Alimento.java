class Alimento extends Ex5_Produto {


    public Alimento(String nome, double precoUnitario, int quantidadeEstoque) {
        super(nome, precoUnitario, quantidadeEstoque);
    }


    @Override
    public double calcularPrecoTotal(int quantidadeVendida) {
        return precoUnitario * quantidadeVendida;
    }
}
