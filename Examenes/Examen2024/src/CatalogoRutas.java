public class CatalogoRutas {
    private Ruta[] vector;
    private static final int TAMAÑO_INICIAL = 10;
    private int cantidad;

    public CatalogoRutas() {
        this.vector = new Ruta[TAMAÑO_INICIAL];
        this.cantidad = 0; // Inicialmente el cat´alogo de rutas est´a vac´ıo
    }

    public void añadirNuevaRuta(String nombreRuta, double distancia, int dificultad){
        if(dificultad >= 0 && dificultad <= 10){
            Ruta nuevaRuta = new Ruta(nombreRuta, distancia, dificultad);
            int posicionAgregar = -1;

            for(int i = 0; i < cantidad && posicionAgregar == -1; i++){
                if(vector[i].getNombre().compareTo(nombreRuta) > 0){
                    posicionAgregar = i;
                }
            }

            if(cantidad < vector.length){
                for(int i = cantidad-1; i >= posicionAgregar;i--){
                    vector[i+1]= vector[i];
                }
                vector[posicionAgregar] = nuevaRuta;
                cantidad++;
            }else{
                Ruta[] ampliacion = new Ruta[vector.length*2];
                if(posicionAgregar == -1){
                    for(int i = 0; i < cantidad; i++){
                        ampliacion[i] = vector[i];
                    }
                    ampliacion[cantidad] = nuevaRuta;
                    vector = ampliacion;
                    cantidad++;
                }else{

                }
            }
        }
    }
}
