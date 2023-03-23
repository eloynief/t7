package ej1;

import java.util.Scanner;

import enej1.CuentaCorriente;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seleccion,ahorro=0;
		Scanner sc= new Scanner(System.in);
		CuentaCorriente objeto= new CuentaCorriente();
		System.out.println("Elige una opsion:");
		
		seleccion=sc.nextInt();
		
		while(seleccion>=1&&seleccion<=3) {
			if (seleccion==1) {
				System.out.println("saca dinero");
				objeto.saldo=sc.nextInt();
				
				if (objeto.saldo<ahorro||objeto.saldo==ahorro) {
				ahorro=ahorro-objeto.saldo;
				}
				else {
					System.out.println("E musho dineroh");
				}
				
			}
			else if (seleccion==2) {
				System.out.println("Ingresa tus posesiones");
				objeto.saldo=sc.nextInt();
				ahorro=ahorro+objeto.saldo;
			}
			else if (seleccion==3) {
				System.out.println("te uestro todo lo que posees:ññññññ ");
				System.out.println(ahorro);
				
				
				
			}
			System.out.println("Elige una opsion:");
			
			seleccion=sc.nextInt();
			
		}
		
	}

}
