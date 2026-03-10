package practicas.practica0;

import java.util.Scanner;

/* Acá se encuentran los ejercicios de la práctica 0 sección 4;
 * 			Cadenas.
 * */

public class SeccionCuatro {
	Scanner input = new Scanner(System.in);
	/* Ejercicio 16: 
	 * a) Escribir un programa que pida por pantalla un texto y a continuación lo imprima de atrás para adelante. Para obtener las letras de una cadena de caracteres pueden utilizar el método charAt de String. Por ejemplo, cadena.charAt(0) devuelve el primer caracter del String cadena.
b) Mover el código que imprime la cadena al revés a un método static void imprimirReversa(String cadena)
c) Escribir un m´etodo static String reversa(String cadena) que dado un String, devuelve otro String con los caracteres invertidos. Por ejemplo, reversa(‘‘hola’’) debería devolver el String ‘‘aloh’’.
d) Modificar el método imprimirReversa para que utilice el método definido en el punto anterior 
	 * */
	static void imprimirReversa(String s) {
		for (int i = s.length()-1;i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}
	
	// Ejercicio 17: Escribir un método static int cantidadApariciones(String s, char c) que dada una cadena y un caracter, cuenta la cantidad de veces que aparece c en s.
	static int cantidadApariciones(String s, char c) {
		int contadorDeChar = 0;
		
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)==c) {
				contadorDeChar++;
			}
		}
		return contadorDeChar;
	}
	
	// Ejercicio 18: Escribir un método static int cantidadVocales(String s) que dada una cadena que contiene sólo letras minúsculas sin acentuar, devuelve la cantidad de vocales en dicha cadena. Nota: se puede utilizar el método definido en el ejercicio anterior
	static int cantidadVocales(String s) {
		int contadorDeVocales = 0;
		
		for (int i=0;i<s.length();i++) {
			char c = Character.toLowerCase(s.charAt(i));
	        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú') {
	            contadorDeVocales++;
			}
		}
		return contadorDeVocales;		
	}
	
	/* Ejercicio 19:
	Una palabra se dice que es “abecedaria” si las letras en la palabra aparecen en orden alfabético. Por ejemplo, las siguientes son todas palabras abecedarias del idioma castellano: adiós, afín, afinó, ágil, bello, celos, cenó, chinos, dijo, dimos, dios, fijos, finos, hijos, hilos, himno
	1. Describí un algoritmo para decidir si una palabra dada es abecedaria, asumiendo que la misma contiene sólo letras minúsculas. 
	2. Implementar el algoritmo en un método: static boolean esAbecedaria(String s)
	3. ¿Funciona el algoritmo si le pasamos como parámetro “ágil”? En caso negativo, ¿por qué te parece que puede ser? ¿Cómo lo solucionarías?
	
	3. El algoritmo no funcionaría correctamente si la palabra contiene letras con tilde, porque los caracteres acentuados tienen un valor diferente en Unicode y no siguen necesariamente el mismo orden que las letras sin acento.*/
	static boolean esAbecedaria(String s) {
		for (int i=1;i<s.length();i++) {
			if (s.charAt(i)<s.charAt(i-1)) {
				return false;
			}
		}
		return true;
	}
	
	// Ejercicio 20: Escribir el método static boolean esCapicua(String s) que, dada una cadena, devuelve true si la cadena es igual de atrás hacia adelante o de adelante hacia atrás. En caso contrario, devuelve false.
	static boolean esCapicua(String s) {
	    for (int i = 0; i < s.length() / 2; i++) {
	        if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
	            return false;
	        }
	    }
	    return true;
	}
	
	// Ejercicio 21: Escribir un m´etodo static boolean esSinRepetidos(String s) que dada una cadena, devuelve true si no hay letras repetidas en la cadena. En caso contrario, devuelve false. 
	static boolean esSinRepetidos(String s) {
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j)==c) {
					return false;
				}
			}
		}
		return true;
	}
	
	// Ejercicio 22: Escribir un método static String sinRepetidos(String s) que dada una cadena, devuelve una nueva cadena donde cada uno de los caracteres que aparecían en s, aparecen sólo una vez. Se debe mantener la posición relativa de los caracteres: para aquellos que se encuentren repetidos puede conservarse cualquiera de sus apariciones. Por ejemplo, para la palabra ‘‘casos’’ puede devolver ‘‘caso’’ o ‘‘caos’’, conservando la primera o la segunda letra s respectivamente
	static String sinRepetidos(String s) {
		String palabraSinRepetidos = "";
		for (int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			if (palabraSinRepetidos.contains("" + c)==false){
			palabraSinRepetidos = palabraSinRepetidos + c;	
			}
		}
		return palabraSinRepetidos;
	}
	
	// Ejercicio 23: Para el desarrollo de un sistema generador de juegos de palabras cruzadas, se necesita programar la siguiente función. Dadas 3 cadenas, a, b y c, se quiere saber si puede colocarse b de manera vertical de modo que a y c se coloquen de manera horizontal atravezando a b. Se necesita también que a esté más arriba que c y tengan al menos un renglón de diferencia. Por	ejemplo, a = ”JUGO”, b = ”BUENO”, c = ”ANANA” pueden colocarse como muestra la Figura 1, por lo tanto el m´etodo debe devolver Verdadero. En cambio, a = ”JUGO”, b = ”FEO”, c =”ANANA” no pueden colocarse, y por ende debería devolver Falso. El encabezado del método debe ser static boolean puedenColocarse(String a, String b, String c).
	static boolean puedenColocarse(String a, String b, String c) {
		for (int i = 0; i<b.length(); i++) {
			if(a.indexOf(b.charAt(i)) != -1) { // ubicamos a en b
				i++;
				for (int j = i + 1; j<b.length(); j++) {
					if (c.indexOf(b.charAt(j)) != -1) {// ubicamos c en b
						return true;
					}
				}
				return false;
			}
		}
		return false;
	}
	
	// Ejercicio 24:
	/*
	 * Decimos que una cadena de caracteres es un "doblete capicúa" si la cadena puede escribirse como la concatenación de dos cadenas que sean capicúas.Ejemplos:
	 * - "neuquenoro" es doblete capicúa porque es la concatenación de "neuquen" y "oro", ambas capicúas.
	 * - "banana" es doblete capicúa porque es la concatenación de "b" y "anana", ambas capicúas.
	 * - "eter" es doblete capicúa porque es la concatenación de "ete" y "r", ambas capicúas.
	 * - "sanas" es doblete capicúa porque puede escribirse como "sanas" y "", ambas capicúas (la cadena vacía también cuenta).
	 * - "nunca" no es doblete capicúa porque no existe una forma de dividir la cadena en dos partes que sean capicúas.
	 * Escribir un método: static boolean esDobleteCapicua(String s) que devuelva true si la cadena es doblete capicúa y false en caso contrario.*/
	static boolean esDobleteCapicua(String s) {
		for (int i = 0; i<s.length(); i++) {
			String parte1 = s.substring(0, i);
			String parte2 = s.substring(i);
			
			if (esCapicua(parte1) && esCapicua(parte2)) {
				return true;
			}
		}
		return false;
	}
	

	public static void main(String[] args) {
		// ejercicio 16
		imprimirReversa("hola");
		System.out.println();
		// ejercicio 17
		System.out.println(cantidadApariciones("oruga", 'a'));
		// ejercicio 18
		System.out.println(cantidadVocales("murciélago"));
		// ejercicio 19
		System.out.println(esAbecedaria("bello"));
		// ejercicio 20
		System.out.println(esCapicua("radar"));;
		// ejercicio 21
		System.out.println(esSinRepetidos("casos"));
		// ejercicio 22
		System.out.println(sinRepetidos("que buen ejercicio"));
		// ejercicio 23 
		System.out.println(puedenColocarse("JUGO", "BUENO", "ANANA"));
		// ejercicio 24
		System.out.println(esDobleteCapicua("neuquenoro"));
	}

}
