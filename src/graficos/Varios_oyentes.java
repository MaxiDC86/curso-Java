package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Varios_oyentes {

	public static void main(String[] args) {
		Marco_Principal mimarco = new Marco_Principal();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		mimarco.setTitle("Prueba Acción");
		mimarco.setBounds(200, 100, 600, 350);
	}

}

class Marco_Principal extends JFrame {

	Marco_Principal() {
		setTitle("Prueba Varios Oyentes");
		
		Lamina_Principal lamina = new Lamina_Principal();
		add(lamina);

	}
}

class Lamina_Principal extends JPanel{
	
	Lamina_Principal(){
		
		JButton boton_nuevo = new JButton("Nuevo");

		add(boton_nuevo);
		
		boton_cerrar = new JButton("Cerrar todos");
		add(boton_cerrar);
		
		Oyente_Nuevo miOyente = new Oyente_Nuevo();
		
		boton_nuevo.addActionListener(miOyente);
		
	}
	
	private class Oyente_Nuevo implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			Marco_Emergente marco= new Marco_Emergente(boton_cerrar);
			
			marco.setVisible(true);
			
		}
	}
	
	JButton boton_cerrar;
}

class Marco_Emergente extends JFrame{
	
	public Marco_Emergente(JButton boton_de_principal) {
		contador ++;
		setTitle("Ventana"+contador);
		setBounds(40*contador, 40*contador, 400, 400);
		
		CierraTodo oyenteCerrar = new CierraTodo();
		
		boton_de_principal.addActionListener(oyenteCerrar);
		
	}
	
	private class CierraTodo implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			dispose();
			contador = 0;
		}
		
	}
	
	private static int contador = 0;
}