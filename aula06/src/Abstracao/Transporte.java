package Abstracao;

public abstract class Transporte {
	String veiculo;
	//Método construtor, para inicializar o veiculo na classe Avião
	public Transporte(String veiculo) {
		this.veiculo = veiculo;
	}
	
	public abstract void locomoverOnde();
	
	public void acelerar() {
		System.out.println(veiculo + " Está se acelerando!");
	}
}
