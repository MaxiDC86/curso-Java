import javax.swing.*;
public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre");
		String edad=JOptionPane.showInputDialog("Introduce tu edad");
		int edad_usuario =Integer.parseInt(edad);//cambiamos edad de string a int
		edad_usuario ++;
		System.out.println("Hola "+ nombre_usuario + " el año que viene tienes "+edad_usuario+ " años");
	}

}
