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
	
	// ejercicio 32: Collatz
	static void collatz(int n) {
		System.out.print(n + ", ");
		if (n==1) {
			return;
		}
	    if (n % 2 == 0) {
	        collatz(n / 2);
	    } else {
	        collatz(3 * n + 1);
	    }
	}
	
	// ejercicio 33: algoritmo de Euclides
	static int mcd(int a, int b) {
	    if (b == 0) {
	        return a;
	    }
	    return mcd(b, a % b);
	}
	
	// ejercicio 34: Escribir una función que tome una cadena como par´ametro y la imprima por consola intercalando un ’∗’ entre cada letra. Por ejemplo, si la función toma la cadena ”hola” como parámetro, deberá imprimir ”h∗o∗l∗a”. Se puede dar por hecha la función static String resto(String s) que devuelve una cadena igual a s pero sin su primer caracter.
	
	static String resto(String s) {
	    if (s.length() <= 1) return "";
	    return s.substring(1);
	}
	
	static String palabraEntreAsteriscos(String s) {
		 if (s.length() <= 1) return s;
		return s.charAt(0) + "*" + palabraEntreAsteriscos(resto(s));
	}
	
	static String sinRepetidos(String s) {
		if (s.length() <= 1) return s;
		char primero = s.charAt(0);
		char segundo = resto(s).charAt(0);
		
		if (primero == segundo) {
			return sinRepetidos(resto(s));
		} else {
			return primero + sinRepetidos(resto(s));
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		// ejercicio 30
		System.out.println(sumatoriaRec(8));
		System.out.println(sumatoriaParesRec(4));
		System.out.println(potenciaRec(4,2));
		System.out.println(factorialRec(4));
		// ejercicio 31
		System.out.println(fibonacciRec(5));
		System.out.println(fibonacciIter(5));
		// ejercicio 32
		collatz(5); 
		// ejercicio 33
		System.out.println(mcd(36,20));
		// ejercicio 34
		System.out.println(resto("hola"));
		System.out.println(palabraEntreAsteriscos("hola"));*/
		// ejercicio 35
	}

}
