package practicas.practica0;
/* Acá se encuentran los ejercicios de la práctica 0 sección 6;
 * 			Recursividad.
 * */
public class SeccionSeis {
	
	// Ejercicio 30
	static int sumatoriaRec(int n) {
		if (n == 0) {
			return 0;
		}
		return n + sumatoriaRec(n-1);
	}
	
	// Ejercicio 31
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ejercicio 30
		System.out.println(sumatoriaRec(8));
		System.out.println(sumatoriaParesRec(4));
	}

}
