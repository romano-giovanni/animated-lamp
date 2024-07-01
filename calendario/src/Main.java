public class Main {
    public static void main(String[] args) {
        CalendarioManager calendario24 = new CalendarioManager(1, 2024);
        calendario24.getGiorno(6, 14);
        // calendario24.stampaCalendario();
        CalendarioManager calendario23 = new CalendarioManager(7, 2024);
        calendario23.getGiorno(6, 14);
    }
}