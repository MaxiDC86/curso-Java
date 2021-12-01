package graficos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class EventosRaton {

	public static void main(String[] args) {

		marcoRaton mimarco = new marcoRaton();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class marcoRaton extends JFrame {

	public marcoRaton() {

		setVisible(true);
		setBounds(300, 300, 500, 350);
		// eventoMouse raton = new eventoMouse();
		addMouseListener(new eventoMouse());
		addMouseMotionListener(new eventoMouse());

	}
}

class eventoMouse extends MouseAdapter implements MouseMotionListener {
	public void mouseClicked(MouseEvent e) {
		System.out.println("click" + e.getLocationOnScreen());

	}

	public void mousePressed(MouseEvent e) {
		if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("click izquierdo");
		}

	}

	public void mouseEntered(MouseEvent e) {

		System.out.println("El ratón ingreso a la ventana");
	}

	public void mouseExited(MouseEvent e) {

		System.out.println("El ratón salio de la ventana");
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("El ratón esta arrastrando");
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("El ratón se esta moviendo");
	}
}