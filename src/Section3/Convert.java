package Section3;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Convert {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2025-04-25");// "parse" eu posso colocar um texto representando uma data
        LocalDateTime d05 = LocalDateTime.parse("2025-04-25T01:15:50");//"mesma coisa do exemplo acima mas com o tempo no formato ISO 8601"
        Instant d06 = Instant.parse("2025-07-25T02:20:50Z");
        //------------------------------------------------------//
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        //--------TRANSFORMANDO DATA EM STRING-----------
        System.out.println("d4 = " +d04.format(fmt1));
        System.out.println("d4 = " +fmt1.format(d04));
        System.out.println("d4 = " +d04.format( DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        //-----------------------------------------------//
        System.out.println("d05 = "+ d05.format(fmt1));
        System.out.println("d05 = "+ d05.format(fmt2));
        //---------------------------------------------// convertendo Instantes em string
        System.out.println("d06" + fmt3.format(d06));// vai voltar uma string com o horario do meu sistema

    }
}
