import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExemplosDataHora {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-06-11");
        LocalDateTime d05 = LocalDateTime.parse("2022-06-11T21:00");
        Instant d06 = Instant.parse("2022-06-11T21:00:00Z");
        Instant d07 = Instant.parse("2022-06-11T21:00:00-03:00");

        LocalDate d08 = LocalDate.parse("11/06/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("11/06/2022 21:00", fmt2);

        LocalDate d10 = LocalDate.of(2022, 06, 11);
        LocalDateTime d11 = LocalDateTime.of(2022, 06, 11, 21, 00);

        System.out.println("Hoje: " + d01);
        System.out.println("Agora: " + d02);
        System.out.println("Agora em GMT: " + d03 + "\n");

        System.out.println("Data convertida em ISO 8601: " + d04);
        System.out.println("Data-hora convertida em ISO 8601: " + d05);
        System.out.println("Data-hora convertida em ISO 8601 com Timezone: " + d06);
        System.out.println("Data-hora com Timezone Brasilia convertida em ISO 8601 do GMT: " + d07 + "\n");

        System.out.println("Data em formato dd/MM/yyyy convertida em ISO 8601: " + d08);
        System.out.println("Data-hora em formato dd/MM/yyyy HH:mm convertida em ISO 8601: " + d09 + "\n");

        System.out.println("Data com dados de varias entradas convertida em ISO 8601: " + d10);
        System.out.println("Data-hora com dados de varias entradas convertida em ISO 8601: " + d11);
    }
    
}
