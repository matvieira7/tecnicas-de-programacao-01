package exercicio2;

import exercicio1.Pedido;

public class Main {
    public static void main(String[] args) {
        Pedido pedido2 = new Pedido(456, "Maria");

        System.out.println("=== PEDIDO INICIAL ===");
        pedido2.retornarCliente();
        pedido2.retornarDescricao();
        pedido2.todosDados();

        pedido2.alterarCliente("Ana");
        pedido2.alterarDescricao("Entrega urgente");

        System.out.println("\n=== PEDIDO ALTERADO ===");
        pedido2.retornarCliente();
        pedido2.retornarDescricao();
        pedido2.todosDados();
    }
}