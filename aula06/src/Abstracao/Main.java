package Abstracao;

public class Main {

	public static void main(String[] args) {
		
		Aviao aviao = new Aviao("Boeing");
		System.out.println(aviao.veiculo);
		aviao.locomoverOnde();
		aviao.acelerar();
	
		System.out.println("--------------------------------------------------------");
		
		Automovel automovel = new Automovel("Caminhão");
		System.out.println(automovel.veiculo);
		automovel.locomoverOnde();
		automovel.acelerar();
	}

}
