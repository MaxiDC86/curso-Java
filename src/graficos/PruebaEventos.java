package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoBotones mimarco = new MarcoBotones();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBotones extends JFrame {

	public MarcoBotones() {
		setTitle("Medicorp");
		setBounds(700, 300, 500, 300);
		LaminaBotones milamina = new LaminaBotones();
		add(milamina);
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Image miIcono = mipantalla.getImage("src/graficos/crocodile.png");
		setIconImage(miIcono);
	}
}

class LaminaBotones extends JPanel {

	JButton botonListar = new JButton("Listar Pacientes");
	JButton botonAlta = new JButton("Alta de Pacientes");

	public LaminaBotones() {
		add(botonListar);
		add(botonAlta);
		botonListar.addActionListener(new ColorFondo(Color.BLUE)); // Al hacer click
		botonAlta.addActionListener(new ColorFondo(Color.PINK)); // Al hacer click
	}

	private class ColorFondo implements ActionListener {

		public ColorFondo(Color c) {

			colorDeFondo = c;
		}

		public void actionPerformed(ActionEvent e) {
			setBackground(colorDeFondo);
		}

		private Color colorDeFondo;
	}

}
