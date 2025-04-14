package practica2.Ejercicio9;

public class LineaPoligonal {

    //Talla = lineaPoligonal.length;
    private Punto[] lineaPoligonal;
    //Ocupación = cantidad de puntos que hay en el vector
    private int cantidadPuntos;

    public LineaPoligonal(){
        lineaPoligonal = new Punto[10];
    }

    public void añadir(Punto punto){
        if(lineaPoligonal.length == cantidadPuntos){
            Punto[] nuevaLinea = new Punto[lineaPoligonal.length * 2];
            for(int i=0;i<lineaPoligonal.length;i++){
                nuevaLinea[i] = lineaPoligonal[i];
            }
            nuevaLinea[cantidadPuntos] = punto;
            lineaPoligonal = nuevaLinea;
        }else{
            lineaPoligonal[cantidadPuntos] = punto;
        }
        cantidadPuntos++;
    }

    public void quitar(int posicion){
        if(posicion >= 0 && posicion < cantidadPuntos){
            for(int i =0; i < cantidadPuntos;i++){
                if(i>=posicion){
                    if(i+1 != cantidadPuntos){
                        lineaPoligonal[i] = lineaPoligonal[i+1];
                    }else{
                        lineaPoligonal[i] = null;
                    }
                }
            }
            cantidadPuntos--;
        }
    }

    public void quitar(Punto punto){
        int contador = 0;
        while (contador<cantidadPuntos && !lineaPoligonal[contador].equals(punto)){
            contador++;
        }
        quitar(contador);
    }

    public void trasladar(double desplazamientoX, double desplazamientoY){
        for (int i = 0; i < cantidadPuntos; i++){
            lineaPoligonal[i] = lineaPoligonal[i].desplazar(desplazamientoX, desplazamientoY);
        }
    }

    public double longitud(){
        double longitud = 0;
        if(cantidadPuntos > 1){
            for (int i = 0; i<cantidadPuntos-1;i++){
                longitud += lineaPoligonal[i].distancia(lineaPoligonal[i+1]);
            }
        }
        return longitud;
    }

    public String toString(){
        String mostrar = "";
        for (int i = 0; i < cantidadPuntos; i++){
            if(i==cantidadPuntos-1){
                mostrar += lineaPoligonal[i];
            }else{
                mostrar += lineaPoligonal[i] + "--";
            }
        }
        return mostrar;
    }
}
