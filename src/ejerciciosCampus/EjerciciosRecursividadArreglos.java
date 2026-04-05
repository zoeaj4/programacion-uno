package ejerciciosCampus;

public class EjerciciosRecursividadArreglos {
	
	// función auxiliar
	public static int[] resto(int[] a) {
	    if (a.length <= 1) {
	        return new int[0];
	    }

	    int[] nuevo = new int[a.length - 1];
	    for (int i = 1; i < a.length; i++) {
	        nuevo[i - 1] = a[i];
	    }
	    return nuevo;
	}
	
	// Ejercicio 1: Imprime por pantalla los elementos del arreglo.
	public static void imprimir(int[] a) {
	    if (a.length == 0) {
	        return;
	    }

	    System.out.println(a[0]);
	    imprimir(resto(a));
	}
	
	// Ejercicio 2: Hacer una función recursiva que sume los elementos de un arreglo
	public static int suma(int[] a) {
	    if (a.length == 0) {
	        return 0;
	    }

	    return a[0] + suma(resto(a));
	}
	
	// Ejercicio 3: Dado un arreglo, hacer una función que devuelva si un número está en el arreglo o no.
	public static boolean pertenece(int[] a, int n) {
	    if (a.length == 0) {
	        return false;
	    }

	    if (a[0] == n) {
	        return true;
	    }

	    return pertenece(resto(a), n);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] miArreglo = {1,2,3,4};
		imprimir(miArreglo);
		System.out.println(suma(miArreglo));
		System.out.println(pertenece(miArreglo,7));

	}

}
