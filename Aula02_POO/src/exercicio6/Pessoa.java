package exercicio6;

public class Pessoa {
    int idade;
    String nome;
    
	public Pessoa(String nome, int idade) {
    	this.nome = nome;
    	this.idade = idade;	
}
	public void apresentar() {
		System.out.println("Olá, meu nome é " + nome + " e eu tenho " + idade + " anos.");
	}
}