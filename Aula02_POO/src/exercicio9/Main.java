package exercicio9;

public class Main {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("João");
		
		conta.exibirSaldo();
		conta.depositar(500);
		conta.sacar(200);
		conta.exibirSaldo();
		conta.sacar(400);
	}
}