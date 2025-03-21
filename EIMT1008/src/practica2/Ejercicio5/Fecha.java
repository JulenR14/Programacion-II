package practica2.Ejercicio5;

public class Fecha {
    private int dia,mes,year;

    public Fecha(int dia, int mes, int year) {
        this.dia = dia;
        this.mes = mes;
        this.year = year;
    }

    public Fecha(Fecha fecha){
        this.dia = fecha.dia;
        this.mes = fecha.mes;
        this.year = fecha.year;
    }

    public String toString(){
        return dia + "/" + mes + "/" + year;
    }

    public boolean equals(Object fecha){
        boolean resultado = false;
        if(fecha instanceof Fecha){
            if(this.dia == ((Fecha) fecha).dia && this.mes == ((Fecha) fecha).mes && this.year == ((Fecha) fecha).year){
                resultado = true;
            }
        }
        return resultado;
    }

    public int compareTo(Fecha fecha) {
        return 0;
    }
}
