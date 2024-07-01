import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Rettangolo e triangolo");
        Rettangolo rettangolo = new Rettangolo(2.5, 5.3);
        Triangolo triangolo = new Triangolo(2.5, 5.3);
        System.out.println(rettangolo);
        System.out.println(triangolo);

        System.out.println("Interessi");
        double sommaIniziale = 1000;
        for (int i = 0; i < 3; i++) {
            double sommaTotale = sommaIniziale + new Interessi(sommaIniziale, 3).getInteresseAnnuo();
            System.out.println("La somma dopo anni " + i + " è di " + sommaTotale);
            sommaIniziale = sommaTotale;
        }

        int stagione = 0;
        System.out.println("Inserisci la stagione");
        Scanner scanner = new Scanner(System.in);
        try {
            stagione = scanner.nextInt();
            switch (stagione) {
                case 1:
                case 2:
                    System.out.println("Inverno");
                    break;
                case 3:
                    System.out.println("Inverno o primavera");
                    break;
                case 4:
                case 5:
                    System.out.println("Primavera");
                case 6:
                    System.out.println("Primavera o estate");
                    break;
                case 7:
                case 8:
                    System.out.println("Estate");
                    break;
                case 9:
                    System.out.println("Estate o autunno");
                    break;
                case 10:
                case 11:
                    System.out.println("Autunno");
                    break;
                case 12:
                    System.out.println("Autunno o inverno");
                    break;
                default:
                    System.out.println("Stagione non valida");
                    break;
            }

        } catch (InputMismatchException e) {
            System.out.println("Input non valido");
        }

    }
}
