public class ContoCorrente {

    private String nome;
    private String iban;
    private double saldo;

    public ContoCorrente(String nome, String iban, double saldo) {
        this.nome = nome;
        this.iban = iban;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
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

}
