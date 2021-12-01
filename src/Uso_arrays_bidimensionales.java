
public class Uso_arrays_bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = new int[4][5];
		
		for (int i=0; i<4;i++) {
			
			for (int j=0; j<5;j++) {
			
			matrix[i][j] = (int)Math.round(Math.random()*100);
			
			System.out.print(matrix[i][j] +" ");
			
		} 
			System.out.println();
			
	}
		int [][] matrix2= {
				{10,15,18,19,21},
				{5,25,37,41,15},
				{7,19,32,14,90},
				{85,2,7,40,27}
		};
		
		System.out.println();
		
		for(int i=0; i<4; i++) {
			
			for(int j=0; j<5; j++) {
			System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for ( int[]fila:matrix) {
			
			for(int z: fila) {
				
				System.out.print(z +" ");
			}
			System.out.println();
		}
		
		
		
}
}
