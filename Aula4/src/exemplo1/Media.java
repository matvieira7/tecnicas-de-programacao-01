package exemplo1;
import java.util.Scanner; 
public class Media {

	public static void main(String[] args) {
		
		double num1,num2,num3,num4,media;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Programa Calcular Soma");
		
		System.out.println("Digite a 1° nota");
		num1 = leitor.nextInt();
		
		System.out.println("Digite a 2° nota");
		num2 = leitor.nextInt();
		
		System.out.println("Digite a 3° nota");
		num3 = leitor.nextInt();
		
		System.out.println("Digite a 4° nota");
		num4 = leitor.nextInt();
		
		media = (num1+num2+num3+num4)/4;
		System.out.println("O resultado é: " +media);
	}
}