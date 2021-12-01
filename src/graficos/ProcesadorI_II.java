package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.text.StyledEditorKit;
import javax.swing.text.rtf.RTFEditorKit;
import javax.swing.*;

public class ProcesadorI_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuProcesador_II mimarco = new MenuProcesador_II();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}
}

class MenuProcesador_II extends JFrame {

	public MenuProcesador_II() {
		setBounds(500, 300, 550, 400);
		LaminaProcesador_II milamina = new LaminaProcesador_II();
		add(milamina);
	}
}

class LaminaProcesador_II extends JPanel {
	public LaminaProcesador_II() {

		setLayout(new BorderLayout());
		JPanel laminaMenu = new JPanel();
		JMenuBar mibarra = new JMenuBar();
		// ------------------------------------
		archivo = new JMenu("Archivo");
		fuente = new JMenu("Fuente");
		estilo = new JMenu("Estilo");
		size = new JMenu("Tamaño");
		color = new JMenu("Color");
		// -------------------------------------Archivo
		configura_menu("Guardar", "archivo", "Arial", 9, 10, "src/graficos/BOLD.png");
		configura_menu("Guardar como...", "archivo", "Arial", 9, 10, "src/graficos/BOLD.png");
		// ------------------------------------Fuente
		configura_menu("Arial", "fuente", "Arial", 9, 10, "src/graficos/BOLD.png");
		configura_menu("Courier", "fuente", "Courier", 1, 1, "src/graficos/BOLD.png");
		configura_menu("Verdana", "fuente", "Verdana", 1, 1, "src/graficos/BOLD.png");
		configura_menu("Serif", "fuente", "Serif", 1, 1, "src/graficos/BOLD.png");
		// ----------------------------------------Estilo
		configura_menu("Negrita", "estilos", "", Font.BOLD, 1, "src/graficos/BOLD.png");
		configura_menu("Cursiva", "estilos", "", Font.ITALIC, 1, "src/graficos/ITALIC.png");
		/*
		 * JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita", new
		 * ImageIcon("src/graficos/BOLD.png")); JCheckBoxMenuItem cursiva = new
		 * JCheckBoxMenuItem("Cursiva", new ImageIcon("src/graficos/ITALIC.png"));
		 * negrita.addActionListener(new StyledEditorKit.BoldAction());
		 * cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		 * estilo.add(negrita); estilo.add(cursiva);
		 */
		// ----------------------------------------Tamaño
		configura_menu("10", "tamaño", "", 9, 10, "");
		configura_menu("12", "tamaño", "", 9, 12, "");
		configura_menu("16", "tamaño", "", 9, 16, "");
		configura_menu("20", "tamaño", "", 1, 20, "");
		configura_menu("24", "tamaño", "", 1, 24, "");
		configura_menu("26", "tamaño", "", 1, 26, "");
		configura_menu("28", "tamaño", "", 1, 28, "");
		configura_menu("30", "tamaño", "", 1, 30, "");
		// ----------------------------------------Color
		configura_menu("negro", "color", "", 1, 24, "src/graficos/BLACK.png");
		configura_menu("azul", "color", "", 1, 24, "src/graficos/BLUE.png");
		configura_menu("rojo", "color", "", 1, 24, "src/graficos/RED.png");
		configura_menu("verde", "color", "", 1, 24, "src/graficos/GREEN.png");
		configura_menu("amarillo", "color", "", 1, 24, "src/graficos/YELLOW.png");
		// -----------------------------------------
		mibarra.add(archivo);
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(size);
		mibarra.add(color);
		laminaMenu.add(mibarra);
		add(laminaMenu, BorderLayout.NORTH);
		text = new JTextPane();
		add(text, BorderLayout.CENTER);
		// -----------------------------------------Menu emergente
		JPopupMenu emergente = new JPopupMenu();
		JMenuItem negritaE = new JMenuItem("Negrita");
		JMenuItem cursivaE = new JMenuItem("Cursiva");
		negritaE.addActionListener(new StyledEditorKit.BoldAction());
		cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
		emergente.add(negritaE);
		emergente.add(cursivaE);
		text.setComponentPopupMenu(emergente);
	}

	public void configura_menu(String rotulo, String menu, String tipo_letra, int style, int tam,
			String icono_location) {
		ImageIcon icono = new ImageIcon(icono_location);
		JMenuItem elem_menu = new JMenuItem(rotulo, icono);
		if (menu == "fuente") {
			fuente.add(elem_menu);
			elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiaLetra", tipo_letra));
		} else if (menu == "estilos") {
			estilo.add(elem_menu);
			if (rotulo == "Negrita") {
				elem_menu.addActionListener(new StyledEditorKit.BoldAction());
			}
			if (rotulo == "Cursiva") {
				elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
			}
		} else if (menu == "tamaño") {
			size.add(elem_menu);
			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño", tam));
		} else if (menu == "color") {
			color.add(elem_menu);
			if (rotulo == "azul") {
				color_elegido = Color.BLUE;
			}
			if (rotulo == "negro") {
				color_elegido = Color.BLACK;
			}
			if (rotulo == "rojo") {
				color_elegido = Color.RED;
			}
			if (rotulo == "verde") {
				color_elegido = Color.GREEN;
			}
			if (rotulo == "amarillo") {
				color_elegido = Color.YELLOW;
			}
			elem_menu.addActionListener(new StyledEditorKit.ForegroundAction("cambiaColor", color_elegido));
		}
	}

	private JTextPane text;
	private JMenu archivo, fuente, estilo, size, color;
	private Color color_elegido;
}