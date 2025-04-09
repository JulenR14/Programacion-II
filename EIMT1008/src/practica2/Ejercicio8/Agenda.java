package practica2.Ejercicio8;

public class Agenda {
    private Tarea[] tareas;
    private int cantidadDeTareas;

    public Agenda(){
        cantidadDeTareas = 0;
        tareas = new Tarea[cantidadDeTareas];
    }

    int posiciónInserción(Tarea tarea){
        int posicion = -1;

        int contador = 0;
        boolean posicionEncontrada = false;
        while(contador < tareas.length && !posicionEncontrada){
            if(tareas[contador].getFecha().compareTo(tarea.getFecha()) <= 0){
                contador++;
            }else{
                posicion = contador;
                posicionEncontrada = true;
            }
        }

        if(!posicionEncontrada){
            posicion = tareas.length + 1;
        }

        return posicion;
    }
}
