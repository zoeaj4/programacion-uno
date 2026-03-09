package practicas.practica0;

import java.util.Scanner;

/* Acá se encuentran los ejercicios de la práctica 0 sección 2;
 * 			Métodos y condicionales.
 * */

public class SeccionDos {
	
	/* ejercicio 6: Escribir un método static void imprimirSuma(int a, int b) que, al igual que el ejercicio 3, imprima la suma de los dos parámetros.
Modificar el programa de dicho ejercicio para que utilice este método.
	*/
	static void imprimirSuma(int a, int b) {
		System.out.println(a+b);
	}
	
	// ejercicio 7: Análogamente al ejercicio anterior, escribir un método static void imprimirPromedio(int a, int b) que imprima el promedio de los dos parámetros.
	static void imprimirPromedio(int a, int b) {
		int promedio = (a+b)/2;
		System.out.println(promedio);
	}
	
	/*
	Escribir un método static void ponerNota(double x, double y) que toma dos números decimales y los promedia.
	En caso de que el promedio sea mayor o igual a 7, deberá imprimir "Promocionado". Si es mayor o igual a 4 pero menor que 7, imprime "Aprobado". Si es menor que 4 imprime "Debe recuperar".
	Probarlo llamándolo desde el main con distintos números.
	Luego, pedirle ambos números al usuario (usando nextFloat() del Scanner) para pasárselos a ponerNota.
	*/
	static void ponerNota(double x, double y) {
		double promedio = (x+y)/2;
	
		if (promedio>=7) {
			System.out.println("El promedio es: " + promedio + " está promocionado.");
		}
		else if (promedio>=4) {
			System.out.println("El promedio es: " + promedio + " está aprobado.");
		} else {
			System.out.println("El promedio es: " + promedio + " está desaprobado.");
		}
	}
	
	static void ponerNotaUsuario() {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa la primera nota:");
		double nota1 = input.nextFloat();
		System.out.println("Ingresa la segunda nota:");
		double nota2 = input.nextFloat();
		
		double promedio = (nota1 + nota2)/2;
		
		if (promedio>=7) {
			System.out.println("El promedio es: " + promedio + " está promocionado.");
		}
		else if (promedio>=4) {
			System.out.println("El promedio es: " + promedio + " está aprobado.");
		} else {
			System.out.println("El promedio es: " + promedio + " está desaprobado.");
		}
		
		input.close();
	}
	
	static void imprimirFecha(int dia, int mes, int anio) {
	    String nombreMes = "";

	    switch (mes) {
	        case 1:
	            nombreMes = "Enero";
	            break;
	        case 2:
	            nombreMes = "Febrero";
	            break;
	        case 3:
	            nombreMes = "Marzo";
	            break;
	        case 4:
	            nombreMes = "Abril";
	            break;
	        case 5:
	            nombreMes = "Mayo";
	            break;
	        case 6:
	            nombreMes = "Junio";
	            break;
	        case 7:
	            nombreMes = "Julio";
	            break;
	        case 8:
	            nombreMes = "Agosto";
	            break;
	        case 9:
	            nombreMes = "Septiembre";
	            break;
	        case 10:
	            nombreMes = "Octubre";
	            break;
	        case 11:
	            nombreMes = "Noviembre";
	            break;
	        case 12:
	            nombreMes = "Diciembre";
	            break;
	        default:
	            nombreMes = "Mes inválido";
	    }

		System.out.println("La fecha es: " + dia + " de " + nombreMes + " de " + anio);
	}

	public static void main(String[] args) {
		// ejercicio 6		
		imprimirSuma(1,2);
		// ejercicio 7
		imprimirPromedio(5,9);
		// ejercicio 8
		ponerNota(8,8);
		// ejercicio 8.1
		ponerNotaUsuario();
		// ejercicio 9
		imprimirFecha(26,01,2004);
	}
}
