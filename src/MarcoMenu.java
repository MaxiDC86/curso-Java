import javax.swing.*;

public class MarcoMenu {

	public static void main(String[] args) {
		MenuFrame mimarco = new MenuFrame();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}

class MenuFrame extends JFrame {
	public MenuFrame() {
		setBounds(500, 300, 550, 400);
		MenuLamina milamina = new MenuLamina();
		add(milamina);
	}
}

class MenuLamina extends JPanel {
	MenuLamina() {
		JMenuBar mibarra = new JMenuBar();
		JMenu archivo = new JMenu("ARCHIVO");
		JMenu edicion = new JMenu("EDICI?N");
		JMenu herramientas = new JMenu("HERRAMIENTAS");
		JMenu opciones = new JMenu("OPCIONES");
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem guardarComo = new JMenuItem("Guardar como");
		JMenuItem cortar = new JMenuItem("Cortar");
		JMenuItem copiar = new JMenuItem("Copiar");
		JMenuItem pegar = new JMenuItem("Pegar");
		JMenuItem generales = new JMenuItem("Generales");
		JMenuItem opcion1 = new JMenuItem("opciones1");
		JMenuItem opcion2 = new JMenuItem("opciones2");
		opciones.add(opcion1);
		opciones.add(opcion2);
		archivo.add(guardar);
		archivo.add(guardarComo);
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);
		edicion.addSeparator();
		edicion.add(opciones);
		herramientas.add(generales);
		mibarra.add(archivo);
		mibarra.add(edicion);
		mibarra.add(herramientas);
		add(mibarra);
	}
}