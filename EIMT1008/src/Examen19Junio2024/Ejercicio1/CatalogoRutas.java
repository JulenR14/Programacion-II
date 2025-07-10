package Examen19Junio2024.Ejercicio1;

public class CatalogoRutas {
    private Ruta[] vector; // Vector de las rutas del cat´alogo
    // ordenadas de menor a mayor por nombre de ruta
    private static final int TAMAÑO_INICIAL = 10; // Capacidad inicial del vector de rutas
    private int cantidad; // Cantidad real de rutas en el cat´alogo

    public CatalogoRutas() {
        this.vector = new Ruta[TAMAÑO_INICIAL];
        this.cantidad = 0; // Inicialmente el cat´alogo de rutas est´a vac´ıo
    }

    public void añadirNuevaRuta(String nombreRuta, double distancia, int dificultad){
        if (cantidad == vector.length) {
            Ruta[] nuevo = new Ruta[vector.length * 2];
            for (int i = 0; i < cantidad; i++) {
                nuevo[i] = vector[i];
            }
            vector = nuevo;
        }

        // Paso 2: Buscar posición correcta (orden lexicográfico por nombre)
        int i = cantidad - 1;
        while (i >= 0 && vector[i].getNombre().compareTo(nombreRuta) > 0) {
            vector[i + 1] = vector[i]; // desplazamiento
            i--;
        }

        // Paso 3: Insertar la nueva ruta en su sitio
        vector[i + 1] = new Ruta(nombreRuta, distancia, dificultad);

        // Paso 4: Aumentar la cantidad
        cantidad++;
    }

    public void imprimirCatalogo(String tituloDelTest) {
        System.out.println("\n=== " + tituloDelTest + " ===");
        if (cantidad == 0) {
            System.out.println("El catálogo está vacío.");
        } else {
            for (int i = 0; i < cantidad; i++) {
                System.out.println((i + 1) + ". " + vector[i].toString());
            }
        }
        System.out.println("Total de rutas: " + cantidad + " | Capacidad actual del vector: " + vector.length);
        System.out.println("===============================");
    }

    public String toString(){
        String cadena = "[ \n";
        for(int i = 0 ; i < cantidad; i++){
            cadena += vector[i].toString() + "\n";
        }
        return cadena + "]";
    }
}
