public abstract class Conto implements ContoInterface {

    private static final long serialVersionUID = 1L;

    private String intestatario;
    private final String IBAN;
    private double saldo;

    public Conto(String intestatario, String IBAN, double saldo) {
        this.intestatario = intestatario;
        this.IBAN = IBAN;
        this.saldo = saldo;
    }

    public String getNome() {
        return intestatario;
    }

    public String getIBAN() {
        return IBAN;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void preleva(double importo) {
        if (importo > this.saldo) {
            System.out.println("Impossibile prelevare una cifra maggiore di quella posseduta");
            return;
        }
        this.saldo -= importo;
    }

    public void versa(double importo) {
        this.saldo += importo;
    }

    @Override
    public String toString() {
        return "Conto";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Conto && ((Conto) obj).IBAN.equals(IBAN);
    }

}
