package exercicio2;

/*Implemente uma classe chamada garrafa. 
 * A garrafa deve conter um conteúdo em ml e 
 * um status para saber se já foi aberta.*/

public class Garrafa {
	float ml;
	boolean status;
	
	public void verificarStausGarrafa() {
		if(status==true) {
			System.out.println("Garrafa Aberta!");
		}
		else {
			System.out.println("Garrafa Fechada!");
		}
		
	}

}
