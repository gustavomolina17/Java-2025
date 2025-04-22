class VooInternacional extends Voo {
    private static final double FATOR_PRECO_INTERNACIONAL = 1.50;
    private static final double TAXA_CONVERSAO = 1.20;  // 20% de aumento para conversão de moeda


    public VooInternacional(String origem, String destino, double distancia, String data) {
        super(origem, destino, distancia, data);
    }

    @Override
    public double calcularPreco() {
        double preco = distancia * FATOR_PRECO_INTERNACIONAL;
        if (preco > 1500.00) {
            preco *= TAXA_CONVERSAO;  // Aplica a taxa de conversão
        }
        return preco;
    }
}
