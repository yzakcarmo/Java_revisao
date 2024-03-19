package modulo11;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ExemplosCalculosDataHora {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-06-11");
        LocalDateTime d05 = LocalDateTime.parse("2022-06-11T21:00");
        Instant d06 = Instant.parse("2022-06-11T21:00:00Z");

        LocalDate pastWeek = d04.minusWeeks(1);
        LocalDate nextWeek = d04.plusWeeks(1);

        LocalDateTime pastMonth = d05.minusMonths(1);
        LocalDateTime nextMonth = d05.plusMonths(1);

        Instant pastHour = d06.minus(1, ChronoUnit.HOURS);
        Instant nextHour = d06.plus(1, ChronoUnit.HOURS);


        System.out.println("Original = " + d04);
        System.out.println("Semana Antes = " + pastWeek);
        System.out.println("Semana Depois = " + nextWeek);
        System.out.println("Mês Antes = " + pastMonth);
        System.out.println("Mês Depois = " + nextMonth);
        System.out.println("Instant Hora Antes = " + pastHour);
        System.out.println("Instant Hora Depois = " + nextHour);

        Duration t1 = Duration.between(pastWeek.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastMonth, d05);
        Duration t3 = Duration.between(pastHour, d06);

        System.out.println("\n" + "t1 em dias = " + t1.toDays());
        System.out.println("t2 em dias = " + t2.toDays());
        System.out.println("t3 em minutos = " + t3.toMinutes());
    }
}
