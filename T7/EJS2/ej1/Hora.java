package ej1;

public class Hora {
	//elementos 
	private int hora=0,minuto=0,segundo=0;
	
	public Hora() {
		super();
	}
	
	
	//constructor con parámetros
	public Hora(int hora,int minuto,int segundo) {
		//los parametros
		this.hora=hora;
		this.minuto=minuto;
		this.segundo=segundo;
		
	}
	
	//hace una copia del objeto creado
	public Hora(Hora h) {
		
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
	
	public void incrementaSegundo(int cuenta) {
		//mientras la cuenta sea mayor que 0, aumenta los segundos uno por uno
//		while(cuenta>0) {
		//incrementa ubn segundo a la hora actual
			segundo=segundo+1;
			
			if(segundo>=60) {
				minuto++;
				segundo=0;
			}
			if(minuto>=60||segundo>=3600) {
				hora++;
				minuto=0;
			}
			//va disminuyendo cuenta hasta 0
//			cuenta--;
//		}
//		return 
	}
	
	
	public int sethora() {
		return hora;
		
		
	}
	
	
	//✅
}
