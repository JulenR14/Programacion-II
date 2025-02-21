package Practica1;

public class Ejercicio11 {
    public static void main(String[] args) {
        prueba("r.j.", "verde", false);
        prueba("r.j.", "rojo", true);
        prueba("r.j.", "reja", true);
        prueba("r.j.", "reza", false);
        prueba("r.j.", "rrjj", false);
        prueba("r.j.", "puja", false);
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
    public static void prueba(String patron, String cadena, boolean esperado) {
        boolean resultado =encaja(patron, cadena);
        System.out.format("Prueba con %s y %s--> %s: ", patron, cadena, resultado);
        if (resultado == esperado)
            System.out.println("ok");
        else
            System.out.format("error (se esperaba%s)%n", esperado);
    }
}
