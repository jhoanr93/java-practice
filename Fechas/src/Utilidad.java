import java.time.LocalDate;

public class Utilidad {

    public static int getDia() {
        return dia;
    }

    public static int getMes() {
        return mes;
    }

    public static int getAño() {
        return año;
    }
    
    private static int dia;
    private static int mes;
    private static int año;

    public static LocalDate mostarFecha(int año, int mes, int dia){
        return LocalDate.of(año, mes, dia);
    }
    
    public static boolean esBisiesto(int año, int mes, int dia){
        return LocalDate.of(año, mes, dia).isLeapYear();
    }
    
    public static LocalDate sumarDias(int año, int mes, int dia){
        return LocalDate.of(año, mes, dia).plusDays(20);
    }
    
    public static int obtenerDia (int año, int mes, int dia){
        return LocalDate.of(año, mes, dia).getDayOfMonth();
    }

}
