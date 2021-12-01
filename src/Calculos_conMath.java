
public class Calculos_conMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//double raiz = Math.sqrt(9);
		
		double num1 = 5.85f;
		int resultado = (int)Math.round(num1); // (int) convvierte Math.round(num1); a int
		System.out.println(resultado);
		
		double base = 5, exponente = 3;
		double resultado2 = Math.pow(base, exponente);
		System.out.println("El resultado de " + base + " elevado a " +exponente + " da como resultado: "+resultado2);
		
		String mi_nombre = "Maxi";
		
		System.out.println(mi_nombre.length());
		
		
		
		
	}

}
