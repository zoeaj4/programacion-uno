package practicas.practica0;
import java.util.Scanner;

/* Acá se encuentran los ejercicios de la práctica 0 sección 1;
 * 			Variables, expresiones y tipos.
 * */

public class SeccionUno {
	
	static Scanner input = new Scanner(System.in);

	// ejercicio 1: Escribir el programa “¡Hola, mundo!”.
	static void dimeHolaMundo() {
		System.out.println("¡Hola, mundo!");
	}
	
	// ejercicio 2: Escribir un programa que te pregunte tu nombre y a continuación imprima un saludo del estilo “Hola nombre”.
	static void saludaConNombre() {
		System.out.println("¿Cuál es tu nombre?");
		String nombre = input.nextLine();
		System.out.println("Hola, " + nombre);
	}
	
	// Escribir un programa que te pregunte por dos números, y a continuación imprima un mensaje del estilo “La suma es: ” y el valor de la suma de ambos números. 
	static void dimeSuma() {
		System.out.println("Ingrese el primer número para sumar:");
		int numeroUsuario1 = input.nextInt();
		System.out.println("Ahora el segundo.");
		int numeroUsuario2 = input.nextInt();
		
		int sumaNumerosUsuario= numeroUsuario1 + numeroUsuario2;
		
		System.out.println("La suma es: " + sumaNumerosUsuario);	
	}
	
	// Imprimir desde Java las siguientes expresiones e interpretar el valor que arrojan.
	static void dimeQueImprime() {
		System.out.println(1/2); // imprime 0. Porque el resultado de 1/2 es 0.5 pero al no especificar que es un double, lo trata de int y obvia los números decimales.
		System.out.println(1.0/2.0); // imprime 0.5, ahora sí Eclipse entiende como doubles a estos números.
		System.out.println(1.0/2); // imprime 0.5, ya que al ser un sólo número double, el resultado es double.
		System.out.println(1/2.0); // ídem.
		// System.out.println("1"/"2"); // ERROR! No podemos hacer operaciones con dos Strings.
		System.out.println(1+2); // imprime 3, resultado de la suma.
		System.out.println("1" + "2"); // imprime 12, resultado de la concatenación.
		System.out.println(16/2*4); // imprime 32, resultado de hacer esta operación de izquierda a derecha.
		System.out.println(16/(2*4)); // imprime 2, resultado de hacer esta operación respetando los paréntesis.
	}
	
	static void dimePromedio() {
		System.out.println("Ingrese el primer número para calcular el promedio:");
		double numeroUsuario1 = input.nextDouble();
		System.out.println("Ahora el segundo.");
		double numeroUsuario2 = input.nextDouble();
		
		double promedio = (numeroUsuario1 + numeroUsuario2)/2;
		System.out.println("El promedio es: " + promedio);
	}

	public static void main(String[] args) {

		// ejercicio 1
		dimeHolaMundo();
		// ejercicio 2
		saludaConNombre();
		// ejercicio 3
		dimeSuma();
		// ejercicio 4
		dimeQueImprime(); 
		// ejercicio 5
		dimePromedio();
		
	}	
	
}

