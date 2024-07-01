public class Fibonacci {

    private int primo = 0;
    private int secondo = 1;

    public void stampaSerie(int i) {
        for (int j = 0; j < i; j++) {
            System.out.println(primo);
            System.out.println(secondo);
            primo = primo + secondo;
            secondo = secondo + primo;
        }
    }

    // TODO rifare con array
}
