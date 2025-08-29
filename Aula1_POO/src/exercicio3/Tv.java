package exercicio3;

public class Tv {
	boolean status;
	int volume, canal;
	
	public void alterarCanalManual (int numCanal) {
		if (status==true) {//verificando se a TV está ligada
			canal = numCanal;
		}
	}
	
	/*public void mudarCanal() {
		if(status==true) {
			canal = canal+1;
		}
	}

		else {
			System.out.println("A TV precisa estar ligada");
		}*/
	public void mudarCanal(boolean alterar) {
		if(status==true) {//Verifica se a TV está ligada
			if(alterar==true) {//aumentar canal
				canal++;
			}
			else {
				canal--; //diminuir canal
			}
		}
		else {
			System.out.println("A TV precisa estar ligada");
		}
	}
	
	public void aumentarVolume() {
		if(status==true) {
			volume++;
		}
	}
		public void diminuirVolume() {
			if(status==true) {
				volume--;
			}
		}
	}