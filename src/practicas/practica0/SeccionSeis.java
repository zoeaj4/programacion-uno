package practicas.practica0;
/* Acá se encuentran los ejercicios de la práctica 0 sección 6;
 * 			Recursividad.
 * */
public class SeccionSeis {
	
	// Ejercicio 30: Escribir las versiones recursivas de los métodos de la Sección 3.
	static int sumatoriaRec(int n) {
		if (n == 0) {
			return 0;
		}
		return n + sumatoriaRec(n-1);
	}
	
	static int sumatoriaParesRec(int n) {
		if (n == 0) {
			return 0;
		}	
		if (n%2==0) {
			return n + sumatoriaParesRec(n-1);
		} else {
			return sumatoriaParesRec(n-1);
		}
	}
	
	static double potenciaRec(double x, int n) {
	    if (n == 0) {
	        return 1;
	    }
	    return x * potenciaRec(x, n - 1);
	}
	
	static int factorialRec(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorialRec(n-1);
	}
	
	// ejercicio 31: sucesión de Fibonacci.
	static int fibonacciRec(int n) {
		if (n==0) return 0;
		if (n==1) return 1;
		return fibonacciRec(n-1) + fibonacciRec (n-2);
	}
	
	static int fibonacciIter(int n) {
	    if (n == 0) return 0;
	    if (n == 1) return 1;

	    int anterior = 0; // f(0)
	    int actual = 1;   // f(1)

	    for (int i = 2; i <= n; i++) {
	        int siguiente = anterior + actual;
	        anterior = actual;
	        actual = siguiente;
	    }

	    return actual;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ejercicio 30
		System.out.println(sumatoriaRec(8));
		System.out.println(sumatoriaParesRec(4));
		System.out.println(potenciaRec(4,2));
		System.out.println(factorialRec(4));
		// ejercicio 31
		System.out.println(fibonacciRec(5));
		System.out.println(fibonacciIter(5));
	}

}
