//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Crear instancia del catálogo
        CatalogoRutas catalogo = new CatalogoRutas();

        // 1. Añadir rutas con diferentes niveles de dificultad
        System.out.println("Añadiendo rutas de prueba:");
        catalogo.añadirNuevaRuta("Ruta del Valle", 5.2, 3);
        catalogo.añadirNuevaRuta("Sendero Montaña", 12.8, 8);
        catalogo.añadirNuevaRuta("Camino Costero", 7.5, 2);

        // 2. Probar límites de dificultad
        catalogo.añadirNuevaRuta("Ruta Fácil", 3.0, 0);      // Dificultad mínima
        catalogo.añadirNuevaRuta("Ruta Extrema", 15.0, 10);  // Dificultad máxima
        //catalogo.añadirNuevaRuta("Ruta Inválida", 8.0, 11);  // No debería añadirse

        // 3. Probar ordenamiento alfabético
        catalogo.añadirNuevaRuta("Aventura Bosque", 6.0, 4);
        catalogo.añadirNuevaRuta("Zigzag Mountain", 9.0, 7);

        // 4. Probar ampliación del vector (más de 10 elementos)
        //catalogo.añadirNuevaRuta("Ruta 1", 1.0, 1);
       // catalogo.añadirNuevaRuta("Ruta 2", 2.0, 2);
        //catalogo.añadirNuevaRuta("Ruta 3", 3.0, 3);
       // catalogo.añadirNuevaRuta("Ruta 4", 4.0, 4);

        // Mostrar todas las rutas
        System.out.println("\nListado de todas las rutas:");
        System.out.println(catalogo.toString());

    }
}