package ejerciciosCampus;

public class EjerciciosArrays {
	
	// ejercicio 0: Imprime por pantalla los elementos del arreglo.
	public static void imprimirArreglo(int[] a) {
		for (int e : a) {
			System.out.print(e + ", ");
		}
	}
	
	// ejercicio 1: Devuelve el máximo elemento del arreglo.
	public static int maximo(int [] a) {
		int max = a[0];
		for (int num : a) {
			if (max<num) {
				max = num;
			}
		}
		return max;
	}
	
	// ejercicio 2: Devuelve el promedio de los elementos del arreglo.
	public static double promedio (int [] a) {
		int suma = 0;
		for (int num : a) {
			suma=suma+num;
		}
		double promedio = suma/a.length;
		return promedio;
	}
	
	// ejercicio 3: Devuelve un arreglo que tiene los mismos elementos que el arreglo recibido y el nuevo elemento al final.
	public static int [] agregarAtras (int [] a, int x) {
	    int[] nuevoArreglo = new int[a.length + 1];

	    int i = 0;
	    for (int num : a) {
	        nuevoArreglo[i++] = num;
	    }

	    nuevoArreglo[i] = x;

	    return nuevoArreglo;
	}
	
	// ejercicio 4: Devuelve un arreglo que tiene los mismos elementos que el arreglo recibido salvo el elemento que originalmente en la posición pos.
	
	public static int[]quitar(int[]a, int pos){
		int[] nuevoArreglo = new int [a.length-1];
		
		for (int i=0;i<pos;i++) {
			nuevoArreglo[i] = a[i];
		}
		
		for (int i = pos; i < nuevoArreglo.length; i++) {
	        nuevoArreglo[i] = a[i + 1];
	    }
		return nuevoArreglo;
	}
	
	// ejercicio 5: Devuelve un arreglo que tiene los mismos elementos que el arreglo recibido, pero en orden inverso.

	public static int [] reverso(int []a) {
	    int[] nuevo = new int[a.length];

	    for (int i = 0; i < a.length; i++) {
	        nuevo[i] = a[a.length - 1 - i];
	    }

	    return nuevo;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] miArreglo = {5,8,2,4};
		// ejercicio 0
		imprimirArreglo(miArreglo);
		System.out.println();
		// ejercicio 1
		System.out.println(maximo(miArreglo));
		// ejercicio 2
		System.out.println(promedio(miArreglo));
		// ejercicio 3
		imprimirArreglo(agregarAtras(miArreglo, 5));
		System.out.println();
		// ejercicio 4
		imprimirArreglo(quitar(miArreglo, 2));
		// ejercicio 5
		imprimirArreglo(reverso(miArreglo));
	}

}
