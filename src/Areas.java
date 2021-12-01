import java.util.*;
import javax.swing.*;
public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Elige una opci�n: \n1: Cuadrado \n2: Rect�ngulo  \n3: Tri�ngulo \n4: C�rculo");
		
		int figura = entrada.nextInt();
		
		switch(figura) {
		
		case 1:
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			System.out.println("El area del cuadrado es: "+Math.pow(lado, 2));
			break;
		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El �rea del rect�ngulo es: "+(base*altura));
			break;
		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El �rea del trit�ngulo es: "+(base*altura/2));
			break;
		case 4:
			double radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			double area = Math.pow(radio, 2)*Math.PI;
			area = Math.round(radio);
			System.out.print("El �rea del circulo es: ");
			System.out.printf("%1.3f",area);
			break;
		default:
			System.out.println("La opci�n no es correcta");
		}

	}

}
