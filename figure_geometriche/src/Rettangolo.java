public class Rettangolo {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getArea() {
        return (base * altezza) / 2;
    }

    public double getPerimetro() {
        return 2 * (base + altezza);
    }

    @Override
    public String toString() {
        return "Rettangolo\nPerimetro: " + getPerimetro() + "\nArea: " + getArea();
    }
}
