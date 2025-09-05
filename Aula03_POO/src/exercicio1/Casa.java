package exercicio1;

public class Casa extends Imovel {
    private float tamanhoQuintal;

    public Casa(String descricao, String endereco, double preco, float tamanhoQuintal) {
        super(descricao, endereco, preco);
        this.tamanhoQuintal = tamanhoQuintal;
    }

    public void exibirInfo() {
        System.out.println("=== Casa ===");
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Tamanho do quintal: " + tamanhoQuintal + " m²");
    }
}
