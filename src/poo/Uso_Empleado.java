package poo;
import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jefatura jefe_RRHH = new Jefatura("Joel",45000,2021,12,17);
		
		jefe_RRHH.estableceIncentivo(6700);
		
		Empleado[] misEmpleados= new Empleado[6];
		misEmpleados[0] = new Empleado("Maxi", 10000, 2001, 11, 20);
		misEmpleados[1] = new Empleado("Lucas", 9000, 1991, 1, 2);
		misEmpleados[2] = new Empleado("Miguel", 12000, 2003, 4, 3);
		misEmpleados[3] = new Empleado("Naty");
		misEmpleados[4] = jefe_RRHH; // Polimorfismo en acción. Principio de sustitución.
		misEmpleados[5] = new Jefatura("Maria", 95000,2022,10,2);
		
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];// Casting
		
		jefa_Finanzas.estableceIncentivo(20000);
		
		Empleado director_comercial = new Jefatura("Sandra",89000, 2021, 05, 07);
		
		Comparable ejemplo=new Empleado("Elizabeth", 99999, 2011,06,07);
		
		if ( ejemplo instanceof Comparable) {	
			System.out.println("La instancia ejemplo implementa la interfaz comparable");	
		}
		if ( ejemplo instanceof Empleado) {	
			System.out.println("La instancia ejemplo pertenece a la clase Empleado");	
		}
		/*for ( int i=0; i<3; i++) {
			
			misEmpleados[i].sube_sueldo(5);
		}*/
		
		System.out.println(jefa_Finanzas.tomar_decisiones("dar más dias de vacaciones a los empleados"));
		for(Empleado e: misEmpleados) {
			e.sube_sueldo(5);
		}
		
		System.out.println("El jefe " + jefa_Finanzas.dime_nombre()+" tienen un bonus de "+ jefa_Finanzas.establece_bonus(350));
		
		/*for (int i = 0; i< 3; i++) {
			
			System.out.println("Nombre: " + misEmpleados[i].dime_nombre()
					+" Sueldo: "+ misEmpleados[i].dime_sueldo()
					+ " Fecha de alta: "+ misEmpleados[i].dame_fecha_contrato());
		}*/
		
		Arrays.sort(misEmpleados);
		
		for( Empleado e: misEmpleados) {
			System.out.println("Nombre: " + e.dime_nombre()
					+" ID: "+e.dime_id()
					+" Sueldo: "+ e.dameSueldo()
					+ " Fecha de alta: "+ e.dame_fecha_contrato());
		}
	}
}

class Empleado implements Comparable, Trabajadores{
	
	public Empleado(String nom, double sue, int agno, int mes, int dia ){
		nombre=nom;
		sueldo=sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
		Id=IdSiguiente;
		++IdSiguiente;

		
	}	
	
	public Empleado(String nom) {
		this(nom, 30000, 2000, 01, 01);
	}
	public String dime_nombre() {//GETTER
		return nombre;
	}
	public int dime_id() {//GETTER
		return Id;
	}
	public double dameSueldo() {//GETTER
		return sueldo;
	}
	public Date dame_fecha_contrato(){//GETTER
		return altaContrato;
	}
	public void sube_sueldo(double porcentaje) {//SETTER
		double aumento=sueldo*porcentaje/100;
		sueldo += aumento;
	}
	public int compareTo(Object miObjeto) {
		Empleado otroEmpleado =(Empleado) miObjeto;
		if (this.sueldo<otroEmpleado.sueldo) {
			return 1;
		}
		if (this.sueldo>otroEmpleado.sueldo) {
			return -1;
		}
		return 0;
	}
	public double establece_bonus(double gratificacion) {
		
		return Trabajadores.bonus_base+gratificacion;
	}
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente = 1;
	private int Id;
}

	class Jefatura extends Empleado implements Jefes{
	
	public Jefatura(String nombre, double sueldo, int year, int month, int day) {
		
		super(nombre, sueldo, year, month, day);
	}
	
	public String tomar_decisiones( String decision) {
		return "Un mienbro de la dirección ha tomado la decisión de :" + decision;
	}
	public double establece_bonus(double gratificacion) {
		double prima = 2000;
		return Trabajadores.bonus_base+gratificacion+prima;
	}
	
	public void estableceIncentivo(double b) { //Setter de incentivo
		
		incentive=b;
	}
	
	public double dameSueldo() {
		double sueldoJefe = super.dameSueldo();
		return sueldoJefe + incentive;
	}
	
	private double incentive;	
	
}

