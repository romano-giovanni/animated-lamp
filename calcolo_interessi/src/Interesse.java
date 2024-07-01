public class Interesse {
    private double somma;

    public Interesse(double somma) {
        this.somma = somma;
    }

    public double getInteresse(int interesse) {
        this.somma += (somma * interesse) / 100;
        return this.somma;
    }

    public double prelievo(double importo) {
        this.somma -= importo;
        return this.somma;
    }

    public double versamento (double importo) {
        this.somma += importo;
        return this.somma;
    }

    public double getSomma() {
        return somma;
    }

    // TODO toString and equals override
}
