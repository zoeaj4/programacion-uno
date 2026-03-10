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
	
	
	// Ejercicio 13: Escribir un método static double factorial(int n) que toma un entero positivo n y calcula n! (el factorial de n) que se define como el producto de todos los naturales desde 1 hasta n. Por ejemplo 5! = 5×4×3×2×1 =120. Ojo: por definición, el factorial de 0, es 1 (0! = 1).
	static double factorial(int n) {
		double factorial = 1;		
		for (int i=0;i<n;i++) {
			factorial=(n-i)*factorial;
		}
		return factorial;
	}
	
	// Ejercicio 14: Escribir un método static int cantCifras(int n) que devuelve la cantidad de cifras de n. Probarlo adecuadamente llamándola desde el main.
	static int cantCifras(int n) {
		int cantCifras = 0;
	    while (n > 0) {
	        n = n / 10;
	        cantCifras++;
	    }
		return cantCifras;
	}
	
	// Ejercicio 15: Escribir un método static boolean esDivisible(int n, int m) que devuelve true si n es divisible por m y false en caso contrario. Probarlo adecuadamente llamándola desde el main.
	static boolean esDivisible(int n, int m) {
		if (n%m==0) {
			return true;
		} else {
			return false;
		}
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
		System.out.println(factorial(0));
		// ejercicio 14
		System.out.println(cantCifras(900));
		// ejercicio 15
		System.out.println(esDivisible(10,6));
		
	}

}
