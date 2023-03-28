package ejercicio1;

public class CuentaCorriente {
	/**
	 * 
	 */
	String DNI;
	/**
	 * 
	 */
	String nombre;
	/**
	 * 
	 */
	double saldo;
	
	
	//enumerado para 
	enum Sexo{Femenino, Masculino}
	
	//atributo de nombre sexo que tiene el tipo Sexo
	Sexo sexo;
	
	
	
	//Part1
	//Crear un constructor con el valor
	public CuentaCorriente(String sexo) {
		this.sexo=Sexo.valueOf(sexo);
	}
	
	
	
	//constructor con dni y saldo
	public CuentaCorriente(String DNI, double saldo) {
		this.DNI = DNI;
		this.saldo = saldo;
		
	}
	//constructor con el dni,nombre y saldo
	public CuentaCorriente(String DNI, String nombre, double saldo) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	/**
	 * 
	 * @param cantidad
	 * @return
	 */
	public boolean sacarDinero(double cantidad) {
		boolean res = false;
		
		if(cantidad < saldo) {
			res=true;
			saldo -= cantidad;
		}
		
		return res;
	}
	
	public void ingresarDinero(double cantidad) {
		saldo += cantidad;
	}
	
	//
	public String toString() {
		String result = "";
		result += "DNI: " + DNI + "\n";
		result += "Nombre: " + nombre + "\n";
		result += "Saldo: " + saldo;
		return result;
	}
	

	
}
