public abstract class Animale {
    private String nomeSpecie;
    private String alimentazione;
    private String verso;

    public Animale(String nomeSpecie, String alimentazione, String verso) {
        this.verso = verso;
        this.nomeSpecie = nomeSpecie;
        this.alimentazione = alimentazione;
    }

    public String getNomeSpecie() {
        return nomeSpecie;
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    public String getVerso() {
        return verso;
    }

    public abstract String cosaMangia();
    public abstract String qualeVerso();

}
