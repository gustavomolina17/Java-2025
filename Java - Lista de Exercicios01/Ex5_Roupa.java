class Ex5_Roupa extends Ex5_Produto {
    private double descontoPromocional;


    public Ex5_Roupa(String nome, double precoUnitario, int quantidadeEstoque, double descontoPromocional) {
        super(nome, precoUnitario, quantidadeEstoque);
        this.descontoPromocional = descontoPromocional;
    }

    @Override
    public double calcularPrecoTotal(int quantidadeVendida) {
        double precoComDesconto = precoUnitario * (1 - descontoPromocional / 100);
        return precoComDesconto * quantidadeVendida;
    }
}
