package exercicio1;

public class Chacara extends Imovel {
    private boolean possuiPiscina;
    private float metragemDaCasa;

    public Chacara(String descricao, String endereco, double preco, boolean possuiPiscina, float metragemDaCasa) {
        super(descricao, endereco, preco);
        this.possuiPiscina = possuiPiscina;
        this.metragemDaCasa = metragemDaCasa;
    }

    public void exibirInfo() {
        System.out.println("=== Chácara ===");
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Possui piscina: " + (possuiPiscina ? "Sim" : "Não"));
        System.out.println("Metragem da casa: " + metragemDaCasa + " m²");
    }
}
