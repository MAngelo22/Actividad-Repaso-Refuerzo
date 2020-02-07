package Actividad1;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Asientos As1, As2;
		Motores Mt1, Mt2;
		Ruedas Rd1,Rd2;
		Avion Av1, Av2;
		Aeropuerto aeropuerto;
		
		ArrayList<Avion> listaAvion = new ArrayList<Avion>();
		ArrayList<Asientos> listaAsientos = new ArrayList<Asientos>();
		ArrayList<Motores> listaMotores = new ArrayList<Motores>();
		ArrayList<Ruedas> listaRuedas = new ArrayList<Ruedas>();
		
		As1 = new Asientos (520, "Azul");
		As2 = new Asientos (538, "Rojo y Blanco");
		Mt1 = new Motores ("105000CV","300KW (KiloWatios)");
		Mt2 = new Motores ("108000CV", "400HP (HorsePower)");
		Rd1 = new Ruedas ("Pirelli", "Goma Rigida");
		Rd2 = new Ruedas ("Michellin", "Goma Blanda");
		listaAsientos.add(As1);
		listaAsientos.add(As2);
		listaMotores.add(Mt1);
		listaMotores.add(Mt2);
		listaRuedas.add(Rd1);
		listaRuedas.add(Rd2);
		Av2 = new Avion (200000, "Icarus", listaAsientos, listaMotores, listaRuedas, "A-30");
		Av1 = new Avion (350000, "Pegasus", listaAsientos, listaMotores, listaRuedas, "A-15");
		listaAvion.add(Av1);
		listaAvion.add(Av2);
		aeropuerto = new Aeropuerto ("Heathrow", "Londres", listaAvion);
			
		System.out.println(aeropuerto.toString());
		
	}
}
