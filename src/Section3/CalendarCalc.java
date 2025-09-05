package Section3;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarCalc {
    public static void main(String[] args) {
        /**
         * somar e subtrair uma quantidade de tempo em uma data
         * exemp:
         * Eu tenho uma data e quero acrescentar 4 dias ou horas ou minutos em uma data
         */

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf.format(d));
        Calendar cal = Calendar.getInstance();// instancie o calendario
        cal.setTime(d); // coloque a sua data = d dentro do calendario, assim ele se torna manupulavel
        //Calculos:
        //cal.add(Calendar.HOUR_OF_DAY, 4);
        /// ////////////////////////////////////////
        //Pegar os valores: horas, minutos, segundos, de forma separada
        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH);
        System.out.println("minutos "+minutes);
        System.out.println("meses "+month);
        //
        d = cal.getTime(); // metodo getTime puxa a sua data com o valor atualizado
        System.out.println(sdf.format(d)); // mostra a data atualizada
    }
}
