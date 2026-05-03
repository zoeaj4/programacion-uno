package practicas.practica1.ejercicio11;

public class Aerolinea {
    Vuelo[] vuelos;



    int vuelosEn(Tripulante t, String tipoAvion){
        int contador = 0;
        for (int i = 0; i<vuelos.length;i++){
            if (vuelos[i].avion.tipo.equals(tipoAvion)){
                for (int j = 0; j<vuelos[i].tripulacion.length;j++){
                    if (vuelos[i].tripulacion[j].equals(t)){
                        contador++;
                    }
                }
            }
        }
        return contador;
    }
}
