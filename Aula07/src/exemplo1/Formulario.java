package exemplo1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public Formulario() {
		super();
		
		JTextField texto = new JTextField();
		JButton botao = new JButton();
		JLabel mensagem = new JLabel("Inserindo componentes");
		
		setLayout(null);
		
		add(texto);
		add(botao);
		add(mensagem);
		
		texto.setBounds(140, 20, 160, 20);
		botao.setBounds(140, 50, 70, 20);
		mensagem.setBounds(140, 80, 200, 20);
		setSize(400,270);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Formulario();

	}

}
