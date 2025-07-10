package Examen19Junio2024.Ejercicio1;

public class MainExamen {
    public static void main(String[] args){
        CatalogoRutas catalogo = new CatalogoRutas();

        // 1. Catálogo Vacío e Inserción Inicial
        catalogo.imprimirCatalogo("1. Inicio - Catálogo Vacío");
        System.out.println("\nAñadiendo primera ruta: 'Ruta del Sol'");
        catalogo.añadirNuevaRuta("Ruta del Sol", 120.5, 5);
        catalogo.imprimirCatalogo("1. Después de añadir 'Ruta del Sol'");

        // 2. Pruebas de Ordenación
        System.out.println("\nAñadiendo 'Camino Antiguo' (debería ir al principio)");
        catalogo.añadirNuevaRuta("Camino Antiguo", 80.0, 3);
        catalogo.imprimirCatalogo("2a. Después de añadir 'Camino Antiguo'");

        System.out.println("\nAñadiendo 'Via Lactea' (debería ir al final)");
        catalogo.añadirNuevaRuta("Via Lactea", 250.2, 8);
        // Esto debería llenar el catálogo si TAMAÑO_INICIAL = 3
        catalogo.imprimirCatalogo("2b. Después de añadir 'Via Lactea'");

        // 3. Llenado y Redimensionamiento (TAMAÑO_INICIAL = 3)
        // El catálogo ya tiene 3 rutas: Camino Antiguo, Ruta del Sol, Via Lactea
        System.out.println("\nAñadiendo 'Ruta Central' (debería ir en medio y disparar redimensionamiento)");
        catalogo.añadirNuevaRuta("Ruta Central", 50.0, 4);
        catalogo.imprimirCatalogo("3a. Después de añadir 'Ruta Central' (y redimensionar)");
        // Ahora la capacidad debería ser 6

        System.out.println("\nAñadiendo más rutas para probar post-redimensionamiento");
        catalogo.añadirNuevaRuta("Sendero Boscoso", 30.0, 2);
        catalogo.añadirNuevaRuta("Aventura Alpina", 150.0, 9);
        catalogo.imprimirCatalogo("3b. Después de añadir 'Sendero Boscoso' y 'Aventura Alpina'");
        // El catálogo ahora tiene 6 rutas, llenando la nueva capacidad.

        System.out.println("\nAñadiendo 'Xenon Trail' para un segundo redimensionamiento");
        catalogo.añadirNuevaRuta("Xenon Trail", 10.0, 1);
        catalogo.imprimirCatalogo("3c. Después de añadir 'Xenon Trail' (y segundo redimensionamiento)");
        // Capacidad debería ser 12


        // 4. Pruebas de Datos Inválidos
        System.out.println("\nIntentando añadir rutas con datos inválidos:");
        catalogo.añadirNuevaRuta("Ruta Fallida Dificultad Alta", 10.0, 11);
        catalogo.añadirNuevaRuta("Ruta Fallida Dificultad Baja", 10.0, -1);
        catalogo.añadirNuevaRuta("Ruta Fallida Distancia Cero", 0.0, 5);
        catalogo.añadirNuevaRuta("Ruta Fallida Distancia Negativa", -10.0, 5);
        catalogo.imprimirCatalogo("4. Después de intentar añadir rutas inválidas");

        // 5. Pruebas con Nombres Duplicados (el comportamiento es insertarlos manteniendo el orden)
        System.out.println("\nAñadiendo ruta con nombre potencialmente duplicado:");
        catalogo.añadirNuevaRuta("Ruta del Sol", 100.0, 6); // Mismo nombre, diferentes datos
        catalogo.imprimirCatalogo("5. Después de añadir otra 'Ruta del Sol'");

        // 6. Añadir en orden inverso (en un nuevo catálogo para claridad)
        CatalogoRutas catalogoInverso = new CatalogoRutas();
        System.out.println("\n--- Pruebas con Orden Inverso (Nuevo Catálogo) ---");
        catalogoInverso.añadirNuevaRuta("Zafiro", 10.0, 1);
        catalogoInverso.añadirNuevaRuta("Xilofon", 20.0, 2);
        catalogoInverso.añadirNuevaRuta("Wagner", 30.0, 3); // Dispara redimensionamiento
        catalogoInverso.añadirNuevaRuta("Ursula", 40.0, 4);
        catalogoInverso.imprimirCatalogo("6. Catálogo con rutas añadidas en orden inverso");

        // 7. Añadir en orden aleatorio (en un nuevo catálogo)
        CatalogoRutas catalogoAleatorio = new CatalogoRutas();
        System.out.println("\n--- Pruebas con Orden Aleatorio (Nuevo Catálogo) ---");
        catalogoAleatorio.añadirNuevaRuta("Kilo", 15.0, 5);
        catalogoAleatorio.añadirNuevaRuta("Alfa", 25.0, 6);
        catalogoAleatorio.añadirNuevaRuta("Papa", 5.0, 2);   // Dispara redimensionamiento
        catalogoAleatorio.añadirNuevaRuta("Bravo", 35.0, 7);
        catalogoAleatorio.añadirNuevaRuta("Golf", 55.0, 8);
        catalogoAleatorio.imprimirCatalogo("7. Catálogo con rutas añadidas en orden aleatorio");

        System.out.println("\n--- FIN DE LAS PRUEBAS ---");
    }
}
