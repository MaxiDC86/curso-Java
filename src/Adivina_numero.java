import java.util.*;

public class Adivina_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio = (int)(Math.random()*100);
		//System.out.println(aleatorio);
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = -1;
		
		int intentos = 0;
		
		while(numero != aleatorio) {
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
		}
	}

}
