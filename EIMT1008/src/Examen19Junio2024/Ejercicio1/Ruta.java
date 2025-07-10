package Examen19Junio2024.Ejercicio1;

public class Ruta {
    String nombre;
    double distancia;
    int dificultad;

    public Ruta (String nombre, double distancia, int dificultad){
        this.nombre = nombre;
        this.distancia = distancia;
        this.dificultad = dificultad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getDistancia(){
        return this.distancia;
    }

    public int getDificultad(){
        return this.dificultad;
    }

    public String toString(){
        return "{ nombre: " + nombre + ", distancia: " + distancia + ", dificultad: " + dificultad + " }";
    }
}
