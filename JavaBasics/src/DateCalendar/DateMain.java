package DateCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain {

    public static void main(String[] args) {
        Date fecha = new Date();
        SimpleDateFormat fm = new SimpleDateFormat("dd MMMM yyyy");

        //21 January 2023 con MMM jun m - refers to minutes
        System.out.println("fecha = " + fm.format(fecha));

        //21 01 2023
        SimpleDateFormat fm1 = new SimpleDateFormat("dd MM yyyy");
        System.out.println("fecha = " + fm1.format(fecha));

        SimpleDateFormat fm2 = new SimpleDateFormat("dd/MM//yyyy");
        System.out.println("fecha = " + fm2.format(fecha));
    }
}
