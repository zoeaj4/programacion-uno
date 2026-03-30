package ejerciciosCampus;

public class EjerciciosParcialRecursividad {
	
	// función auxiliar 
	public static String resto(String s) {
		String resto = s.substring(1);
		return resto;
	}
	
	// función auxiliar
	
	static boolean esVocal(char c) {
		if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U' ) {
			return true;
		}
		return false;
	}
	
	// Ejercicio 1: Escribir una función recursiva String espejar(String s) que dada una cadena s que retorna la ocncatenación entre la cadena s y su inverso.
	static String espejar(String s) {
		if (s.equals("")) {
			return "";
		}
		return s.charAt(0) + espejar(resto(s)) + s.charAt(0);
	}
	
	
	// Ejercicio 2: Escribir una función recursiva String estaPrimera(String s1, String s2) que toma dos String s1 y s2 y devuleve el String que está primero en el diccionario.
	static String estaPrimera(String s1, String s2) {
		
		if (s1.equals("") && s2.equals("")) {
			return "";
		}
		if (s1.equals("")) {
			return s1;
		}
		if (s2.equals("")) {
			return s2;
		}
		
		char c1 = s1.charAt(0);
		char c2 = s2.charAt(0);
		
	    // Si son distintos		
		if (c1<c2) {
			return s1;
		}
		
		if (c2<c1) {
			return s2;
		}
		
		// Si son iguales
		return estaPrimera(resto(s1), resto(s2));
	}
	
	// Ejercicio 3: Escribir una función recursiva String repetirLetras(String s) que toma un string s y devuelve un string igual a s pero en el cual se han repetido 2 veces todas las vocales que estén seguidas por una vocal y 3 veces todas las que estén seguidas por otra consonante.
	static String repetirLetras(String s) {
		if (s.length() == 1) {
		    return "" + s.charAt(0);
		}
		char primero = s.charAt(0);
		char segundo = s.charAt(1);
		
		//si es una vocal tras otra
		if ((esVocal(primero)==true) && (esVocal(segundo)==true)) {
			return "" + primero + primero +  repetirLetras(resto(s));
		}
		
		// si es una consonante tras otra
		if ((esVocal(primero)==false) && (esVocal(segundo)==false)) {
			return "" + primero + primero + primero + repetirLetras(resto(s));
		}
		return "" + primero + repetirLetras(resto(s));
	}
	
	// Ejercicio 4: Escribir una función String subcadena (String s, int desde, int hasta) qu edada una cadena s y dos enteros desde y hasta, retorna una subcadena de s tomando los caracteres desde la posicion de desde y hasta la posición hasta inclusive.
	static String subcadena(String s, int desde, int hasta) {
	    if (s.equals("") || hasta < 0) {
	        return "";
	    }

	    if (desde > 0) {
	        return "" + subcadena(resto(s), desde - 1, hasta - 1);
	    }

	    return s.charAt(0) + "" + subcadena(resto(s), desde - 1, hasta - 1);
		}
	
	// Ejercicio 5: Escribir una función boolean comienzaCon(String s1, String s2) que dadas dos cadenas s1 y s2 retorna verdadero si la cadena s2 comienza con la cadena s1, falso en caso contrario.
	static boolean comienzaCon(String s1, String s2) {
		 if (s1.equals("")) {
			 return true;
		 }
		 
		 if (s2.equals("")) {
			 return false;
		 }
		 
		 if (s1.charAt(0)!=s2.charAt(0)) {
			 return false;
		 }
		 
		 return comienzaCon(resto(s1), resto(s2));
		 
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 1:
		System.out.println(espejar("hola"));
		// Ejercicio 2:
		System.out.println(estaPrimera("zoe","gabi"));
		// Ejercicio 3:
		System.out.println(repetirLetras("abcde"));
		// Ejercicio 4:
		System.out.println(subcadena("licenciado",3, 7));
		// Ejercicio 5:
		System.out.println(comienzaCon("sol", "solamente"));

	}

}

