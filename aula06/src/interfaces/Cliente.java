package interfaces;

public class Cliente implements Loja {

	@Override
	public void inserir() {
		System.out.println("Inserindo cliente");
	}

	@Override
	public void excluir() {
		System.out.println("Excluindo cliente");
	}

	@Override
	public void localizar() {
		System.out.println("Localizando cliente");
	}

}
