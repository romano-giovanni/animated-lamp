public class Quadrato extends Rettangolo{

    private int lato;

    public Quadrato(double lato) {
        super(lato, lato);
    }

    @Override
    public String toString() {
        return "Quadrato";
    }

}
