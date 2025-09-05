package exercicio10;

public class Calculadora {
	   public int somar(int a, int b) {
	       return a + b;
	   }
	   
	   public int subtrair(int a, int b) {
	       return a - b;
	   }
	   
	   public int multiplicar(int a, int b) {
	       return a * b;
	   }
	   
	   public double dividir(int a, int b) {
	       if (b == 0) {
	           System.out.println("Erro: divisão por zero!");
	           return 0;
	       }
	       
	       return (double) a / b;
	   }
	}