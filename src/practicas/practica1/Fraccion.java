package practicas.practica1;
/* 
 * Acá se encuentran el ejercicio 1 de la práctica 1.
 * 
 * */
public class Fraccion {
	
	// a) Escribir el constructor Fraccion(int numerador, int denominador)
	public Fraccion (int numerador, int denominador) {
		this.numerador=numerador;
		this.denominador=denominador;
	}
	
	// b) Escribir el método de instancia void imprimir() que imprime en pantalla la fracción en algún formato cómodo. Crear en un main una Fraccion e imprimirla con este método.
	void imprimir() {
		System.out.println(numerador);
		System.out.println("--");
		System.out.println(denominador);
	}
	
	// c) Escribir el método de instancia void invertirSigno() que invierte el signo del número: si era negativo pasa a ser positivo y viceversa.
	void invertirSigno() {
		numerador = this.numerador*-1;
	}
	
	// d) Escribir el método de instancia void invertir() que invierte el numerador y el denominador de la fracción. Ej. invertir(1/2) = 2/1.
	void invertir() {
		int aux = numerador;
		this.numerador = denominador;
		this.denominador = aux;
	}
	
	// e)  Escribir el método de instancia double aDouble() que convierte el número racional en un double (número de punto flotante) y devuelve el resultado.
	double aDouble() {
		return (double) numerador / denominador;
	}
	
	// f) Escribir el método de instancia void reducir() que reduce el número racional a sus términos más chicos. Para esto buscar el MCD del numerador y el denominador y luego dividir numerador y denominador por su MCD.
	void reducir() {
	    int a = Math.abs(numerador);
	    int b = Math.abs(denominador);

	    while (b != 0) {
	        int temp = b;
	        b = a % b;
	        a = temp;
	    }

	    int mcd = a;

	    numerador /= mcd;
	    denominador /= mcd;

	}
	
	// g) Escribir el método de clase static Fraccion producto(Fraccion q1, Fraccion q2) que calcula el producto entre dos fracciones en nuevo objeto Fraccion. Éste debe estar reducido a su mínima expresión, de modo que el numerador y el denominador no tengan un divisor común mayor a 1.
	static Fraccion producto(Fraccion q1, Fraccion q2) {
		int denom = q1.denominador * q2.denominador;
		int num = q1.numerador * q2.numerador;
		Fraccion productoFraccion = new Fraccion (num, denom);
		productoFraccion.reducir();
		return productoFraccion;
		 
	}
	
	// h) Escribir el método de clase static Fraccion suma(Fraccion q1, Fraccion q2) que calcula la suma de dos fracciones en un nuevo objeto Fraccion. Éste debe debe estar reducido a su mínima expresión.
	static Fraccion suma(Fraccion q1, Fraccion q2) {
		int num;
		int denom;
		
		if (q1.denominador==q2.denominador) {
			num = q1.numerador + q2.numerador;
			denom = q1.denominador;
		} else {
			num = (q1.numerador*q2.denominador) + (q1.denominador*q2.numerador);
			denom = q1.denominador * q2.denominador;
		}
		
		Fraccion sumaFraccion = new Fraccion(num,denom);
		
		sumaFraccion.reducir();
		
		return sumaFraccion;
	}
	
	@Override
	public String toString() {
	    return numerador + "/" + denominador;
	}
	
	int numerador;
	int denominador;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraccion fraccion = new Fraccion(3,2);
		Fraccion fraccion2 = new Fraccion(9,8);
		// fraccion.invertir();
		//fraccion.imprimir();
		//System.out.println(fraccion.aDouble());
		System.out.println(producto(fraccion, fraccion2));
		System.out.println(suma(fraccion, fraccion2));		
	}
}
