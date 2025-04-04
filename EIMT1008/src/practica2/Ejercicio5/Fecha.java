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

    public int compareTo(Fecha otraFecha) {
        int valor = 0;

        if (this.year > otraFecha.year) {
            valor = 1;
        }else if(this.year < otraFecha.year){
            valor = -1;
        }else if(this.mes > otraFecha.mes){
            valor = 1;
        }else if (this.mes < otraFecha.mes){
            valor = -1;
        } else if (this.dia > otraFecha.dia) {
            valor = 1;
        } else if (this.dia < otraFecha.dia) {
            valor = -1;
        }
        return valor;
    }

    public int getDía() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return year;
    }

    public static boolean esAñoBisiesto(int año){
        boolean bisiesto = false;
        if((año%4 == 0 && año%100 != 0) || (año%400 == 0)){
            bisiesto = true;
        }
        return bisiesto;
    }

    public static int díasMes(int mes, int año){
        int dias = 0;
        switch (mes){
            case 1,3,5,7,8,10,12 -> dias = 31;
            case 2 -> {
                if(esAñoBisiesto(año)){
                    dias = 29;
                }else{
                    dias = 28;
                }
            }
            case 4,6,9,11 -> dias = 30;
        }
        return dias;
    }
}
