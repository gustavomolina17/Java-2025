class Gerente extends Funcionario {
    private double bonus;

    // Construtor para inicializar o salário fixo e o bônus do gerente
    public Gerente(double salarioFixo, double bonus) {
        super(salarioFixo);
        this.bonus = bonus;
    }

    @Override
    public double calcularPagamento() {
        return salarioFixo + bonus;
    }
}