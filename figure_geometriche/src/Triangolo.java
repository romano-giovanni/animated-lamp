public class Triangolo {
    private double lato;
    private double altezza;

    public Triangolo(double lato, double altezza) {
        this.lato = lato;
        this.altezza = altezza;
    }

    public double getArea() {
        return (lato * altezza) / 2;
    }

    public double getPerimetro() {
        return 3 * lato;
    }

    @Override
    public String toString() {
        return "Triangolo\nPerimetro: " + getPerimetro() + "\nArea: " + getArea();
    }


}
