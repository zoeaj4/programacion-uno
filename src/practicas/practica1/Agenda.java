package practicas.practica1;

public class Agenda {
	
	public Agenda(int tamanio) {
	    contactos = new Persona[tamanio];
	    telefonos = new String[tamanio];
	}
	
	void guardar(Persona contacto, String telefono) {
		
		// buscar posición libre
		for (int i = 0; i<contactos.length; i++) {
			if (contactos[i]==null) {
				contactos[i] = contacto;
	            telefonos[i] = telefono;
	            return;
			}
		}
		// Si no hay lugar redimensionar
		int nuevoTamanio = contactos.length*2;
		Persona[] nuevosContactos = new Persona[nuevoTamanio];
		String[] nuevosTelefonos = new String[nuevoTamanio];
		
		// Copio los datos
		for (int i = 0; i < contactos.length; i++) {
			nuevosContactos[i] = contactos[i];
			nuevosTelefonos[i] = telefonos[ i];
		}
		
		// Reasigno
		contactos = nuevosContactos;
		telefonos = nuevosTelefonos;
		
		// Guardar el nuevo
	    contactos[contactos.length / 2] = contacto;
	    telefonos[telefonos.length / 2] = telefono; 
	    // divido por dos porque antes multipliqué por dos, esto me da el índice
	}
	
	Persona[] contactos;
	String[] telefonos; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
