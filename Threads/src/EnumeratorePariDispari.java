public class EnumeratorePariDispari extends Thread {

    private int limiteSuperiore;
    private boolean pari;

    public EnumeratorePariDispari(int n, boolean pari) {
        limiteSuperiore = n;
        this.pari = pari;
    }

    public void run() {
        for (int i = 0; i < limiteSuperiore; i++) {
            if (pari) { // stampa il numero solo se e’ pari
                if (i % 2 == 0)
                    System.out.println("pari " + i);

            } else { // stampa il numero solo se e’ dispari
                if (i % 2 == 1)
                    System.out.println("dispari " + i);

            }
        }
    }

}