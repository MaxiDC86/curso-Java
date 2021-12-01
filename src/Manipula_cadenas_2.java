
public class Manipula_cadenas_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "Hoy es un estupendo día para aprender a programar Java";
		String frase_resumen = frase.substring(0,29) + "irnos a la playa y "+
		frase.substring(29,54);
		
		System.out.println(frase_resumen);
	}

}
