import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        // TODO aggiungere ENUM
        // TODO aggiungere classe con eccezioni personalizzate
        // TODO aggiungere controllo che non si possono inserire numeri negativi (Tramite eccezione personalizzata)
        // TODO usare eccezione personalizzata per gestire prelievo superiore a saldo

        ContoManager contoManager = new ContoManager();

        // Importa HashMap dei conti
        contoManager.importaMap("listaConti.txt");

        // Operazioni su conto
        Optional<ContoInterface> opt = contoManager.getConto("IT123");
        if (opt.isPresent()) {
            if (opt.get() instanceof ContoDeposito cd) {
                cd = (ContoDeposito) opt.get();
                System.out.println("Saldo attuale: ");
                System.out.println(cd.getSaldo());
                System.out.println("Aggiungo interesse: ");
                cd.aggiungiInteresse();
                System.out.println(cd.getSaldo());
                System.out.println("Verso 500: ");
                cd.versa(500);
                System.out.println(cd.getSaldo());
                cd.preleva(50);
                System.out.println("Prelevo 50: ");
                System.out.println(cd.getSaldo());
                // Provo a prelevare più di quanto c'è sul saldo
                System.out.println("Prelevo 700: ");
                cd.preleva(700);
                System.out.println("Saldo attuale: ");
                System.out.println(cd.getSaldo());

                // Reimposto il saldo
                cd.setSaldo(200);
            }
            else {
                ContoFiduciario cd = (ContoFiduciario) opt.get();
                System.out.println(cd.getSaldo());
            }

        } else {
            System.out.println("Impossibile accedere al conto");
        }

        // Esporta HashMap dei conti
        contoManager.esportaMap("listaConti.txt");

        // Creazione e aggiunta conti deposito
//        ContoDeposito cd1 = contoManager.addContoDeposito("Giovanni Romano", "IT123", 200, 3);
//        ContoDeposito cd2 = contoManager.addContoDeposito("Luca Rossi", "IT124", 500, 2);
//        ContoDeposito cd3 = contoManager.addContoDeposito("Marco Verdi", "IT125", 100, 1.5);
//        ContoDeposito cd4 = contoManager.addContoDeposito("Matteo Neri", "IT126", 300, 1);
//
//        // Operazioni su conto
//        Optional<ContoInterface> opt = contoManager.getConto("IT123");
//        if (opt.isPresent()) {
//            if (opt.get() instanceof ContoDeposito cd) {
//                cd = (ContoDeposito) opt.get();
//                System.out.println(cd.getSaldo());
//                cd.aggiungiInteresse();
//                cd.versa(500);
//                cd.preleva(50);
//                // Provo a prelevare più di quanto c'è sul saldo
//                cd.preleva(700);
//                System.out.println(cd.getSaldo());
//            }
//            else {
//                ContoFiduciario cd = (ContoFiduciario) opt.get();
//                System.out.println(cd.getSaldo());
//            }
//
//        } else {
//            System.out.println("Impossibile accedere al conto");
//        }
//
//
//        // Creazione e aggiunta conti fiduciari
//        ContoFiduciario cf1 = contoManager.addContoFiduciario("Mario Rossi", "IT127", 5000, 300);
//        ContoFiduciario cf2 = contoManager.addContoFiduciario("Luca Verdi", "IT128", 6000, 500);
//        // Provo ad aggiungere un conto con un IBAN esistente
//        try {
//            ContoFiduciario cf3 = contoManager.addContoFiduciario("Marco Gialli", "IT128", 7000, 600);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//
//        // Operazioni su conto
//        Optional<ContoInterface> opt1 = contoManager.getConto("IT127");
//        if (opt1.isPresent()) {
//            if (opt1.get() instanceof ContoFiduciario cf) {
//                cf = (ContoFiduciario) opt1.get();
//                System.out.println(cf.getSaldo());
//                cf.versa(100);
//                // Provo a prelevare più di quanto c'è sul saldo
//                cf.preleva(6000);
//                cf.preleva(500);
//                System.out.println(cf.getSaldo());
//            }
//        }
//
//
//        // Effettuo operazioni sui conti
//        Optional<ContoInterface> opt = contoManager.getConto("IT123");
//        if (opt.isPresent()) {
//            if (opt.get() instanceof ContoDeposito cf) {
//                System.out.println(cf.getSaldo());
//                cf.versa(500);
//                System.out.println(cf.getSaldo());
//            }
//        } else {
//            System.out.println("Nessun conto trovato con quell'IBAN");
//        }

    }
}