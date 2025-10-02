package estruturas_decisao;
import java.util.Scanner;
public class Ex02_Desvio_Composto {

	public static void main(String[] args) {
		int N1,N2,R;
		Scanner s = new Scanner(System.in);
		System.out.println();
		System.out.println("Entre o 1° valor: ");
		N1 = s.nextInt();
		System.out.println("Entre o 2° valor: ");
		N2 = s.nextInt();
		R = N1 + N2;
		System.out.println();
		if(R>10) {
			System.out.println("O valor: " + R + ", é maior que 10");
		}
		else {
			System.out.println("O valor: " + R + ", é menor que 10");
		}
		System.out.println();
	}
}