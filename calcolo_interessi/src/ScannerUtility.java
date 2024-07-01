import java.util.InputMismatchException;
import java.util.Scanner;

// Questa classe non dovrebbe essere statica?
public class ScannerUtility {
    public static double scannerDouble(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Input non valido, riprova");
                scanner.next();
            }
        }
    }

    public static int scannerInt(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input non valido, riprova");
                scanner.next();
            }
        }
    }

}
