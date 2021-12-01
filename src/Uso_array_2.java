import javax.swing.*;
public class Uso_array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String [] paises= new String[8];
		paises[0]="Argentina";
		paises[1]="Bolivia";
		paises[2]="España";
		paises[3]="Ecuador";
		paises[4]="Peru";
		paises[5]="Mexico";
		paises[6]="Colombia";
		paises[7]="Noruega"; */
		
		/*String [] paises= {"Argentina", "Bolivia", "España", "Ecuador","Peru","Mexico","Colombia","Noruega"}; */
		
		/*String [] paises = new String[8];
		
		for(int i=0; i<8;i++) {
			
		paises[i] = JOptionPane.showInputDialog("Introduce un país " +(i+1));	
		}
		
		for (String elemet:paises) {
			
			System.out.println("Pais "+elemet);
		} */
		
		int[] matriz_aleatorios = new int[30];
		
		for (int i=0; i<matriz_aleatorios.length;i++) {
			
			matriz_aleatorios[i] = (int)Math.round(Math.random()*100);
			
		}
		for (int numeros:matriz_aleatorios) {
			
			System.out.print(numeros+"   ");
		}
		
	}

}
