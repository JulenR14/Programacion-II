package Practica3.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class LineaPoligonal {

    //Talla = lineaPoligonal.length;
    private ArrayList<Punto> lineaPoligonal;
    //Ocupación = cantidad de puntos que hay en el vector
    private int cantidadPuntos;

    public LineaPoligonal(){
        lineaPoligonal = new ArrayList<>();
    }

    public void añadir(Punto punto){
        lineaPoligonal.add(punto);
    }

    public void quitar(int posicion){
        if(posicion >= 0 && posicion < cantidadPuntos){
            for(int i =0; i < cantidadPuntos;i++){
                if(i>=posicion){
                    if(i+1 != cantidadPuntos){
                        lineaPoligonal.set(i, lineaPoligonal.get(i+1));
                    }else{
                        lineaPoligonal.set(i, null);
                    }
                }
            }
            cantidadPuntos--;
        }
    }

    public void quitar(Punto punto){
        int contador = 0;
        while (contador<cantidadPuntos && !lineaPoligonal.get(contador).equals(punto)){
            contador++;
        }
        quitar(contador);
    }

    public void trasladar(double desplazamientoX, double desplazamientoY){
        for (int i = 0; i < cantidadPuntos; i++){
            lineaPoligonal.set(i, lineaPoligonal.get(i).desplazar(desplazamientoX, desplazamientoY));
        }
    }

    public double longitud(){
        double longitud = 0;
        if(cantidadPuntos > 1){
            for (int i = 0; i<cantidadPuntos-1;i++){
                longitud += lineaPoligonal.get(i).distancia(lineaPoligonal.get(i+1));
            }
        }
        return longitud;
    }

    public String toString(){
        String mostrar = "";
        for (int i = 0; i < cantidadPuntos; i++){
            if(i==cantidadPuntos-1){
                mostrar += lineaPoligonal.get(i);
            }else{
                mostrar += lineaPoligonal.get(i) + "--";
            }
        }
        return mostrar;
    }
}
