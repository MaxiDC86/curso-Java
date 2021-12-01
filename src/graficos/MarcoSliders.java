package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MarcoSliders {
	public static void main(String[] args) {
		FrameSliders mimarco = new FrameSliders();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class FrameSliders extends JFrame {

	FrameSliders() {
		setBounds(550, 400, 550, 350);
		LaminaSliders milamina = new LaminaSliders();
		add(milamina);
	}
}

class LaminaSliders extends JPanel {
	LaminaSliders() {
		setLayout(new BorderLayout());
		texto = new JLabel("En un lugar de la Mancha de cuyo nombre ...");
		texto.setFont(new Font("Serif", Font.PLAIN, 18));
		add(texto, BorderLayout.SOUTH);
		JPanel laminaNorte = new JPanel();
		control = new JSlider(1, 100, 25);
		// control.setOrientation(SwingConstants.VERTICAL);
		control.setMajorTickSpacing(25);
		control.setMinorTickSpacing(5);
		control.setPaintLabels(true);
		control.setPaintTicks(true);
		control.setFont(new Font("Serif", Font.ITALIC, 12));
		control.setSnapToTicks(true);
		EventoSlider evento = new EventoSlider();
		control.addChangeListener(evento);
		add(control, BorderLayout.NORTH);
	}

	private class EventoSlider implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			texto.setFont(new Font("Serif",Font.PLAIN, control.getValue()));
		}

	}

	private JSlider control;
	private JLabel texto;
}