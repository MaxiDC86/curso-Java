import javax.swing.*;
public class Entrada_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=1000.0;
		System.out.printf("%1.2f", x/3); //le da dos decimales al resultado de la divisi?n
		
		String num1= JOptionPane.showInputDialog("Introduce un n?mero: ");
		
		double num2 = Double.parseDouble(num1);
		
		System.out.print("La raiz de "+num2+" es ");
		System.out.printf("%1.4f", Math.sqrt(num2));
	}

}
