public class Ruta {
    String nombre;
    double distancia;
    int dificultad;

    Ruta(String nombre, double distancia, int dificultad){
        this.nombre = nombre;
        this.distancia = distancia;
        if(dificultad >= 0 && dificultad <= 10){
            this.dificultad = dificultad;
        }
    }

    public String getNombre(){
        return nombre;
    }

    public double getDistancia(){
        return distancia;
    }

    public int getDificultad(){
        return dificultad;
    }
}
