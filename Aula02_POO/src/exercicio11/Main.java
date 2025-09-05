package exercicio11;

public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 3500, 2);
		Produto p2 = new Produto("Mouse", -50, -3);
		
		p1.exibir();
		p2.exibir();
	}
}