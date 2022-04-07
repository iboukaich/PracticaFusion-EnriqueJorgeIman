package paquete1;

public class Mascota {
	private String nombre;
	private String dueño;
	public Mascota(String nombre) {
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void MandarMensaje() {
		System.out.println("Soy " + this.nombre + " y te voy a contar algo o no, mi dueño es "+dueño);
	}

}
