public class Main {
    public static void main(String[] args) {
        int[] numeri = {5, 7, 1, 8, 4, 7, 3, 8, 10, 2};

        ArrayManager manager = new ArrayManager(numeri);
        System.out.println("Il numero massimo dell'Array è: " + manager.getMax());

        int[] numeriDecrescenti = new int[numeri.length];
        manager.stampaDecrescente(numeriDecrescenti);

        System.out.println("Fibonacci");
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.stampaSerie(10);
    }
}