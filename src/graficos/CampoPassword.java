package graficos;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class CampoPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoPassword mimarco = new MarcoPassword();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoPassword extends JFrame {
	public MarcoPassword() {
		setBounds(500, 300, 500, 350);
		LaminaPassword milamina = new LaminaPassword();
		add(milamina);
		setVisible(true);
	}
}

class LaminaPassword extends JPanel {
	public LaminaPassword() {

		setLayout(new BorderLayout());
		JPanel lamina_superior= new JPanel();
		lamina_superior.setLayout(new GridLayout(2,2));
		add(lamina_superior,BorderLayout.NORTH );
		JLabel etiqueta1 = new JLabel("Usuario");
		JLabel etiqueta2 = new JLabel("Contraseña");
		JTextField c_usuario = new JTextField(15);
		EscuchaPassword mievento = new EscuchaPassword();
		c_password=  new JPasswordField(15);
		c_password.getDocument().addDocumentListener(mievento);
		lamina_superior.add(etiqueta1);
		lamina_superior.add(c_usuario);
		lamina_superior.add(etiqueta2);
		lamina_superior.add(c_password);
		JButton enviar =new JButton("enviar");
		add(enviar,BorderLayout.SOUTH);
		
	}

	private class EscuchaPassword implements DocumentListener {
		public void insertUpdate(DocumentEvent e) {
			password = c_password.getPassword();
			if(password.length<8||password.length>12) {
				c_password.setBackground(Color.RED);
			}
			else {
				c_password.setBackground(Color.WHITE);
			}
		}
		public void removeUpdate(DocumentEvent e) {
			password = c_password.getPassword();
			if(password.length<8||password.length>12) {
				c_password.setBackground(Color.RED);
			}
			else {
				c_password.setBackground(Color.WHITE);
			}
		}
		public void changedUpdate(DocumentEvent e) {
		}
	}
	private JPasswordField c_password;
	private char [] password;
}