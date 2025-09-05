package exercicio7;

public class Retangulo {
	private float largura;
	private float altura;
	
	public Retangulo(float largura, float altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	public float calcularArea() {
		return largura * altura;
	}
	
	public float calcularPerimetro() {
		return 2 * (largura + altura);
	}
}