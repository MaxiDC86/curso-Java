package graficos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaArea {

	public static void main(String[] args) {
		MarcoPruebaArea mimarco = new MarcoPruebaArea();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}

class MarcoPruebaArea extends JFrame {

	public MarcoPruebaArea() {
		setTitle("Probando Área de texto");
		setBounds(500, 300, 500, 350);
		setLayout(new BorderLayout());
		laminaBotones = new JPanel();
		botonInsertar = new JButton("Insertar");
		botonInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				areaTexto.append("En un lugar de la mancha");
			}
		});
		laminaBotones.add(botonInsertar);
		botonSaltoLinea = new JButton("Salto de Línea");
		botonSaltoLinea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean saltar =! areaTexto.getLineWrap();
				areaTexto.setLineWrap(saltar);
				if(saltar) {
					botonSaltoLinea.setText("Quitar Salto");
				}else {
					
					botonSaltoLinea.setText("Salto de Línea");
				}
			}	
		});
		laminaBotones.add(botonSaltoLinea);
		add(laminaBotones, BorderLayout.SOUTH);
		areaTexto = new JTextArea(8,20);
		laminaConBarras = new JScrollPane(areaTexto);
		add(laminaConBarras, BorderLayout.CENTER);
	}
	
	private JPanel laminaBotones;
	private JButton botonInsertar, botonSaltoLinea;
	private JTextArea areaTexto;
	private JScrollPane laminaConBarras;
}