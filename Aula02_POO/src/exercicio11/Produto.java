package exercicio11;

public class Produto {
	   private String nome;
	   private float preco;
	   private int quantidade;
	   
	   public Produto(String nome, float preco, int quantidade) {
	       this.nome = nome;
	       if (preco > 0) {
	           this.preco = preco;
	       } else {
	           this.preco = 0;
	           System.out.println("Preço inválido! Definido como 0.");
	       }
	       if (quantidade > 0) {
	           this.quantidade = quantidade;
	       } else {
	           this.quantidade = 0;
	           System.out.println("Quantidade inválida! Definida como 0.");
	       }
	   }
	 
	   public void exibir() {
	       System.out.println("Produto: " + nome + ", Preço: R$" + preco + ", Quantidade: " + quantidade);
	   }
	}