package exemplo1;
import java.util.Scanner; 
public class Soma {

	public static void main(String[] args) {
		
		int num1,num2,soma;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Programa Calcular Soma");
		System.out.println("Digite o 1° valor");
		num1 = leitor.nextInt();
		System.out.println("Digite o 2° valor");
		num2 = leitor.nextInt();
		soma = num1+num2;
		System.out.println("O resultado é: " +soma);
	}
}