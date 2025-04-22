public class MainFuncionario {
    public static void main(String[] args) {
        // Criando funcionários
        FuncionarioComum funcionario1 = new FuncionarioComum(3000.0);  // Salário fixo de 3000
        Gerente gerente1 = new Gerente(5000.0, 1500.0);  // Salário fixo de 5000 + bônus de 1500
        Diretor diretor1 = new Diretor(7000.0, 2000.0);  // Salário fixo de 7000 + participação nos lucros de 2000

        // Exibindo os pagamentos
        System.out.println("Pagamento do Funcionário Comum: R$ " + funcionario1.calcularPagamento());
        System.out.println("Pagamento do Gerente: R$ " + gerente1.calcularPagamento());
        System.out.println("Pagamento do Diretor: R$ " + diretor1.calcularPagamento());
    }
}
