package poo;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;
public class pruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Relog mirelog = new Relog();
		mirelog.enMarcha(3000, true);
		JOptionPane.showMessageDialog(null , "Pulsa aceptar para detener");
	}
}

class Relog{
	
	/*public Relog(int intervalo, boolean sonido){
		this.intervalo=intervalo;
		this.sonido=sonido;
	}*/
	public void enMarcha(int intervalo, final boolean sonido){

		class DameLaHora2 implements ActionListener{ // inner local class
			public void actionPerformed(ActionEvent evento) {
				Date ahora= new Date();
				System.out.println("Lahora actual es: "+ ahora);
				if(sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		
		ActionListener oyente = new DameLaHora2();
		Timer miterporizador = new Timer(intervalo, oyente);
		miterporizador.start();
	}


}
