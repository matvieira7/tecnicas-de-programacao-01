package exercicio1;

public class Main {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(123, "João");
		
		System.out.println("SEM ALTERAR");
		pedido1.retornarCliente();
		pedido1.retornarDescricao();
		pedido1.todosDados();
		
		pedido1.alterarCliente("Ronaldo");
		pedido1.alterarDescricao("Sei la");
		
		System.out.println("ALTERADOS");
		pedido1.retornarCliente();
		pedido1.retornarDescricao();
		pedido1.todosDados();
		

	}

}