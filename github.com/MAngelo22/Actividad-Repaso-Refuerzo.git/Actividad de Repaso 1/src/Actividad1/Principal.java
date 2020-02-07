package Actividad1;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Asientos As1, As2;
		Motores Mt1, Mt2;
		Ruedas Rd1,Rd2;
		Avion Av1, Av2;
		Aeropuerto aeropuerto;
		
		ArrayList<Avion> listaAvion = new ArrayList<Avion>();//ALmacenar objetos complejos o POO
		
		As1 = new Asientos (520, "Azul");
		As2 = new Asientos (538, "Rojo y Blanco");
		Mt1 = new Motores ("105000CV","300KW (KiloWatios)");
		Mt2 = new Motores ("108000CV", "400HP (HorsePower)");
		Rd1 = new Ruedas ("Pirelli", "Goma Rigida");
		Rd2 = new Ruedas ("Michellin", "Goma Blanda");
		Av2 = new Avion (200000, "Icarus", As2, Mt2, Rd2, "A-30");
		Av1 = new Avion (350000, "Pegasus", As1, Mt1, Rd1, "A-15");
		listaAvion.add(Av1);
		listaAvion.add(Av2);
		aeropuerto = new Aeropuerto ("Heathrow", "Londres", listaAvion);
			
		System.out.println(aeropuerto.toString());
		
	}
}
