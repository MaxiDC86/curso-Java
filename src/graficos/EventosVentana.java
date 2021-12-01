package graficos;

import javax.swing.*;
import java.awt.event.*;

public class EventosVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		marcoVentana miMarco = new marcoVentana();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setTitle("Principal");
		miMarco.setBounds(100, 100, 500, 350);
		marcoVentana miMarco2 = new marcoVentana();
		miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		miMarco2.setTitle("Secundaria");
		miMarco2.setBounds(600, 100, 500, 350);
	}

}

class marcoVentana extends JFrame {

	public marcoVentana() {

		setVisible(true);

		/*mVentana oyenteVentana = new mVentana();

		addWindowListener(oyenteVentana);*/
		
		addWindowListener(new mVentana());
	}
}

class mVentana extends WindowAdapter {

	public void windowIconified(WindowEvent e) {

		System.out.println("Ventana minimizada");
	}

	public void windowOpened(WindowEvent e) {
		System.out.println("Ventana abierta");
	}

}