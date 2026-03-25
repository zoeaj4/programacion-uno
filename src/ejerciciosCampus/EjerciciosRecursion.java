package ejerciciosCampus;

public class EjerciciosRecursion {
	
	// Ejercicio 1.a. Devuelve la suma de todos los números que están entre 1 y n.

	static int sumarHasta(int n) {
		if (n == 0) {
			return 0;
		}
		return n + sumarHasta(n-1);
	}
	// Ejercicio 1.b. Devuelve la suma de todos los números pares que están entre 1 y n.

	static int sumarParesHasta(int n) {
		if (n == 0) {
			return 0;
		}
		if (n%2==0) {
			return n + sumarParesHasta(n-1);
		}
		return sumarParesHasta(n-1);
	}
	
	// Ejercicio 2: Imprime por pantalla los números entre 1 y n (en orden ascendente).
	
	static void imprimirHasta(int n) {
	    if (n == 0) {
	        System.out.print(0);
	        return;
	    }
	    
	    imprimirHasta(n - 1);
	    System.out.print(" " + n);
	}
	
	// Ejercicio 3: Imprime por pantalla los números entre 1 y n (en orden descendente).
	
	static void imprimirDesde (int n) {
	    if (n == 0) {
	        System.out.print("" + 0);
	        return;
	    }
	    System.out.print(n + " ");
	    imprimirDesde(n - 1);
	}
	
	// Ejercicio 4: Calcula A elevado a la B.
	
	static int potencia(int a, int b) {
		if (b == 0) {
			return 1;
		}
		return a * potencia(a, b-1);
	}
	
	// Ejercicio 5: Calcula la cantidad de números primos que hay entre n y m. Asumir que se tiene una función que indica si un número es primo o no (hacerla antes!)
	static boolean esPrimo(int n) {
	    if (n <= 1) {
	        return false;
	    }
	    for (int i = 2;i * i <= n; i++) {
	    	if (n%i==0) {
	    		return false;
	    	}
	    }
	    return true;
	}
	
	static int cantidadPrimosEntre(int n, int m) {
	    if (n > m) {
	        return 0;
	    }
	    if (esPrimo(n)) {
	        return 1 + cantidadPrimosEntre(n + 1, m);
	    } else {
	        return cantidadPrimosEntre(n + 1, m);
	    }
	}
	
	// Ejercicio 6: Calcula el primer número primo mayor a n.
	static int siguientePrimo(int n) {
		if (esPrimo(n+1)) {
			return n + 1;
		}
		return siguientePrimo(n+1);
	}
	
	// Ejercicio 7: Indica si un número es par o no (sin usar el operador de resto. Es decir, no vale usar "n % 2 == 0").

	static boolean esPar(int n) {
		if (n == 0) return true;
		if (n == 1) return false;
		return esPar(n-2);
	}
	
	// Ejercicio 8: Indica la cantidad de dígitos de un número n>0.

	static int cantidadDigitos(int n) {
	    if (n < 10) {
			return 1;
		}
	    return 1 + cantidadDigitos(n/10);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ejercicio 1.a, b
		System.out.println(sumarHasta(7));
		System.out.println(sumarParesHasta(7));
		// ejercicio 2
		imprimirHasta(7);
		System.out.println();
		// ejercicio 3
		imprimirDesde(7);
		System.out.println();
		// ejercicio 4
		System.out.println(potencia(5,3));
		// ejercicio 5
		System.out.println(cantidadPrimosEntre(1,100));
		// ejercicio 6
		System.out.println(siguientePrimo(20));
		// ejercicio 7
		System.out.println(esPar(99));
		// ejercicio 8
		System.out.println(cantidadDigitos(902));
	}

}
