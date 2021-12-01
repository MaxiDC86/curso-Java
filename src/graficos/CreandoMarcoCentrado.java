package graficos;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;
public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCentrado miVentanita = new MarcoCentrado();
		//miVentanita.setVisible(true);
		//miVentanita.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoCentrado extends JFrame{
	public MarcoCentrado() {
		
		setTitle("Bienvenidos a MEDICORP SOLUTIONS");
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Dimension sizeScreen = mipantalla.getScreenSize();
		int screenHeight = sizeScreen.height;
		int screenWidth = sizeScreen.width;
		setSize(screenWidth/2, screenHeight/2);
		setLocation(screenWidth/4, screenHeight /4 );
		
		setVisible(true);
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Image miIcono=mipantalla.getImage("src/graficos/crocodile.png");
		setIconImage(miIcono);
	}
	
	
}