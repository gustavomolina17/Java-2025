// Classe CamaroteSuperior que herda VIP
class CamaroteSuperior extends VIP {

    public CamaroteSuperior(double valor, double valorAdicional) {
        super(valor, valorAdicional);
    }

    public double getValorIngresso() {
        return getValorVIP(); // mesma lógica do VIP, mas pode ter regras adicionais se necessário
    }
}
