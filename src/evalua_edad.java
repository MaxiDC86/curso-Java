import java.util.*;
public class evalua_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce tu edad: ");
		
		int edad = entrada.nextInt(); 
		
		if(edad <=18) {
			
			System.out.println("Es adulto");
		}
		else if(edad <40) {
			System.out.println("Es joven");
		}
		else if(edad <65) {
			System.out.println("Es maduro");
		}
		else {
			System.out.print("Cuidate");
		}
		
		
	}

}
