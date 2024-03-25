import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ExemplosDataHoraFormatando {  
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        //ZoneId.systemDefault() é para o formatador usar diretamente o fuso da maquina
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        LocalDate d04 = LocalDate.parse("2022-06-11");
        LocalDateTime d05 = LocalDateTime.parse("2022-06-11T21:00");
        Instant d06 = Instant.parse("2022-06-11T21:00:00Z");
        System.out.println("Data em ISO 8601 convertida para dd/MM/yyyy = " + fmt1.format(d04));
        System.out.println("Data-hora em ISO 8601 convertida para dd/MM/yyyy HH:mm = " + fmt2.format(d05));
        System.out.println("Data-hora em ISO 8601 GMT convertida para dd/MM/yyyy HH:mm no fuso da maquina = " + fmt3.format(d06));

        //Instant(DataHora Global) para LocalDateTime
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Australia/Melbourne"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Australia/Melbourne"));

        System.out.println("\n" + "LocalDate em Instant: " + r1);
        System.out.println("LocalDate em Instant(Australia): " + r2);
        System.out.println("LocalDateTime em Instant: " + r3);
        System.out.println("LocalDateTime em Instant(Australia): " + r4);

        System.out.println("\n" + "d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mes = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());

        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minutos = " + d05.getMinute());
    }
}
