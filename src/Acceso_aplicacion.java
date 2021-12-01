import javax.swing.*;
public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "Maxi";
		String entrada = "";
		int counter = 3;
		while(clave.equals(entrada)==false & counter > 0) {
			
			entrada=JOptionPane.showInputDialog("Ingrese la contraseña");
			counter --;
			if (clave.equals(entrada)==true) {
				
				System.out.println("Has ingresado");
			}
			else if(clave.equals(entrada)==false & counter > 0){
				System.out.println("La contraseña es incorrecta, vuelva a ingresarla");
				
			}
			else {
				System.out.println("Has agotado todos los intentos");
			}
			
		}
	}

}
