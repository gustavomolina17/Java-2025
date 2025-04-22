public class TestaVoo {
    public static void main(String[] args) {
        // Criando voos domésticos
        Voo voo1 = new VooDomestico("São Paulo", "Rio de Janeiro", 400, "10/05/2025");
        Voo voo2 = new VooDomestico("Belo Horizonte", "São Paulo", 600, "11/05/2025");

        // Criando voos internacionais
        Voo voo3 = new VooInternacional("São Paulo", "Londres", 10000, "15/05/2025");
        Voo voo4 = new VooInternacional("São Paulo", "Nova York", 8000, "16/05/2025");


        voo1.exibirInformacoes();
        System.out.println();
        voo2.exibirInformacoes();
        System.out.println();
        voo3.exibirInformacoes();
        System.out.println();
        voo4.exibirInformacoes();
    }
}
