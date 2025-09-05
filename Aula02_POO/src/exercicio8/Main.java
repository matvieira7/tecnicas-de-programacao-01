package exercicio8;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa ("Matheus", 20);
		
		p1.exibir();
		p1.atualizarIdade(21);
		p1.exibir();
	}
}