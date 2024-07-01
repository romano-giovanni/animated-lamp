public class Main {
    public static void main(String[] args) {
        Poligono rettangolo = new Rettangolo(12.5, 3.7);
        Poligono quadrato = new Quadrato(12.5 );
        Poligono triangolo = new Triangolo(12.5, 3.7);
        System.out.println("Perimetro " + rettangolo + " " + rettangolo.getPerimetro());
        System.out.println("Area " + rettangolo + " " + rettangolo.getArea());
        System.out.println("Perimetro " + quadrato + " " + quadrato.getPerimetro());
        System.out.println("Area " + quadrato + " " + quadrato.getArea());
        System.out.println("Perimetro " + triangolo + " " + triangolo.getPerimetro());
        System.out.println("Area " + triangolo + " " + triangolo.getArea());
    }
}