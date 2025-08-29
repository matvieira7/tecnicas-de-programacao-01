package exemplos;

public class Main {

	public static void main(String[] args) {
		Automovel auto = new Automovel();
		Automovel autoComp = new Automovel("Vermelho", "Celta", 15000.50);
		System.out.println(auto);
		autoComp.visualizarAutomovel();

	}

}
