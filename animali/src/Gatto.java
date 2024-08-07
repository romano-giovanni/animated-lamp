public class Gatto extends Animale {

    private String nome;

    public Gatto(String nomeSpecie, String alimentazione, String verso, String nome) {
        super(nomeSpecie, alimentazione, verso);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String cosaMangia() {
        return getAlimentazione();
    }
    public String qualeVerso() {
        return getVerso();
    }

    @Override
    public String toString() {
        return getNomeSpecie();
    }
}
