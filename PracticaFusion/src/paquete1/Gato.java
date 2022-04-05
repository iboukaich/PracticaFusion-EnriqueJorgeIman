package paquete1;

public class Gato extends Mascota{
	
	private String color;
	
	
	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public Gato(String nombre, String color) {
		super(nombre);
		this.color = color;
	}



}
