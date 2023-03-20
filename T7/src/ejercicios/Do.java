package ejercicios;

public class Do {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 * TEMA 7 - EJERCICIOS - 1
Diseña las clases que se indican en los distintos ejercicios. Prueba dichas clases en una clase Main independiente donde se creen distintos objetos y se lleven a cabo distintas operaciones en ellos.
Diseñar la clase CuentaCorriente, que almacena los datos DNI, nombre y el saldo. 
Añade los siguientes constructores:
Con el DNI del titular de la cuenta y un saldo inicial.
Con el DNI, nombre y el saldo inicial.
Las operaciones típicas de una cuenta corriente son:
Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación, si existe saldo suficiente. Si es posible llevar a cabo la operación se resta la cantidad a sacar al saldo de la cuenta.
Ingresar dinero: se incrementa el saldo.
Mostrar información: muestra la información disponible de la cuenta corriente.
Crea una clase llamada Libro que guarde la información de cada uno de los libros de una biblioteca. La clase debe guardar el título del libro, autor, número de ejemplares del libro y número de ejemplares prestados. La clase contendrá los siguientes métodos:
Constructor sin parámetros.
Constructor con parámetros (se le indica valores para todos los atributos).
prestamo: incrementa el atributo correspondiente cada vez que se realice un préstamo. No se pueden prestar libros si no quedan ejemplares disponibles para prestar. Devuelve true si se ha podido realizar el préstamo y false en caso contrario.
devolucion: decrementa el atributo correspondiente cada vez que se devuelva un libro. No se podrán devolver libros que no se hayan prestado. Devuelve true si se ha podido realizar la operación y false en caso contrario.
Crea una clase llamada Punto que representará un punto de dos dimensiones en un plano. Solo contendrá dos atributos enteros llamadas x e y (coordenadas). Debe tener los siguientes métodos:
Un constructor con parámetros que copie las coordenadas pasadas como argumento a los atributos del objeto.
imprime: Imprime por pantalla las coordenadas. Ejemplo: “(7, -5)”
setXY(int x, int y): Modifica ambas coordenadas.
desplaza(int dx, int dy): Desplaza el punto la cantidad (dx,dy) indicada. Ejemplo: Si el punto (1,1) se desplaza (2,5) entonces estará en (3,6).
distancia(Punto p): Calcula y devuelve la distancia entre el propio objeto (this) y otro objeto (Punto p) que se pasa como parámetro: distancia entre dos coordenadas.
Crea un programa con una clase llamada Articulo con los siguientes atributos: nombre, precio (sin IVA), iva (siempre será 21) y cuantosQuedan (representa cuántos quedan en el almacén).
Añade un constructor con 3 parámetros que asigne valores a nombre, precio y cuantosQuedan. Dicho constructor deberá mostrar un mensaje de error si alguno de los valores nombre, precio o cuantosQuedan no son válidos.
Añade también los siguientes métodos:
Método para imprimir la información del artículo por pantalla.
Método getPVP que devuelva el precio de venta al público (PVP) con iva incluido. 
Método getPVPDescuento que devuelva el PVP con un descuento pasado como argumento. 
Método vender que actualiza los atributos del objeto tras vender una cantidad ‘x’ (si es posible). Devolverá true si ha sido posible (false en caso contrario). 
Método almacenar que actualiza los atributos del objeto tras almacenar una cantidad ‘x’.

 */
	}

}
