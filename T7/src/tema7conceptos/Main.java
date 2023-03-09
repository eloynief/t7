package tema7conceptos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		//crear un objeto
		
		Caja objeto= new Caja();
		
		
		
		System.out.println("introduzca la altura de la caja: ");
		objeto.altura=sc.nextInt();
		System.out.println(objeto.altura);
	}

}
