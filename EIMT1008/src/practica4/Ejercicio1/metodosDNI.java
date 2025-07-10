package practica4.Ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class metodosDNI {
    public static String[] crearVectorDni(String nombreFichero) throws FileNotFoundException {
        File fichero = new File(nombreFichero);
        Scanner sc = new Scanner(fichero);
        int cantidad = sc.nextInt();
        sc.nextLine();
        String[] dnis = new String[cantidad];
        for(int i = 0;  i < cantidad; i++){
            dnis[i] = sc.nextLine();
        }
        return dnis;
    }

    private static boolean buscarDNI(String dni, String[] dnis){
        boolean encontrado = false;
        for(int i = 0; i < dnis.length && !encontrado; i++){
            if(dni.equals(dnis[i])){
                encontrado = true;
            }
        }
        return encontrado;
    }

    public static int contarCoincidencias(String[] vectorDni1, String[] vectorDni2){
        int cantidad = 0;
        for(int i = 0; i < vectorDni1.length; i++){
            if(buscarDNI(vectorDni1[i], vectorDni2)){
                cantidad++;
            }
        }
        return cantidad;
    }
}
