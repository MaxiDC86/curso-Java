package poo;
import javax.swing.*;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche Renault= new Coche();//Instanciar una clase
	
		System.out.println(Renault.dime_datos_generales());
		
		Renault.establece_color(JOptionPane.showInputDialog("Introduce color deseado"));
		System.out.println(Renault.dime_color());
		
		Renault.configura_asientos(JOptionPane.showInputDialog("¿Con asientos de cuero?(si/no)"));
		System.out.println(Renault.dime_asientos());
		
		Renault.configura_climatizador(JOptionPane.showInputDialog("¿Con climatizador?(si/no)"));
		System.out.println(Renault.dime_climatizador());
		
		System.out.println(Renault.dime_peso_coche());
		System.out.println("El precio final es "+ Renault.precio_coche());
		
		JOptionPane.showMessageDialog(null,"El precio final es "+ Renault.precio_coche());
		
		
		Furgoneta partner= new Furgoneta(7,1000);
		
		partner.establece_color("Azul");
		partner.configura_asientos("Si");
		partner.configura_climatizador("Si");
		
		System.out.println("La Furgoneta tiene las siguientes caracteristicas: "+ partner.dime_datos_generales());
		System.out.println("La Furgoneta es de color:"+ partner.dime_color());
		System.out.println(partner.dimeDatosFurgoneta());
	}

}
