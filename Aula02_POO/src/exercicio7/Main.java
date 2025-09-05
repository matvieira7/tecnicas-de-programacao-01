package exercicio7;

public class Main {

	public static void main(String[] args) {
		Retangulo r = new Retangulo(5, 3);
		
		System.out.println("Área: " + r.calcularArea());
		
		System.out.println("Perímetro: " + r.calcularPerimetro());
	}
}