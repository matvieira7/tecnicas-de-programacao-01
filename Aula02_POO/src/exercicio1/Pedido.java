package exercicio1;

public class Pedido {
    private int numero;
    private String nome_do_cliente, descricao;

    public Pedido(int numero, String nome_do_cliente) {
        this.numero = numero;
        this.nome_do_cliente = nome_do_cliente;
        descricao = "não sei";
    }

    public void alterarCliente(String nome_do_cliente) {
        this.nome_do_cliente = nome_do_cliente;
    }

    public void alterarDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void retornarCliente() {
        System.out.println("Cliente: " + this.nome_do_cliente);
    }

    public void retornarDescricao() {
        System.out.println("Descrição: " + this.descricao);
    }

    public void todosDados() {
        System.out.println("Cliente: " + this.nome_do_cliente + "\nDescrição: " + this.descricao + "\nNúmeros: " + this.numero);
    }
}