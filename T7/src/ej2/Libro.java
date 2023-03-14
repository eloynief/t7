package ej2;

public class Libro {
		String titulo,autor;
		int ejemplares;
		int prestados=0;
		int devolucion=0;
		
		public Libro() {
			super();
		}
		
		public Libro(String titulo, String autor, int ejemplares, int prestamo, int devolucion) {
			super();
			this.titulo = titulo;
			this.autor = autor;
			this.ejemplares = ejemplares;
			this.prestados = prestados;
			this.devolucion = devolucion;
		}
		
		boolean prestamo() {
			boolean estado=false;
			
			if(prestados<ejemplares) {
				estado=true;
				prestados++;
			}
			return estado;
		}
		
		boolean devolucion() {
			boolean estado=false;
			if(prestados>0) {
				estado=true;
				prestados--;
			}
			return estado;
		}
		
}
