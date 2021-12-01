package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trabajador1 = new Empleados("Maxi");
		Empleados trabajador2 = new Empleados("Pedro");
		Empleados trabajador3 = new Empleados("Ana");
		Empleados trabajador4 = new Empleados("Miguel");
		
		trabajador1.cambiarSeccion("RRHH");
		trabajador3.cambiarSeccion("Mant.");
		
		System.out.println(trabajador1.devuelveDAtos()+ "\n"+trabajador2.devuelveDAtos()
		+"\n"+trabajador3.devuelveDAtos()+"\n"+trabajador4.devuelveDAtos());

		System.out.println(Empleados.dameIdSiguiente());


	}

}

class Empleados{
	
	public Empleados(String nom) {		
		nombre = nom;
		seccion ="Administración";
		Id = IdSiguiente;
		IdSiguiente ++;
	}
	
	public void cambiarSeccion(String seccion) { //SETTER		
		this.seccion = seccion;		
	}

	
	public String devuelveDAtos() {
		
		return "El nombre es: " + nombre + ", la sección es " +seccion + " y el ID es: " +Id;
	}
	
	public static String dameIdSiguiente() {
		
		return "El ID siguiente es: " + IdSiguiente;
	}
	private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente = 1;
	
}