package practica2.Ejercicio8;

import java.util.Arrays;

public class Agenda {
    private Tarea[] tareas;

    public Agenda(){
        tareas = new Tarea[0];
    }

    private int posiciónInserción(Tarea tarea){
        int posicion = 0;
        while(posicion < tareas.length && (tareas[posicion].getFecha().compareTo(tarea.getFecha()) <= 0)){
            posicion++;
        }
        return posicion;
    }

    public void añadir(Tarea tarea){
        int posicionAñadir = posiciónInserción(tarea);
        Tarea[] nuevaLista = new Tarea[tareas.length + 1];

        for (int i=0; i<nuevaLista.length;i++){
            if(i<posicionAñadir){
                nuevaLista[i] = tareas[i];
            }else if(i==posicionAñadir){
                nuevaLista[i] = tarea;
            }else{
                nuevaLista[i] = tareas[i-1];
            }
        }
        tareas = nuevaLista;
    }

    public int cantidad(){
        return tareas.length;
    }

    public Tarea[] consultar(Fecha fecha){
        int cantidadTareas = 0;
        int posicion = 0;
        while (posicion < tareas.length && tareas[posicion].getFecha().compareTo(fecha) <= 0){
            if(tareas[posicion].getFecha().compareTo(fecha) == 0){
                cantidadTareas++;
            }
            posicion++;
        }
        Tarea[] tareasFecha = new Tarea[cantidadTareas];

        posicion = 0;
        while (posicion < tareas.length && tareas[posicion].getFecha().compareTo(fecha) <= 0){
            if(tareas[posicion].getFecha().compareTo(fecha) == 0){
                tareasFecha[tareasFecha.length - cantidadTareas--] = tareas[posicion];
            }
            posicion++;
        }
        return tareasFecha;
    }

    public void borrarPasadas(Fecha fecha){
       int contador = tareas.length - 1;
       while (contador >= 0 && tareas[contador].getFecha().compareTo(fecha) >= 0){
           contador--;
       }
       contador++;

       Tarea[] nuevaLista = new Tarea[tareas.length - contador];
       contador = tareas.length - 1 ;
       for(int i= nuevaLista.length-1; i >= 0; i--){
           nuevaLista[i] = tareas[contador--];
       }

       tareas = nuevaLista;
    }

    public String toString(){
        return Arrays.toString(tareas);
    }
}
