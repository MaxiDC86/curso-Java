package graficos;
import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		miMarco marco1 = new miMarco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class miMarco extends JFrame{
	
	public miMarco() {
		
		/*setSize(500,300);
		setLocation(300,400);
		*/
		setBounds(500,300,450,400);
		setTitle("Bienvenidos a MEDICORP SOLUTIONS");
		setResizable(false);
		setIconImage(null);
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		
	}
}