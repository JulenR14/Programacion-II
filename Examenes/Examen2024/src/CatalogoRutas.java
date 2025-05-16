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

            int posicionAgregar = 0;
            while(posicionAgregar < cantidad && (vector[posicionAgregar].nombre.compareTo(nombreRuta) <= 0)){
                posicionAgregar++;
            }

            if(cantidad < vector.length){
               for(int i = cantidad; i >= 0; i--){
                   if(i > posicionAgregar){
                       vector[i] = vector[i-1];
                   }else if( i == posicionAgregar){
                       vector[i] = nuevaRuta;
                   }
               }
               cantidad++;
            }

            /*if (cantidad == 0){
                vector[0] = nuevaRuta;
                cantidad++;
            }else{
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
                    for(int i = 0; i <= cantidad; i ++){
                        if(i < posicionAgregar){
                            ampliacion[i] = vector[i];
                        }else if(i == posicionAgregar){
                            ampliacion[i] = nuevaRuta;
                        }else{
                            ampliacion[i] = vector[i-1];
                        }
                    }
                    cantidad++;
                }
            }*/
        }
    }

    public String toString(){
        String cadena = "";
        for(int i = 0; i < cantidad; i++){
            cadena += vector[i].getNombre() + " " + vector[i].getDistancia() + " " + vector[i].getDificultad() + "\n";
        }
        return cadena;
    }
}
