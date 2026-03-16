package practicas.practica0;

/* Acá se encuentran los ejercicios de la práctica 0 sección 5;
 * 			Arreglos.
 * */

public class SeccionCinco {
	
	// Ejercicio 25: Escribir un método static int maximo(int[] a) que dado un arreglo de enteros no vacío, devuelve el valor más alto que aparece.
	static int maximo(int [] a) {
	    int max = a[0];
	    for (int i = 1; i < a.length; i++) {
	        if (a[i] > max) {
	            max = a[i];
	        }
	    }
	    return max;
	}
	
	// Ejercicio 26: Escribir un método static int maximoIndice(int[] a) que dado un arreglo de enteros no vacío, devuelve el índice del valor más alto que aparece.
	static int maximoIndice(int[] a) {
	    int indiceMax = 0;
	    for (int i = 1; i < a.length; i++) {
	        if (a[i] > a[indiceMax]) {
	            indiceMax = i;
	        }
	    }
	    return indiceMax;
	}
	
	// Ejercicio 27: Escribir un método static int suma(int[] a) que dado un arreglo de enteros, devuelve el valor de la suma de todos sus elementos.
	static int suma(int [] a) {
		int sumatoria = 0;
		for (int i = 0; i < a.length; i++) {
			sumatoria = sumatoria + a[i];
		}
		return sumatoria;
		
	}

	// Ejercicio 28: Escribir un método static boolean estaOrdenado(int[] a) que dado un arreglo de enteros, devuelve verdadero si el arreglo está ordenado crecientemente de menor a mayor, y falso en caso contrario.
	static boolean estaOrdenado(int[] a) {
	    for (int i = 1; i < a.length; i++) {
	        if (a[i] < a[i-1]) {
	            return false;
	        }
	    }
	    return true;
	}
	
	// Ejercicio 29: Escribir un método static double promedio(double[] a) que dado un arreglo de números con coma, devuelve el valor del promedio de todos los elementos.
	static double promedio(double []a) {
		double sumatoria = 0;
		for (int i = 0; i < a.length; i++) {
			sumatoria = sumatoria + a[i];
		}
		double promedio = sumatoria/a.length;
		return promedio;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros = {2,4,56,7};	
		double [] numerosConComa = {2.8,4.9,56.0,7.9};
		
		// ejercicio 25
		System.out.println(maximo(numeros));
		// ejercicio 26
		System.out.println(maximoIndice(numeros));
		// ejercicio 27
		System.out.println(suma(numeros));
		// ejercicio 28
		System.out.println(estaOrdenado(numeros));
		// ejercicio 29
		System.out.println(promedio(numerosConComa));
	}

}
