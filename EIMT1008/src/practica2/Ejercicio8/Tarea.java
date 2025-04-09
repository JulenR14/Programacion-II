package practica2.Ejercicio8;

public class Tarea {
    private Fecha fecha;
    private String descripción;

    public Tarea(Fecha fecha, String descripción){
       this.fecha = fecha;
       this.descripción = descripción;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public String getDescripción(){
        return descripción;
    }

    public String toString(){
        return String.format("%s/%s/%s: %s", fecha.getDía(), fecha.getMes(), fecha.getAño(), descripción);
    }
}
