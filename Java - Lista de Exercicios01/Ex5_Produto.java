public class Ex5_Produto {
        protected String nome;
        protected double precoUnitario;
        protected int quantidadeEstoque;

        // Construtor para inicializar os atributos do produto
        public Ex5_Produto(String nome, double precoUnitario, int quantidadeEstoque) {
            this.nome = nome;
            this.precoUnitario = precoUnitario;
            this.quantidadeEstoque = quantidadeEstoque;
        }

        public double calcularPrecoTotal(int quantidadeVendida) {
            return precoUnitario * quantidadeVendida;
        }

        // Exibir informações do produto
        public void exibirInformacoes(int quantidadeVendida) {
            System.out.println("Produto: " + nome);
            System.out.println("Preço unitário: R$ " + precoUnitario);
            System.out.println("Quantidade em estoque: " + quantidadeEstoque);
            System.out.println("Preço total: R$ " + calcularPrecoTotal(quantidadeVendida));
        }
    }



