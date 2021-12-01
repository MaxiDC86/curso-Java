package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Sintaxis_radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRadioSintaxis mimarco = new MarcoRadioSintaxis();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoRadioSintaxis extends JFrame {

	public MarcoRadioSintaxis() {
		setVisible(true);
		setBounds(550, 300, 500, 300);
		LaminaRadioSintaxis milamina = new LaminaRadioSintaxis();
		add(milamina);

	}
}

class LaminaRadioSintaxis extends JPanel {

	public LaminaRadioSintaxis() {

		ButtonGroup grupo1 = new ButtonGroup();
		JRadioButton boton1 = new JRadioButton("Azul", false);
		JRadioButton boton2 = new JRadioButton("Verde", false);
		JRadioButton boton3 = new JRadioButton("Rojo", false);
		boton1.addActionListener(new BotonEscucha());
		boton2.addActionListener(new BotonEscucha());
		boton3.addActionListener(new BotonEscucha());
		grupo1.add(boton1);
		grupo1.add(boton2);
		grupo1.add(boton3);
		add(boton1);
		add(boton2);
		add(boton3);
	}

	private class BotonEscucha implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getActionCommand().equals("Azul")) {
				colorFondo = Color.BLUE;
				setBackground(colorFondo);
			}
			if (e.getActionCommand().equals("Rojo")) {
				colorFondo = Color.RED;
				setBackground(colorFondo);
			}
			if (e.getActionCommand().equals("Verde")) {
				colorFondo = Color.GREEN;
				setBackground(colorFondo);
			}
		}
	}

	private Color colorFondo;
}