package Actividad1;

public class Ruedas {

	private String marca,material;
	
	public Ruedas(String marca,String material) {
		super();
	    setMarca(marca);
	    setMaterial(material);
	}

	public String getMarca() {
		return ("Marca de la Rueda: "+marca);
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMaterial() {
		return ("Material de la Rueda: "+material);
	}
	
	public void setMaterial(String material) {
		this.material = material;		
	}
	
	public String toString() {
		return ("La marca de las ruedas es "+ marca+", esta hecho de "+material+". --//  ");
	}
	
}