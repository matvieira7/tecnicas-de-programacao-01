package exercicio3;

public class Virus {
    private String nome;
    private String tipo;
    private int nivelPericulosidade;

    public Virus(String nome, String tipo, int nivelPericulosidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivelPericulosidade = nivelPericulosidade;
    }

    public Virus(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivelPericulosidade = 1;
    }

    public Virus(String nome) {
        this.nome = nome;
        this.tipo = "Desconhecido";
        this.nivelPericulosidade = 1;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome + ", Tipo: " + tipo + ", Nível de Periculosidade: " + nivelPericulosidade);
    }

    public void aumentarPericulosidade() {
        nivelPericulosidade++;
    }

    public void alterarTipo(String tipo) {
        this.tipo = tipo;
    }
}