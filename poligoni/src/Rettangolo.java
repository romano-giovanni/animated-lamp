public class Rettangolo implements Poligono {

    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getArea() {
        return base * altezza;
    }

    public double getPerimetro() {
        return (base + altezza) * 2;
    }

    @Override
    public String toString() {
        return "Rettangolo";
    }
}
