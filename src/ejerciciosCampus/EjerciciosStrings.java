package ejerciciosCampus;

public class EjerciciosStrings {
	
	// Ejercicio 1: Hacer una función que tome un String y cuente la cantidad de veces que aparece la letra 'e'.
	static int cuantasE(String s) {
		int contadorE = 0;
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)=='e') {
				contadorE++;
			}
			
		}
		return contadorE;
	}
	
	// Ejercicio 2: Hacer una función que devuelva Verdadero si esta compuesta solamente por letras 'e'
	static boolean compuestaPorE (String s) {
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)!='e') {
				return false;
			}
			
		}
		return true;
	}
	
	// Ejercicio 3: Hacer una función que se llame static boolean sonIguales(String s1, String s2) y devuelva verdadero si son iguales ambas cadenas.
	static boolean sonIguales (String s1, String s2) {
		if (s1.length()!=s2.length()) {
			return false;
		}
		for (int i=0;i<s1.length();i++) {
			if (s1.charAt(i)!=s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	// Ejercicio 4: Hacer una función que tome una cadena y devuelva Verdadero si la cadena es "duódroma". Falso en caso contrario. Una cadena es "duódroma" si esta compuesta solamente por letras duplicadas contiguas.
	static boolean esDuodroma(String s) {
		if (s.length()%2 != 0) {
			return false;
		}
		
		for (int i=0;i<s.length();i+=2) {
			if (s.charAt(i)!=s.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}
	
	// Ejercicio 5: Implementar la función static boolean esPrefijo(String s, String prefijo) que consulta si la cadena prefijo coincide con los primeros caracteres de s.
	static boolean esPrefijo(String s, String prefijo) {
	    if (prefijo.length() > s.length()) {
	        return false;
	    }
	    for (int i=0;i<prefijo.length();i++) {
			if (s.charAt(i)!=prefijo.charAt(i)) {
				return false;
			}
		}
	    return true;
	    
	}
	
	// Ejercicio 6: Implementar la función static boolean esPrefijoDesde(String s, String prefijo, int posicion) que retorna verdadero si la cadena prefijo coincide con los primeros caracteres de s a partir de la posicion tomada como parametro.
	static boolean esPrefijoDesde (String s, String prefijo, int posicion) {
		
		if (s.length()<(posicion + prefijo.length())) {
			return false;
		}
		 for (int i = 0; i < prefijo.length(); i++) {
		        if (s.charAt(posicion + i) != prefijo.charAt(i)) {
		            return false;
		        }
		    }
		return true;
	}
	
	// Ejercicio 7: Hacer la funcion static boolean esSubcadena(String s, String s2) que retorna verdadero si y solo si s esta incluida en s2.
	static boolean esSubcadena(String s, String s2) {
	    for (int i = 0; i <= s2.length() - s.length(); i++) {
	        if (esPrefijoDesde(s2, s, i)) {
	            return true;
	        }
	    }
	    return false;
	}
	
	// Ejercicio 8: Implemente un programa que indique si una palabra es un palíndrome, una palabra es palíndrome si se lle igual de izquierda a drecha que de derecha a izquierda.
	static boolean esPalindromo(String s) {
		for (int i = 0; i <s.length()/2; i++){
			if (s.charAt(i)!= s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 1:
		System.out.println("Hay " + cuantasE("ayer") + " 'e' en tu palabra.");
		// Ejercicio 2:
		System.out.println(compuestaPorE("eeeeee"));
		// Ejercicio 3:
		System.out.println(sonIguales("ayer","hoy"));
		// Ejercicio 4:
		System.out.println(esDuodroma("llaammaa"));
		// Ejercicio 5:
		System.out.println(esPrefijo("holanda", "hola"));
		// Ejercicio 6:
		System.out.println(esPrefijoDesde("computadora", "tado", 3));
		// Ejercicio 7:
		System.out.println(esSubcadena("peon", "campeon"));
		// Ejercicio 8:
		System.out.println(esPalindromo("holaaloh"));
	}

}
