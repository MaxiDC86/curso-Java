import java.util.Scanner;

public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		
		String nombre_usuario = entrada.nextLine();
		System.out.println("Tu nombre es " + nombre_usuario);
		
		System.out.print("Ingresa tu edad: ");
		int edad=entrada.nextInt();
		System.out.println("El año que viene vas a tener "+(edad+1)+ " años");
	
	}

}
