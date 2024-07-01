import java.io.Serializable;

public class ContoFiduciario extends Conto implements Serializable {

    private double fido;

    public ContoFiduciario(String intestatario, String IBAN, double saldo, double fido) {
        super(intestatario, IBAN, saldo);
        this.fido = fido;
    }

    public double getFido() {
        return fido;
    }

    public void preleva(double importo) {
        if (importo > this.getSaldo() + fido) {
            System.out.println("Impossibile prelevare una cifra maggiore di quella del fido");
            return;
        }
        this.setSaldo(getSaldo() - importo);
    }

    @Override
    public String toString() {
        return "Conto Fiduciario";
    }
}

