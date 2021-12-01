
public class Ejemplo_array_plazo_fijo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double acumulado;
		double interes = 0.1;
		
		double [][] saldo = new double[6][5];
		
		for (int i = 0; i<6; i++) {
			
			saldo[i][0] = 10000;
			acumulado= 10000;
			
			for(int j=1; j<5; j++) {
				
				acumulado= acumulado+(acumulado*interes);
				
				saldo[i][j]= acumulado;
			}
			interes = interes+0.01;
		}
		
		for ( double[]fila:saldo) {
			
			for(double z: fila) {
				
				System.out.printf("%1.2f",z);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
