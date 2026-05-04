package practicas.practica1.ejercicio11;

public class Aerolinea {
    Vuelo[] vuelos;


/*a) Escribir un metodo int vuelosEn(Tripulante t, String tipoAvion) que recibe un tripulante t y
un tipo de avion e indica cuantos vuelos realizó t en aviones del tipo dado.
 */
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
/*Escribir un metodo int antiguedadPromedio(String tipoAvion) que recibe un tipo de avion y
calcula el promedio de las antiguedades de los tripulantes en vuelos en aviones del tipo dado
 */
    int antiguedadPromedio(String tipoAvion){
        int contadorIteraciones =0;
        int sumaAntiguedades = 0;
        for (int i = 0; i<vuelos.length;i++){
            if(vuelos[i].avion.tipo.equals(tipoAvion)){
                for (int j =0; j<vuelos[i].tripulacion.length;j++){
                    sumaAntiguedades=sumaAntiguedades+vuelos[i].tripulacion[j].antiguedad;
                    contadorIteraciones++;
                }
            }
        }
        if (contadorIteraciones == 0) {
    return 0;
        }
        int promedioAntiguedad=sumaAntiguedades/contadorIteraciones;
        return promedioAntiguedad;
    }

    /*c) Escribir un metodo Vuelo elMasInspeccionado() que devuelve el vuelo en el que se hayan trans-
portado mas tripulantes con cargo de “Inspector”. En caso de haber m´as de un vuelo con la
misma cantidad de inspectores, puede devolver cualquiera de ellos
     */

    Vuelo elMasInspeccionado(){
        
        Vuelo elMas = vuelos[0];
        int maximo= 0;

        for(int k = 0; k < vuelos[0].tripulacion.length;k++){
            if(vuelos[0].tripulacion[k].cargo.equals("Inspector")){
                maximo++;
            }
        }

        for (int i = 1; i<vuelos.length; i++){
            int contadorInspector1=0;
            for (int j = 0; j<vuelos[i].tripulacion.length; j++){
                if (vuelos[i].tripulacion[j].cargo.equals("Inspector")){
                    contadorInspector1++;
                }

            }
        
            if (contadorInspector1>maximo) {
                elMas=vuelos[i];
                maximo=contadorInspector1;
            }
        }
        return elMas;
    }

    /*d) Escribir un m´etodo boolean hayVueloSobrecargado() que devuelve true cuando hay al menos
un vuelo en el que la cantidad de tripulantes con cargo de “Aeromozo” supere el 10 % de la
capacidad del avi´on. */

    boolean hayVueloSobrecargado(){
        for (int i = 0; i<vuelos.length;i++){
            int contador = 0;

            for (int j = 0; j<vuelos[i].tripulacion.length;j++){
                if (vuelos[i].tripulacion[j].cargo.equals("Aeromozo")){
                    contador++;
                }   
            }

            double diezPorcientoTripulacion = vuelos[i].avion.capacidad * 0.10;
            
            if (contador>diezPorcientoTripulacion){
                return true;
            }

        }
        
        return false;
    }

}
