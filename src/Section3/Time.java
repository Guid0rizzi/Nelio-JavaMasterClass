package Section3;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {

        LocalDate d01= LocalDate.now(); // atual data do meu sistema
        LocalDateTime d02 = LocalDateTime.now(); // atual data e hora do meu sistema
        Instant d03 = Instant.now(); //atual data, hora e frações do meu sistema no padrão do horario de londres
        LocalDate d04 = LocalDate.parse("2025-04-25");// "parse" eu posso colocar um texto representando uma data
        LocalDateTime d05 = LocalDateTime.parse("2025-04-25T01:15:50");//"mesma coisa do exemplo acima mas com o tempo no formato ISO 8601"
        Instant d06 = Instant.parse("2025-07-25T02:20:50Z"); //Vou salvar no fuso de Londres
        Instant d07 = Instant.parse("2025-07-25T02:20:50-03:00");// por mais que eu esteja diminuindo o horario(SP, Br) no banco vai ser salvo com o fuso
        // de Londres então vai ser 3 horas adiantado
        LocalDate d10 = LocalDate.of(2022, 7, 30);// metodo pega separadamente
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 30,1,30 );

        //--------------------------------------------//
        //FORMATANDO DATAS
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDate d08 = LocalDate.parse("20/07/2005", fmt1);
        LocalDate d09 = LocalDate.parse("20/08/2005 01:30", fmt2);
        System.out.println("d1 = "+ d01.toString()); // aqui como exemplo eu estou usando o toString, mas na classe LocalDate/LocalDateTime ja tem um metodo
        //imbutido internamente que tranforma a data em String na hora que vai printar
        System.out.println("d2 = "+ d02);
        System.out.println("d3 = "+ d03);
        System.out.println("d4 = "+ d04);
        System.out.println("d5 = "+ d05);
        System.out.println("d6 = "+ d06);
        System.out.println("d7 = "+ d07);
        System.out.println("d8 = "+ d08);
        System.out.println("d9 = "+ d09);
        System.out.println("d10 = "+ d10);
        System.out.println("d11 = "+ d11);
    }
}
