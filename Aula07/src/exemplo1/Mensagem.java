package exemplo1;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class Mensagem {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Mensagem");
		JLabel texto = new JLabel("Interface gráfica em Java");
		
		// Adiciona o rótulo(Label) à Frame(janela)
		janela.getContentPane().add(texto);
		
		janela.setLayout(null);// Define o layout nulo
		
		 // Define posição e tamanho do rótulo
		texto.setBounds(70, 50, 200, 20);
		texto.setForeground(Color.red); // Cor do texto
		
		janela.setSize(300,150);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
