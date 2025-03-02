package Practica1;

import java.util.Arrays;

public class Ejercicio18 {
    public static void main(String[] args){
        prueba( "",new String[]{} ,new String[]{});
        prueba( "r.j.",new String[]{"rojo", "verde", "morado", "caro", "rallo"} ,new String[]{"rojo"});
        prueba( "r.j.",new String[]{"reja", "rojo", "raro", "ruju"} ,new String[]{"reja", "rojo", "ruju"});
    }

    public static String[] encajan(String patron, String[] vector){
        String[] aux = new String[vector.length];
        int contadorAux=0;
        for(int i=0; i<vector.length;i++){
            if(encaja(patron, vector[i])){
                aux[contadorAux]=vector[i];
                contadorAux++;
            }
        }
        String[] vectorEncajan = new String[contadorAux];
        for (int i=0; i<contadorAux; i++){
            vectorEncajan[i]=aux[i];
        }
        return vectorEncajan;
    }

    public static boolean encaja(String patron, String cadena) {
        boolean siEncaja = true;
        if(patron.length() == cadena.length()){
            int cont = 0;
            while (cont<patron.length() && siEncaja){
                if (patron.charAt(cont) == '.'){
                    siEncaja = esVocal(cadena.charAt(cont));
                } else if (patron.charAt(cont) != cadena.charAt(cont)) {
                    siEncaja = false;
                }
                cont++;
            }
        }else{
            siEncaja = false;
        }
        return siEncaja;
    }
    public static boolean esVocal(char c) {
        return "AEIOUaeiou".indexOf(c) >= 0;
    }

    public static void prueba(String patron, String[] vector, String[] esperado){
        String[] resultado = encajan(patron, vector);
        System.out.format("Prueba con %s, %s --> %s", Arrays.toString(vector), patron, Arrays.toString(resultado));
        if (Arrays.equals(resultado, esperado)){
            System.out.println(": ok");
        }else{
            System.out.format(": ERROR, valor esperado : %s\n", Arrays.toString(esperado));
        }
    }
}
