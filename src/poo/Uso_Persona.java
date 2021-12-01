package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona[] lasPersonas=new Persona[2];
		lasPersonas[0]=new Empleado2("Maxi Dias Correia",7500,2021,12,17);
		lasPersonas[1]=new Alumno("Ivan Castellanos","Ingenieria");
		
		for (Persona p: lasPersonas) {
			
			System.out.println(p.dameNombre()+", "+p.dameDescripcion());
		}
	}
}

abstract class Persona{
	
	public Persona(String nom) {
		
		nombre = nom;
	}
	
	public String dameNombre() {
		
		return nombre;		
	}
	
	public abstract String dameDescripcion();
	
	private String nombre;
}

class Empleado2 extends Persona{
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia ){
		
		super(nom);
		
		sueldo=sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
		Id=IdSiguiente;
		++IdSiguiente;
	}	
	public String dameDescripcion() {
		return"Este empleado tiene un ID= " + Id + " con un sueldo= "+sueldo;
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
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente = 1;
	private int Id;
}

class Alumno extends Persona{
	
	public Alumno(String nom, String car) {
		
		super(nom);
		
		carrera=car;
		
	}
	public String dameDescripcion() {
		return"Este alumno esta en la carrera de "+carrera;
	}
	private String carrera;
}


