package practicas.practica1;

public class Persona {
	
	public Persona (String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	boolean masJovenQue(Persona otro) {
		if (this.edad<otro.edad) {
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean tocayo(Persona otro) {
		if (this.nombre.equals(otro.nombre)) {
			return true;
		} else {
			return false;
		}
	}
	
	boolean mismaPersona(Persona otro) {
		if ((this.nombre.equals(otro.nombre)) && (this.edad==otro.edad)) {
			return true;
		} else {
			return false;
		}	
	}
	
	static Persona masJoven(Persona [] grupo) {
		Persona masJoven = grupo[0];
		for (int i = 1; i<grupo.length; i++) {
			if (grupo[i].edad<masJoven.edad ) {
				masJoven = grupo[i];
				
			}
		}
		return masJoven;
	}
	static Persona buscar(Persona[] grupo, String nombre) {
		for (int i = 0; i<grupo.length; i++) {
			if (grupo[i].nombre.equals(nombre)) {
				return grupo[i];
			}
		}
		return null;
	}
	
	
	
	String nombre;
	int edad;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona[] grupo = new Persona[5];
		grupo[0] = new Persona("Pablo",93);
		grupo[1] = new Persona("Marcos",80);
		grupo[2] = new Persona("Matias",71);
		grupo[3] = new Persona("Juan",16);
		grupo[4] = new Persona("Cesar",20);
		System.out.println(masJoven(grupo).nombre);
		}

}
