public class Interessi {
    private double somma;
    private int interesse;

    public Interessi(double somma, int interesse) {
        this.somma = somma;
        this.interesse = interesse;
    }

    public double getInteresseAnnuo() {
        return somma = (somma * (double) interesse) / 100;
    }

    public static void Ciao() {
        System.out.println("Prova per vedere se funzionano i metodi statici");
    }

    @Override
    public String toString() {
        return "" + getInteresseAnnuo();
    }
}
