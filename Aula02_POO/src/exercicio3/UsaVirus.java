package exercicio3;

public class UsaVirus {

    public void testarVirus() {
        Virus v1 = new Virus("Coronavírus", "RNA", 5);
        Virus v2 = new Virus("Gripe", "RNA");
        Virus v3 = new Virus("Desconhecido");

        System.out.println("=== VIRUS CRIADOS ===");
        v1.mostrarInfo();
        v2.mostrarInfo();
        v3.mostrarInfo();

        System.out.println("\n=== ALTERAÇÕES ===");
        v2.alterarTipo("Mutante");
        v3.aumentarPericulosidade();

        v2.mostrarInfo();
        v3.mostrarInfo();
    }
}