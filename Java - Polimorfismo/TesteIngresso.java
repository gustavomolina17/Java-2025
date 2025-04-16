 // Classe principal para teste
    public class TesteIngresso {
        public static void main(String[] args) {
            Normal ingressoNormal = new Normal(50.0);
            ingressoNormal.imprimeValor();
            ingressoNormal.imprimeTipo();

            VIP ingressoVIP = new VIP(50.0, 30.0);
            System.out.println("Valor do ingresso VIP: R$ " + ingressoVIP.getValorVIP());

            CamaroteInferior camaroteInferior = new CamaroteInferior(50.0, 20.0, "Setor A");
            camaroteInferior.imprimeLocalizacao();
            System.out.println("Valor do Camarote Inferior: R$ " + camaroteInferior.getValorVIP());

            CamaroteSuperior camaroteSuperior = new CamaroteSuperior(50.0, 50.0);
            System.out.println("Valor do Camarote Superior: R$ " + camaroteSuperior.getValorIngresso());
        }
    }

