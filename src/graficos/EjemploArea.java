package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class EjemploArea {

	public static void main(String[] args) {
		MarcoArea mimarco = new MarcoArea();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoArea extends JFrame {

	public MarcoArea() {

		setBounds(500, 300, 500, 350);
		LaminaArea milamina = new LaminaArea();
		add(milamina);
		setVisible(true);
	}
}

class LaminaArea extends JPanel {

	public LaminaArea() {

		miarea = new JTextArea(8, 20);
		JScrollPane laminaBarras = new JScrollPane(miarea);
		miarea.setLineWrap(true);
		add(laminaBarras);
		JButton miboton = new JButton("dale");
		miboton.addActionListener(new GestionaArea());
		add(miboton);
	}

	private class GestionaArea implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println(miarea.getText());
		}

	}
	private JTextArea miarea;
}