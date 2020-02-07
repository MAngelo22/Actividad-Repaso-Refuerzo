package Actividad1;

public class Asientos {

	private String colores;
	private int numero;
	
	public Asientos(int numero,String colores) {
		super();
	    setNumero(numero);
	    setColores(colores);
	}

	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getColores() {
		return colores;
	}
	
	public void setColores(String colores) {
		this.colores = colores;		
	}
	
	public String toString() {
		return (". Tiene "+numero+" Asientos, "+"los asientos son de color "+colores+", ");
	}
}
