package ej1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//generación de array
		String[] alumnos= new String[30];
		int opcion=0;
		
		
		
		
		
		//sysout
		System.out.println("ALUMNOS/AS");
		System.out.println("===================");
		System.out.println("");
		System.out.println("1. Listado.");
		System.out.println("2. Nuevo Alumno.");
		System.out.println("3. Modificar.");
		System.out.println("4. Borrar.");
		System.out.println("5. Salir.");
		opcion=sc.nextInt();
		
		if (opcion==1) {
			//
			for(int i=0;i<alumnos.length;i++) {
				
				//
				if(alumnos[i]!="null") {
					
				}
				
				
			}
		}
		
		
	}

}
