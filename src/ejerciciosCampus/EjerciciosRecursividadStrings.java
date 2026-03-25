package ejerciciosCampus;

public class EjerciciosRecursividadStrings {
	
	// función auxiliar 
	public static String resto(String s) {
		String resto = s.substring(1);
		return resto;
	}
	
	// Ejercicio 1: Escribir una función recursiva public static int longitud(String s) que devuelve la longitud del String s. No vale usar length().
	public static int longitud (String s) {
		if (s.equals("")) {
			return 0;
		}
		return 1 + longitud(s.substring(1));
	}
	
	// Ejercicio 2: Escribir una función recursiva public static void imprimirEspaciado(String s) que imprima el String s con un espacio luego de cada caracter. Por ejemplo, imprimirEspaciado("Juan") muestra por pantalla "J u a n ".
	public static void imprimirEspaciado(String s) {
		if (s.equals ("")) {
			System.out.println("");
			return;
		}
		System.out.print(s.charAt(0) + " ");
		imprimirEspaciado(resto(s));
	}
	
	// Ejercicio 3: Escribir una función que tome un String como parámetro y lo imprima por intercalando un '∗' entre cada letra (pero no al final del String). Por ejemplo, si la función toma el string "hola" como argumento, deberá imprimir "h∗o∗l∗a".
	public static void imprimirAsteriscos(String s) {
		if (s.equals ("")) {
			System.out.println("");
			return;
		}
		System.out.print(s.charAt(0) + "*");
		imprimirAsteriscos(resto(s));		
	}
	
	// Ejercicio 4: Escribir la función recursiva public static String reverso(String s) que devuelva el String que resulta de invertir todos los caracteres de s. Por ejemplo, reverso("casa") devuelve "asac".
	public static String reverso(String s) {
	    if (s == null || s.equals("")) {
	        return "";
	    }
	    return reverso(s.substring(1)) + s.charAt(0);
	}
	
	// Ejercicio 5: Escribir la función recursiva public static String combinar(String s, String t) que devuelva el String que resulta de comparar s y t caracter a caracter y colocar el menor de ellos en el resultado. Si un String es más largo que el otro, el resto de ese String se agrega al final del resultado.
	public static String combinar(String s, String t) {
	    if (s.equals("")) return t;
	    if (t.equals("")) return s;

	    char c1 = s.charAt(0);
	    char c2 = t.charAt(0);

	    char menor;
	    if (c1 <= c2) {
	        menor = c1;
	    } else {
	        menor = c2;
	    }

	    return menor + combinar(s.substring(1), t.substring(1));
	}
	
	// Ejercicio 6: Implementar la función recursiva public static boolean esAbecedaria(String s) que indica si s es una palabra "abecedaria". Una palabra se dice que es "abecedaria" si las letras en la palabra aparecen en orden alfabético. Por ejemplo, la siguientes son todas palabras abecedarias del castellano.
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
		System.out.println(resto("hola"));

		// ejercicio 1:
		System.out.println(longitud("hola"));
		// ejercicio 2:
		imprimirEspaciado("hola");
		System.out.println();
		// ejercicio 3:
		imprimirAsteriscos("hola");
		// ejercicio 4:
		System.out.println(reverso("hola"));
		// ejercicio 5:
		System.out.println(combinar("hola", "casa"));
		// ejercicio 6:
		System.out.println(esAbecedaria("adios"));

	}

}
