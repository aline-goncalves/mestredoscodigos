import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class TesteDatas {
    public static void main(String[] args) {
        System.out.println("HELLO WORLD !!!!");
        testeLocalDate();
        testeLocalTime();
        testeLocalDateTime();
    }

    public static void testeLocalDate() {
        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data: " + dataAtual);
    }

    public static void testeLocalTime() {
        LocalTime horaAtual = LocalTime.now();
        System.out.println("Hora: " + horaAtual);
    }

    public static void testeLocalDateTime() {
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println("Data e Hora: " + dataHoraAtual);
    }
}