public class TriangoloEquilatero extends Triangolo {

    public TriangoloEquilatero(double lato, double altezza) {
        super(lato, altezza);
    }

    @Override
    public double getPerimetro() {
        return this.getLato() * 3;
    }
}
