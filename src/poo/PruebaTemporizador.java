package poo;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DameLaHora oyente=new DameLaHora(); // ActionListener oyente=new DameLaHora();
		
		Timer miTemporizador=new Timer(5000, oyente );
		
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar");
		
		System.exit(0);
		
		}

}

class DameLaHora implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		Date ahora=new Date();
		System.out.println("la Hora actual es: "+ahora);
		
		Toolkit.getDefaultToolkit().beep();
		
	}
}