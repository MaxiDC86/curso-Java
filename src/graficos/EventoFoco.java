package graficos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;

public class EventoFoco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoFoco mimarco = new MarcoFoco();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoFoco extends JFrame {

	public MarcoFoco() {

		setVisible(true);
		setBounds(300, 300, 500, 350);
		add(new LaminaFoco());
	}
}

class LaminaFoco extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		setLayout(null); // se elimina la ubicación automatica.
		cuadro1 = new JTextField();
		cuadro2 = new JTextField();
		cuadro1.setBounds(120, 10, 150, 20);
		cuadro2.setBounds(120, 50, 150, 20);
		add(cuadro1);
		add(cuadro2);
		LanzaFocos elFoco = new LanzaFocos();
		cuadro1.addFocusListener(elFoco);

	}

	private class LanzaFocos implements FocusListener {

		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub

		}

		public void focusLost(FocusEvent e) {

			String email = cuadro1.getText();
			int arroba = 0;
			for (int i = 0; i < email.length(); i++) {
				if (email.charAt(i) == '@') {
					arroba = arroba + 1;
				}
			}
			if (arroba == 1) {
				System.out.println("El email es válido");
			} else {
				System.out.println("El email no es válido");
			}
		}
	}

	JTextField cuadro1;
	JTextField cuadro2;
}
