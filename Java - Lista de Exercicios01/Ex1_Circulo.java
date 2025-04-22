public class Ex1_Circulo  extends Ex1_Forma {
        private double raio;


        public Ex1_Circulo(double raio) {
            this.raio = raio;
        }

        @Override
        public double calcularArea() {
            return Math.PI * Math.pow(raio, 2);
        }

        @Override
        public double calcularPerimetro() {
            return 2 * Math.PI * raio;
        }
    }







