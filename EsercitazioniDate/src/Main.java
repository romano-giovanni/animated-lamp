import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate adesso = LocalDate.now();
        int y = 1998;
        int m = 5;
        int d = 26;
        LocalDate compleanno = LocalDate.of(y, m, d);
        System.out.println(adesso);
        System.out.println(compleanno);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(compleanno.format(formatter));

        if (compleanno.isBefore(adesso)) {
            System.out.println("Ciao bello");
        }

    }
}