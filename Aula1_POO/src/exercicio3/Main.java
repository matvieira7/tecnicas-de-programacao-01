package exercicio3;

public class Main {

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		tv1.status=false;
		tv1.canal=4;
		tv1.volume=10;
		tv1.mudarCanal(true);
		System.out.println("Canal: "+tv1.canal +"\nVolume: "+tv1.volume);
		tv1.aumentarVolume();
		tv1.mudarCanal(false);
		System.out.println("Canal: "+tv1.canal +"\nVolume: "+tv1.volume);
		tv1.diminuirVolume();
		tv1.alterarCanalManual(56);
		System.out.println("Canal: "+tv1.canal +"\nVolume: "+tv1.volume);

	}

}
