import javax.swing.*;
public class peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String genero="";
		
		do {
			genero = JOptionPane.showInputDialog("Introduce tu genero (M/F)");
		}while(genero.equalsIgnoreCase("M")==false && genero.equalsIgnoreCase("F")==false);
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en Cm"));
		
		int pesoIdeal = 0;
		
		if (genero.equalsIgnoreCase("M")) {
			
			pesoIdeal = altura - 110;
		}
		else if (genero.equalsIgnoreCase("F")) {
			
			pesoIdeal = altura -120;
		}
		
		System.out.print("Tu peos ideal es " + pesoIdeal);
	
	}

}
