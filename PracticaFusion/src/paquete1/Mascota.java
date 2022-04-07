package paquete1;

public class Mascota {
	private String nombre;

	private double tamanyo;

	private boolean castrado;

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
		System.out.println("Soy " + this.nombre + " y te voy a contar algo o no, y mido " + this.tamanyo);
		System.out.println("Soy " + this.nombre + " y te voy a contar algo o no");
		if (this.castrado=true) {
			System.out.println("AUCH :(");
		}else {
			System.out.println("Menos mal");
		}
	}

}
