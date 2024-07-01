public class Main {
    public static void main(String[] args) {
        int n = 3;
        Thread tp = new EnumeratorePariDispari(n, true);
        Thread td = new EnumeratorePariDispari(n, false);

        System.out.println("Attivazione thread pari e dispari fino a " + n);
        tp.start();
        td.start();
        System.out.println("Attesa terminazione thread pari e dispari");
        try {
            tp.join();
            td.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread pari e dispari terminati");
    }
}