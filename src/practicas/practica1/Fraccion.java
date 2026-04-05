package practicas.practica1;

public class Fraccion {
	
	// a
	public Fraccion (int numerador, int denominador) {
		this.numerador=numerador;
		this.denominador=denominador;
	}
	
	// b
	void imprimir() {
		System.out.println(numerador);
		System.out.println("--");
		System.out.println(denominador);
	}
	
	// c
	void invertirSigno() {
		numerador = this.numerador*-1;
	}
	
	// d
	void invertir() {
		int aux = numerador;
		this.numerador = denominador;
		this.denominador = aux;
	}
	
	// e
	double aDouble() {
		return (double) numerador / denominador;
	}
	
	
	int numerador;
	int denominador;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraccion fraccion = new Fraccion(3,2);
		//fraccion.invertir();
		//fraccion.imprimir();
		System.out.println(fraccion.aDouble());
	}

}
