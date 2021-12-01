package graficos;

import javax.swing.*;
import java.awt.event.*;

public class cambioEstado {

	public static void main(String[] args) {

		marcoEstado mimarco = new marcoEstado();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class marcoEstado extends JFrame {

	public marcoEstado() {

		setVisible(true);
		setBounds(300, 300, 500, 350);
		texto = JOptionPane.showInputDialog("Ingrese el mensaje: ");
		cambiaEstado nuevoEstado = new cambiaEstado(texto);
		addWindowStateListener(nuevoEstado);

	}

	private String texto;
}

class cambiaEstado implements WindowStateListener {

	public cambiaEstado(String texto) {

		this.texto = texto;
	}

	public void windowStateChanged(WindowEvent e) { // Ejecución del evento.

		System.out.println(texto);
		System.out.println(e.getNewState());
	}

	private String texto;
}