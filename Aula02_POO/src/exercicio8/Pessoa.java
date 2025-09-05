package exercicio8;

public class Pessoa {
    int idade;
    String nome;
    
	public Pessoa(String nome, int idade) {
    	this.nome = nome;
    	this.idade = idade;	
}
	
	public void atualizarIdade(int novaIdade) {
		this.idade = novaIdade;
	}
	
	public void exibir() {
		System.out.println("Nome: " + nome + ", Idade: " + idade);
	}
}