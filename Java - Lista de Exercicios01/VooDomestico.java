class VooDomestico extends Voo {
    private static final double FATOR_PRECO_DOMESTICO = 0.50;

        public VooDomestico(String origem, String destino, double distancia, String data) {

            super(origem, destino, distancia, data);
    }

    @Override
    public double calcularPreco() {
        return distancia * FATOR_PRECO_DOMESTICO;
    }
}
