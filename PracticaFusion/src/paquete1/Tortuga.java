package paquete1;

public class Tortuga extends Mascota {
	private int edad;

	

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Tortuga(String nombre, int edad) {
		super(nombre);
		this.edad = edad;
	}
	
}
