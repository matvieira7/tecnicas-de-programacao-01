package exemplo1;

import javax.swing.*;
public class Janela {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Minha janela"); // Cria o componente janela 
		
		janela.setSize(500,350); // Define o tamanho da janela
		
		janela.setVisible(true); // Torna a janela visível
		
		//janela.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximizar a janela
		
		// Encerra o programa ao fechar a janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

	}

}
