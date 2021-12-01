package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class Layouts_I {

	public static void main(String[] args) {
		Marco_Layout mimarco = new Marco_Layout();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		mimarco.setTitle("Prueba Layouts");
		mimarco.setBounds(200, 100, 600, 350);

	}

}

class Marco_Layout extends JFrame {

	public Marco_Layout() {

		Panel_Layout lamina = new Panel_Layout();
		add(lamina, BorderLayout.NORTH);
		Panel_Layout2 lamina2 = new Panel_Layout2();
		add(lamina2, BorderLayout.SOUTH);
	}
}

class Panel_Layout extends JPanel {

	public Panel_Layout() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 15, 15));
		add(new JButton("Amarillo"));
		add(new JButton("Rojo"));

	}
}

class Panel_Layout2 extends JPanel {

	public Panel_Layout2() {
		setLayout(new BorderLayout());
		add(new JButton("Azul"), BorderLayout.EAST);
		add(new JButton("Verde"), BorderLayout.WEST);
		add(new JButton("Negro"), BorderLayout.CENTER);

	}
}