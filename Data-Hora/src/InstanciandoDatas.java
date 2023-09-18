import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class InstanciandoDatas {
    public static void main(String[] args) {

        // Instanciando datas

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2023-08-15");
        LocalDateTime d05 = LocalDateTime.parse("2023-08-15T01:30:26");
        Instant d06 = Instant.parse("2023-08-15T01:30:26Z");
        Instant d07 = Instant.parse("2023-08-15T01:30:26-03:00");

        LocalDate d08 = LocalDate.parse("15/08/2023", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("15/08/2023 12:38", fmt2);

        LocalDate d10 = LocalDate.of(2023, 8, 15);
        LocalDateTime d11 = LocalDateTime.of(2023, 8, 15, 12, 42);


        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);


    }
}