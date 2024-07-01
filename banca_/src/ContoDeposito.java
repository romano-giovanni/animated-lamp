public class ContoDeposito extends Conto {

    private double interesse;

    public ContoDeposito(String intestatario, String IBAN, double saldo, double interesse) {
        super(intestatario, IBAN, saldo);
        this.interesse = interesse;
    }

    public double getInteresse() {
        return interesse;
    }

    public void setInteresse(double interesse) {
        this.interesse = interesse;
    }

    public void aggiungiInteresse() {
        setSaldo(getSaldo() + (interesse * getSaldo() / 100));
    }

    @Override
    public String toString() {
        return "Conto Deposito";
    }

}
