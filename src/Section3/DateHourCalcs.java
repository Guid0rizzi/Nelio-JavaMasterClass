package Section3;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateHourCalcs {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2025-04-25");// "parse" eu posso colocar um texto representando uma data
        LocalDateTime d05 = LocalDateTime.parse("2025-04-25T01:15:50");//"mesma coisa do exemplo acima mas com o tempo no formato ISO 8601"
        Instant d06 = Instant.parse("2025-07-25T02:20:50Z");
        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);//eu posso fazer a mesma coisa com mes e ano, nesse caso estou tirando dias
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);//eu posso fazer a mesma coisa com mes e ano, nesse caso estou adicionando dias
        //------------------------------------------------------------------------------------
        LocalDate pastWeekLocalDate = d04.minusDays(7);//eu posso fazer a mesma coisa com mes e ano, nesse caso estou tirando dias
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        LocalDate nextYearLocalDate = d04.plusYears(7);
        System.out.println("semana passada: "+ pastWeekLocalDate);
        System.out.println("semana que vem: "+ nextWeekLocalDate);
        System.out.println("sete anos pra frente: " + nextYearLocalDate);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
        System.out.println("semana passada: "+ pastWeekInstant);
        System.out.println("semana que vem: "+ nextWeekInstant);// msm resultado
        //----------------duração de tempo entre duas datas--------------
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay()); // como o d4 é LocalDate é preciso transformar em LocalDateTime com atStartOfDay()
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        System.out.println("t1 dias = "+ t1.toDays());
        System.out.println("t2 dias = "+ t2.toDays());
        System.out.println("t3 dias = "+ t3.toDays());
    }
}
