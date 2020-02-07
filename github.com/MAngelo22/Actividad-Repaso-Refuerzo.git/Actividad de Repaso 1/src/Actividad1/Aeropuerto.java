package Actividad1;

import java.util.ArrayList;

public class Aeropuerto {
	
	private String Nombre, Ciudad;
	private ArrayList<Avion> Aviones;
		
	public Aeropuerto (String Nombre, String Ciudad, ArrayList<Avion> Aviones) {
	super();
	setNombre(Nombre);
	setCiudad(Ciudad);
	setAviones(Aviones);
	}
	
	//Getters && Setters
	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
	
	public String getCiudad() {
		return Ciudad;
	}
	
	public void setCiudad(String Ciudad) {
		this.Ciudad = Ciudad;
	}
	
	public ArrayList<Avion> getAviones() {
		return Aviones;
	}
	
	public void setAviones(ArrayList<Avion> Aviones) {
		this.Aviones = Aviones;
	}		
	
	public String toString() {
		String retorno = " Bienvenido!!!, Se encuentra en "+Nombre +", en la ciudad de "+Ciudad+ ". Y tiene los siguientes aviones: ";
		for(Avion AvionesGuardados : Aviones) {
			//Añades a la concatenacion con += es lo mismo que //retorno = retorno + AvionesGuardados.toString();
			retorno += AvionesGuardados.toString();
		}
		
		return retorno;
	}
	
}
