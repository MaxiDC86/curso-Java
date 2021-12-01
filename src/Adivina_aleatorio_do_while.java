import java.util.Scanner;

public class Adivina_aleatorio_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aleatorio = (int)(Math.random()*100);
		//System.out.println(aleatorio);
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = -1;
		
		int intentos = 0;
		
		do{
			System.out.println("Introduce un número, por favor");
			numero = entrada.nextInt();
			intentos ++;
			if (aleatorio<numero) {
				System.out.println("Más bajo");
			}
			else if(aleatorio>numero) {
				System.out.println("Más alto");
			}
			else {
				System.out.println("Correcto el " +aleatorio+"! Ganaste en "+intentos+" intentos");
			}
		}while(numero != aleatorio);
	}

}
