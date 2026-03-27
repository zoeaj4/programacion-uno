package ejerciciosCampus;

public class EjerciciosParcialRecursividad {
	public static boolean esAbecedaria(String s) {
	    if (s == null || s.length() <= 1) {
	        return true;
	    }

	    if (s.charAt(0) > s.charAt(1)) {
	        return false;
	    }

	    return esAbecedaria(s.substring(1));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
