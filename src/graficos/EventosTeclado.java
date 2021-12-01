package graficos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class EventosTeclado {

	public static void main(String[] args) {
		marcoConTeclas mimarco = new marcoConTeclas();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class marcoConTeclas extends JFrame {

	public marcoConTeclas() {
		setVisible(true);
		setBounds(300, 300, 500, 350);
		eventoDeTeclado tecla = new eventoDeTeclado();
		addKeyListener(tecla);
	}
}

class eventoDeTeclado implements KeyListener {

	public void keyTyped(KeyEvent e) {
		System.out.println("Typed " + e.getKeyChar());
	}

	public void keyPressed(KeyEvent e) {
		System.out.println("Pressed " + e.getKeyCode());
	}

	public void keyReleased(KeyEvent e) {
	}
}