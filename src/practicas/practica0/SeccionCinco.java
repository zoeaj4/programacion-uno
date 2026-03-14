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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros = {2,4,56,7};	
		System.out.println(maximo(numeros));
	}

}
