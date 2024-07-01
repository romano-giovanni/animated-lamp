public class Triangolo implements Poligono {

    private double lato;
    private double altezza;

    public Triangolo(double lato, double altezza) {
        this.lato = lato;
        this.altezza = altezza;
    }

    public double getLato() {
        return lato;
    }

    public double getArea()
    {
        return (lato * altezza) / 2;
    }

    public double getPerimetro() {
        return lato * 3;
    }

    @Override
    public String toString() {
        return "Triangolo";
    }
}
