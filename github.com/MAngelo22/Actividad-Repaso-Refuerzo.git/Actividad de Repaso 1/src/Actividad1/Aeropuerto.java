package Actividad1;

import java.util.ArrayList;

public class Aeropuerto {
	
	private String Nombre, Ciudad;
	private Avion Avion;
		
	public Aeropuerto (String Nombre, String Ciudad, Avion Avion) {
	super();
	setNombre(Nombre);
	setCiudad(Ciudad);
	setAvion(Avion);
	}
	
	private ArrayList<Avion> listaAvion;
	
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
	
	public Avion getAvion() {
		return Avion;
	}
	
	public void setAvion(Avion Avion) {
		this.Avion = Avion;
	}		
	
	public String toString() {
		return ("Bienvenido, Se encuentra en "+Nombre +", en la ciudad de "+Ciudad+ ". "+ Avion.toString());
	}
	
	
}
