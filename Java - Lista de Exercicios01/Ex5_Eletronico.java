class Ex5_Eletronico extends Ex5_Produto {
    private double desconto;

    // Construtor para inicializar o produto eletrônico com desconto
    public Ex5_Eletronico(String nome, double precoUnitario, int quantidadeEstoque, double desconto) {
        super(nome,precoUnitario,quantidadeEstoque);
        this.desconto = desconto;
    }


    @Override
    public double calcularPrecoTotal(int quantidadeVendida) {
        double precoComDesconto = precoUnitario * (1 - desconto / 100);
        return precoComDesconto * quantidadeVendida;
    }
}
