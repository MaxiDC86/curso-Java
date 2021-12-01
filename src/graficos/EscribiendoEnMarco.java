package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;

import javax.imageio.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConTexto mimarco = new MarcoConTexto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConTexto extends JFrame {

	public MarcoConTexto() {

		setTitle("Bienvenidos a MEDICORP SOLUTIONS");
		Toolkit mipantalla = Toolkit.getDefaultToolkit();

		setVisible(true);
		setSize(600, 450);
		setLocation(400, 200);
		setTitle("Medicorp Solutions");
		setResizable(false);
		String texto = "Menu de opciones disponibles:";
		Lamina miLamina = new Lamina(texto);
		add(miLamina);

		Image miIcono = mipantalla.getImage("src/graficos/crocodile.png");
		setIconImage(miIcono);

	}
}

class Lamina extends JPanel {

	public Lamina(String texto) {

		this.texto = texto;
	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Color AzulClaro = new Color(7, 104, 197);

		Graphics2D g2 = (Graphics2D) g;

		Font mifuente = new Font("Courier", Font.BOLD, 26);

		Rectangle2D rectangulo = new Rectangle2D.Double(5, 5, 575, 400);
		g2.setPaint(AzulClaro);
		g2.fill(rectangulo);

		g2.setPaint(Color.BLACK);
		g2.setFont(mifuente);
		g2.drawString(texto, 10, 30);
		// File miImagen= new File("src/graficos/jet-ski.png");
		try {
			imagen = ImageIO.read(new File("src/graficos/jet-ski.png"));
		} catch (IOException e) {
			System.out.println("La imagen no se encuentra");
		}

		int imagenWidth = imagen.getHeight(this);
		int imagenHeight = imagen.getHeight(this);
		g2.drawImage(imagen, 0, 350, null);
		for (int i = 0; i < 600; i = i + imagenWidth) {
			g2.copyArea(0, 350, imagenWidth + 2, imagenHeight, i, 0);
		}

	}

	private Image imagen;
	private String texto;
}
