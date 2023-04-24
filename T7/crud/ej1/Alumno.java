package ej1;

public class Alumno {
	String nombre;
	int notaMedia=5;
	
	public Alumno() {
		super();
	}




	public Alumno(String nombre, int notaMedia) {
		super();
		this.nombre = nombre;
		this.notaMedia = notaMedia;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public int getNotaMedia() {
		return notaMedia;
	}




	public void setNotaMedia(int notaMedia) {
		this.notaMedia = notaMedia;
	}




	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", notaMedia=" + notaMedia + "]";
	}
	
	
	
	
	
	
}
