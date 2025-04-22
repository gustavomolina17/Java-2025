class Produto {
    protected String nome;
    protected double precoBase;


    public Produto(String nome, double precoBase, int quantidadeEstoque) {
        this.nome = nome;
        this.precoBase = precoBase;
    }


    public double calcularPrecoFinal() {
        return precoBase;
    }


    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço base: R$ " + precoBase);
        System.out.println("Preço final: R$ " + calcularPrecoFinal());
    }
}
