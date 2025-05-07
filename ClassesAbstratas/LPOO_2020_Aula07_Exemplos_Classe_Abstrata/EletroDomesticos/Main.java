public class Main {
	public static void main(String[] args) {
		TV tv1 = new TV(52, 110);
		Radio radio1 = new Radio(220);
		tv1.ligar();
		radio1.ligar();
		radio1.desligar();
		System.out.print("Neste momento a TV está ");
		System.out.println(tv1.isLigado() ? "ligada" : "desligada");
		System.out.print("e o Rádio está ");
		System.out.println(radio1.isLigado() ? "ligado." : "desligado.");
	}
}