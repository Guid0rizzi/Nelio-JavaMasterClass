package Section3;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class GlobalToLocal {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2025-04-25");// "parse" eu posso colocar um texto representando uma data
        LocalDateTime d05 = LocalDateTime.parse("2025-04-25T01:15:50");//"mesma coisa do exemplo acima mas com o tempo no formato ISO 8601"
        Instant d06 = Instant.parse("2025-07-25T02:20:50Z");// horario de londres
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); // vou converter o meu instante para uma data local considerando o horario do meu sistema
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("r1 "+r1);
        System.out.println("r2 "+r2);
        System.out.println("r3 "+r3);
        System.out.println("r4 "+r4);
        //        for (String s:ZoneId.getAvailableZoneIds()){
//            System.out.println(s); // imprimindo todos os fusos pro região
//        }
        //---------Obter dados de uma data-hora local------------
        System.out.println("d04 dia ="+ d04.getDayOfMonth());
        System.out.println("d04 mes ="+ d04.getMonth());
        System.out.println("d04 o valor do mes ="+ d04.getMonthValue());
        System.out.println("d04 ano ="+ d04.getYear());
        System.out.println("d05 horario ="+ d05.getHour());
        System.out.println("d05 minuto ="+ d05.getMinute());


    }
}
