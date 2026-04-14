package practicas.practica1.ejercicio10;

public class UNGS {
	
	boolean cursaCon(Estudiante e, Docente d) {
	    for (int i = 0; i < comisiones.length; i++) {
	        
	        // recorrer docentes
	        for (int k = 0; k < comisiones[i].docentes.length; k++) {
	            
	            if (comisiones[i].docentes[k].equals(d)) {
	                
	                // recorrer estudiantes
	                for (int j = 0; j < comisiones[i].inscriptos.length; j++) {
	                    if (comisiones[i].inscriptos[j].equals(e)) {
	                        return true;
	                    }
	                }
	            }
	        }
	    }
	    return false;
	}
	
	boolean suficientesDocentes() {
	    
	    // Recorro todas las comisiones de la universidad
	    for (int i = 0; i < comisiones.length; i++) {
	        
	        Comision c = comisiones[i]; // agarro la comisión actual
	        
	        // ---------------------------
	        // Contar estudiantes inscriptos (no null)
	        // ---------------------------
	        int cantidadInscriptos = 0;
	        for (int j = 0; j < c.inscriptos.length; j++) {
	            if (c.inscriptos[j] != null) { // si hay un estudiante
	                cantidadInscriptos++;     // lo cuento
	            }
	        }
	        
	        // ---------------------------
	        // Contar docentes (no null)
	        // ---------------------------
	        int cantidadDocentes = 0;
	        for (int k = 0; k < c.docentes.length; k++) {
	            if (c.docentes[k] != null) { // si hay un docente
	                cantidadDocentes++;      // lo cuento
	            }
	        }
	        
	        // ---------------------------
	        // Calcular docentes necesarios
	        // ---------------------------
	        // Regla: 1 docente cada 20 alumnos
	        // (inscriptos + 19) / 20 simula un "redondeo hacia arriba"
	        int docentesNecesarios = (cantidadInscriptos + 19) / 20;
	        
	        // ---------------------------
	        // Verificar si alcanza
	        // ---------------------------
	        if (cantidadDocentes < docentesNecesarios) {
	            return false; // si UNA comisión no cumple
	        }
	    }
	    
	    return true; // si todas cumplen, entonces sí hay suficientes docentes
	}
	
	Estudiante elMasEstudioso() {
	    
	    Estudiante mejor = null;
	    int maxAprobadas = -1;

	    // Recorro todas las comisiones
	    for (int i = 0; i < comisiones.length; i++) {
	        
	        Comision c = comisiones[i];

	        // Recorro estudiantes de la comisión
	        for (int j = 0; j < c.inscriptos.length; j++) {
	            
	            Estudiante e = c.inscriptos[j];
	            
	            if (e != null) {
	                
	                int aprobadas = 0;

	                // Recorro TODAS las comisiones para contar aprobadas de ESTE estudiante
	                for (int k = 0; k < comisiones.length; k++) {
	                    
	                    Comision otra = comisiones[k];

	                    for (int m = 0; m < otra.inscriptos.length; m++) {
	                        
	                        if (otra.inscriptos[m] != null &&
	                            otra.inscriptos[m].equals(e) &&
	                            otra.calificaciones[m] >= 4) {
	                            
	                            aprobadas++;
	                        }
	                    }
	                }

	                // Comparo con el máximo actual
	                if (aprobadas > maxAprobadas) {
	                    maxAprobadas = aprobadas;
	                    mejor = e;
	                }
	            }
	        }
	    }

	    return mejor;
	}
	
	Comision[] comisiones;
}
