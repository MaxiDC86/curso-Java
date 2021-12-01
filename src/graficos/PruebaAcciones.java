package graficos;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
import java.io.*;

public class PruebaAcciones {
	public static void main(String[] args) {
		MarcoAccion mimarco = new MarcoAccion();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		mimarco.setTitle("Prueba Acción");
		mimarco.setBounds(200, 100, 600, 350);
	}
}

class MarcoAccion extends JFrame {
	public MarcoAccion() {

		
		PanelAccion lamina = new PanelAccion();
		add(lamina);
	}
}

class PanelAccion extends JPanel {
	public PanelAccion() {
		AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/graficos/YELLOW.png"),
				Color.YELLOW);
		AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/graficos/BLUE.png"), Color.BLUE);
		AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/graficos/RED.png"), Color.RED);
		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl C"), "fondo_rojo");
		ActionMap mapaAccion = getActionMap();
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		mapaAccion.put("fondo_azul", accionAzul);
		mapaAccion.put("fondo_rojo", accionRojo);
		JMenu menu = new JMenu("Color");
		menu.add(accionAmarillo);
		menu.add(accionRojo);
		menu.add(accionAzul);

	}

	private class AccionColor extends AbstractAction {
		public AccionColor(String nombre, Icon icono, Color color_boton) {
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color " + nombre);
			putValue("color_de_fondo", color_boton);
		}

		public void actionPerformed(ActionEvent e) {
			Color c = (Color) getValue("color_de_fondo");
			setBackground(c);
			System.out.println("nombre " + getValue(Action.NAME) + "Description" + getValue(Action.SHORT_DESCRIPTION));
		}
	}
}
