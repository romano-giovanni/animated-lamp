import java.util.Scanner;

public class Menu {

    private Banca banca;

    public Menu() {
        this.banca = new Banca();
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("[1] Aggiungi conto");
            System.out.println("[2] Versa denaro");
            System.out.println("[3] Preleva denaro");
            System.out.println("[4] Visualizza denaro");
            System.out.println("[5] Elimina conto");
            int scelta = scanner.nextInt();
            switch (scelta) {
                case 1:
                    aggiungi();
                    break;
                case 2:
                    versa();
                    break;
                case 3:
                    preleva();
                    break;
                case 4:
                    visualizza();
                    break;
                case 5:
                    elimina();
                    break;
                case 0:
                    System.out.println("Sei uscito dal programma");
                    return;
                default:
                    System.out.println("Error");
            }
        }
    }

    private void aggiungi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci nome");
        String nome = scanner.next();
        System.out.println("Inserisci IBAN");
        String iban = scanner.next();
        System.out.println("Inserisci saldo");
        double saldo = scanner.nextDouble();
        if (banca.aggiungiConto(nome, iban, saldo)) {
            System.out.println("Conto aggiunto correttamente");
        } else {
            System.out.println("Errore");
        }
    }

    public void versa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci IBAN");
        String iban = scanner.next();
        System.out.println("Quanto vuoi versare?");
        double importo = scanner.nextDouble();
        if (!banca.versa(iban, importo)) {
            System.out.println("Errore");
            return;
        }
        System.out.println("Importo versato correttamente");
    }

    public void preleva() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci IBAN");
        String iban = scanner.next();
        System.out.println("Quanto vuoi prelevare?");
        double importo = scanner.nextDouble();
        if (!banca.preleva(iban, importo)) {
            System.out.println("Errore");
            return;
        }
        System.out.println("Importo prelevato correttamente");
    }

    public void visualizza() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci IBAN");
        String iban = scanner.next();
        if (!banca.visualizza(iban)) {
            System.out.println("Errore");
        }
    }

    public void elimina() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci IBAN");
        String iban = scanner.next();
        if (!banca.elimina(iban)) {
            System.out.println("Errore");
        } else {
            System.out.println("Conto eliminato correttamente");
        }
    }


}
