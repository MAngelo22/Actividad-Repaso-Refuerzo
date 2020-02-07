package Actividad1;

import java.util.ArrayList;

public class Avion {

	private String Marca, ID;
	private int Kilometros;
	//De otras clases.
	private ArrayList<Ruedas> Ruedas;
	private ArrayList<Asientos> Asientos;
	private ArrayList<Motores> Motores;
	
	
	public Avion (int Kilometros, String Marca, ArrayList<Asientos> Asientos,
			ArrayList<Motores> Motores, ArrayList<Ruedas> Ruedas, String ID) {
	super();
	setKilometros(Kilometros);
	setMarca(Marca);
	setAsientos(Asientos);
	setMotores(Motores);
	setRuedas(Ruedas);
	setID(ID);
	}
	
	private ArrayList<Asientos> listaAsientos;
	private ArrayList<Motores> listaMotores;
	private ArrayList<Ruedas> listaRuedas;
	
	//Getter && Setters
	public int getKilometros() {
		return Kilometros;
	}
	
	public void setKilometros(int Kilometros) {
		this.Kilometros = Kilometros;
	}
	
	public String getMarca() {
		return ("Modelo " + Marca);
	}
	
	public void setMarca(String Marca) {
		this.Marca = Marca;
	}
	
	public String getID() {
		return ID;
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public ArrayList<Asientos> getAsientos() {
		return Asientos;
	}
	
	public void setAsientos(ArrayList<Asientos> Asientos) {
		this.Asientos = Asientos;
	}
	
	public ArrayList<Motores> getMotores() {
		return Motores;
	}
	
	public void setMotores(ArrayList<Motores> Motores) {
		this.Motores = Motores;
	}
	public ArrayList<Ruedas> getRuedas() {
		return Ruedas;
	}
	
	public void setRuedas(ArrayList<Ruedas> Ruedas) {
		this.Ruedas = Ruedas;
	}
	public String toString() {
		String retorno = " //-- El avion "+ID+" lleva recorridos "+ Kilometros+" Kilometros ";
		for(Asientos AsientosGuardados : Asientos) {
			retorno += AsientosGuardados.toString();
		}
		
		for(Motores MotoresGuardados : Motores) {
			retorno += MotoresGuardados.toString();
		}
		
		for(Ruedas RuedasGuardadas : Ruedas) {
			//Añades a la concatenacion con += es lo mismo que //retorno = retorno + AvionesGuardados.toString();
			retorno = retorno + RuedasGuardadas.toString();
		}
		
		return retorno;
	}
	
}