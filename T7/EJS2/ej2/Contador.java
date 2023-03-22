package ej2;

public class Contador {

	static int cont = 0;

	public Contador() {

	}

	// constructor con parametros
	public Contador(int valor) {

		// si el valor que ponemos es negativo
		if (valor < 0) {
			// se iguala a 0
			cont = 0;
		} else {
			cont = valor;
		}

	}

	// constructor copia
	public Contador(Contador conta) {

		this.cont = conta.cont;
	}

	// getter
	public int getCont() {
		return cont;
	}

	// setter
	public void setCont(int cont) {
		this.cont = cont;
	}

	public static int incrementar() {
		int incremento = cont;
		incremento++;
		return incremento;
	}

	//decrementa el valor
	public static int decrementar() {
		int decremento = cont;
		decremento--;
		
		if (decremento < 0) {
			decremento = 0;
		}
		
		return cont;
	}
	
	

}
