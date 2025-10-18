package interfaces;

public class Vendedor implements Loja{

	@Override
	public void inserir() {
		System.out.println("Inserindo vendedor");
	}

	@Override
	public void excluir() {
		System.out.println("Excluindo vendedor");
	}

	@Override
	public void localizar() {
		System.out.println("Localizando vendedor");
	}
	
}
