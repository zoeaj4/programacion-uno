 package practicas.practica1;

public class Punto {

	public Punto () {
		x = 0.0;
		y = 0.0;
	}
	
	public Punto (double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	void imprimir () {
		System.out.println("#####################");
		System.out.println("Coordenada de X: " + x);
		System.out.println("Coordenada de Y: " + y);
		System.out.println("#####################");
	}
	
	void desplazar (double desp_x, double desp_y) {
		this.x += desp_x;
		this.y += desp_y;
	}
	
	static double distancia (Punto p1, Punto p2) {
		double dx = p2.x - p1.x;
		double dy = p2.y - p1.y;
		return Math.sqrt(dx * dx + dy * dy);
		
	}

	double x;
	double y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto miPunto = new Punto();
		Punto miPunto2 = new Punto(90,6);
		miPunto.imprimir();
		miPunto.desplazar(9, 10);
		miPunto.imprimir();
		System.out.println(distancia(miPunto,miPunto2));
	}

}
