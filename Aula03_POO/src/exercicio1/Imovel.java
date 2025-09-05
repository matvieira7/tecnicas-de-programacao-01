package exercicio1;

public abstract class Imovel {
	private String descricao, endereco;
	private double preco;
	
	public Imovel(String descricao, String endereco, double preco) {
		this.descricao = descricao;
		this.endereco = endereco;
		this.preco = preco;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public abstract void exibirInfo();
}