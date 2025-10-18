package Abstracao;

public class Automovel extends Transporte {

	public Automovel(String veiculo) {
		super(veiculo);
	}

	@Override //sobrescrita 
	
	// Todo método abstrato PRECISA ser implementado
	public void locomoverOnde() {
			System.out.println("Se locomove na terra");
	}

	
}
