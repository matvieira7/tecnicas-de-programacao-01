package exemplos;

public class Automovel {
	private String cor;
	private double preco;
	private String modelo;
	
	public Automovel() {
		System.out.println("Construtor padrão da classe Automóvel!");
	}
	public Automovel(String modelo,double preco) {
		cor = "Preta";
		this.modelo = modelo;
		this.preco = preco;
	}
	
	public Automovel(String cor, String modelo, double preco) {
		this.cor = cor;
		this.modelo = modelo;
		this.preco = preco;
	}
	public void visualizarAutomovel() {
		System.out.println("Cor: "+this.cor+"\nModelo: "+this.modelo+"\nValor: R$"+this.preco);
	}

}
