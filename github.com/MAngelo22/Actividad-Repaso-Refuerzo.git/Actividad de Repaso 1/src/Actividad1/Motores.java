package Actividad1;

public class Motores {

	private String CV,Cilindrada;
	
	public Motores(String CV,String Cilindrada) {
		super();
	    setCV(CV);
	    setCilindrada(Cilindrada);
	}

	
	public String getCV() {
		return CV;
	}
	
	public void setCV(String CV) {
		this.CV = CV;
	}

	public String getCilindrada() {
		return Cilindrada;
	}
	
	public void setCilindrada(String Cilindrada) {
		this.Cilindrada = Cilindrada;		
	}
	
	public String toString() {
		return ("El motor tiene "+CV+", tiene "+Cilindrada+". ");
	}
}
