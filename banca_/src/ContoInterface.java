public interface ContoInterface {
    void preleva(double importo);
    void versa(double importo);
    String getNome();
    String getIBAN();
    double getSaldo();

}
