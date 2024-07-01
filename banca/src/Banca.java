import java.util.HashMap;

public class Banca {
    private HashMap<String, ContoCorrente> contiCorrente = new HashMap<>();

    public boolean contoCheck(String iban) {
        return contiCorrente.containsKey(iban);
    }

    public boolean aggiungiConto(String nome, String iban, double saldo) {
        if (!contoCheck(iban)) {
            contiCorrente.put(iban, (new ContoCorrente(nome, iban, saldo)));
            return true;
        }
        return false;
    }

    public boolean versa(String iban, double saldo) {
        if (contoCheck(iban)) {
            contiCorrente.get(iban).versa(saldo);
            return true;
        }
        return false;
    }

    public boolean preleva(String iban, double saldo) {
        if (contoCheck(iban)) {
            contiCorrente.get(iban).preleva(saldo);
            return true;
        }
        return false;
    }

    public boolean visualizza(String iban) {
        if (contoCheck(iban)) {
            System.out.println(contiCorrente.get(iban).getSaldo());
            return true;
        }
        return false;
    }

    public boolean elimina(String iban) {
        if (contoCheck(iban)) {
            contiCorrente.remove(iban);
            return true;
        }
        return false;
    }
}
