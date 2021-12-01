package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PruebaCombo {
	public static void main(String[] args) {
		MarcoCombo mimarco = new MarcoCombo();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}
}

class MarcoCombo extends JFrame {
	MarcoCombo() {
		setBounds(550, 300, 550, 400);
		LaminaCombo milamina = new LaminaCombo();
		add(milamina);
	}
}

class LaminaCombo extends JPanel {

	LaminaCombo() {
		setLayout(new BorderLayout());
		texto = new JLabel("En un lugar de la Mancha de cuyo nombre ...");
		texto.setFont(new Font("Serif", Font.PLAIN, 18));
		add(texto, BorderLayout.CENTER);
		JPanel laminaNorte = new JPanel();
		micombo = new JComboBox();
		micombo.setEditable(true);
		micombo.addItem("Serif");
		micombo.addItem("Arial");
		micombo.addItem("Monospaced");
		micombo.addItem("Times");
		EventoCombo mievento = new EventoCombo();
		micombo.addActionListener(mievento);
		laminaNorte.add(micombo);
		add(laminaNorte, BorderLayout.NORTH);
	}

	private class EventoCombo implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			texto.setFont(new Font((String) micombo.getSelectedItem(), Font.PLAIN, 18));
		}
	}

	private JLabel texto;
	private JComboBox micombo;
}