package practicas.practica0;

/* Acá se encuentran los ejercicios de la práctica 0 sección 3;
 * 			Métodos con resultados e iteración.
 * */

public class SeccionTres {
	
	// Ejercicio 10: Escribir un método static int sumatoria(int n) que devuelve la sumatoria de los números desde 1 hasta n.
	
	static int sumatoria(int n) {
		int sumatoria = 0;
		for (int i=0;i<=n;i++) {
			sumatoria=sumatoria+i;
		}
		return sumatoria;
	}
	
	// Ejercicio 11: Escribir un método static int sumatoriaPares(int n) que devuelve la sumatoria de los números pares desde 2 hasta n.
	
	static int sumatoriaPares(int n) {
		int sumatoriaPares = 0;
		for (int i=0;i<=n;i++) {
			if (i%2==0) {
				sumatoriaPares=sumatoriaPares+i;
			}
		}
		return sumatoriaPares;
	}
	
	// Ejercicio 12: Escribir un método static double potencia(double x, int a) que toma un número racional x y un entero a y calcula x(a).
	static double potencia(double x, int a) {
		double potencia=1;
		for (int i=0;i<a;i++) {
			potencia*=x;
		}
		return potencia;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ejercicio 10
		System.out.println(sumatoria(10));
		// ejercicio 11
		System.out.println(sumatoriaPares(10));
		// ejercicio 12
		System.out.println(potencia(2,4));
		// ejercicio 13

	}

}
