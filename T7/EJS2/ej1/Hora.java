package ej1;

public class Hora {
	//elementos 
	private int hora=0,minuto=0,segundo=0;
	
	
	//constructor con parámetros
	public Hora(int hora,int minuto,int segundo) {
		//los parametros
		this.hora=hora;
		this.minuto=minuto;
		this.segundo=segundo;
		
	}
	
	
	//get
	public int gethora() {
		
		return hora;
		
	}
	
	
	//get
	public int getminuto() {
		
		return minuto;
	}
	
	
	//get
	public int getsegundo() {
		
		return segundo;
	}
	
	
	
	//
	
	public void incrementaSegundo() {
		
		//incrementa ubn segundo a la hora actual
		segundo=segundo+1;
		
		if(segundo>=60) {
			minuto++;
		}
		if(minuto>=60||segundo>=3600) {
			
		}
	}
	
	
	
	
	//✅
}
