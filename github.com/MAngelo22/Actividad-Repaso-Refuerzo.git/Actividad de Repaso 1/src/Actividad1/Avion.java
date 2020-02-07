package Actividad1;

import java.util.ArrayList;

public class Avion {

	private String Marca, ID;
	//De otras clases.
	private Asientos Asientos;
	private Motores Motores;
	private Ruedas Ruedas;
	private int Kilometros;
	
	public Avion (int Kilometros, String Marca, Asientos Asientos, 
			Motores Motores, Ruedas Ruedas, String ID) {
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
	
	public Asientos getAsientos() {
		return Asientos;
	}
	
	public void setAsientos(Asientos Asientos) {
		this.Asientos = Asientos;
	}
	
	public Motores getMotores() {
		return Motores;
	}
	
	public void setMotores(Motores Motores) {
		this.Motores = Motores;
	}
	
	public Ruedas getRuedas() {
		return Ruedas;
	}
	
	public void setRuedas(Ruedas Ruedas) {
		this.Ruedas = Ruedas;
	}
	
	public String getID() {
		return ID;
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public String toString() {
		return ("Su avión es el "+ID+" lleva recorridos "+ Kilometros+" Kilometros"+
				Asientos.toString()+Motores.toString()+Ruedas.toString());
	}
	
}