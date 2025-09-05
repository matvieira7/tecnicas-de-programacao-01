package exercicio1;

public class Apartamento extends Imovel {
    private boolean possuiSacada;

    public Apartamento(String descricao, String endereco, double preco, boolean possuiSacada) {
        super(descricao, endereco, preco);
        this.possuiSacada = possuiSacada;
    }

    @Override
    public void exibirInfo() {
        System.out.println("=== Apartamento ===");
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Possui sacada: " + (possuiSacada ? "Sim" : "Não"));
    }
}
