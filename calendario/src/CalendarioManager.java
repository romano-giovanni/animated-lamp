import java.util.ArrayList;

public class CalendarioManager {
    private final int NUMERO_MESI = 12;
    private ArrayList<String> mesi = new ArrayList<String>();
    private ArrayList<Integer> giorniPerMese = new ArrayList<>();
    private ArrayList<String> giorniSettimana = new ArrayList<>();
    private ArrayList<ArrayList<String>> calendario = new ArrayList<ArrayList<String>>();

    public CalendarioManager(int count, int year) {
        popolaMesi();
        popolaGiorniPerMese(isBisestile(year));
        popolaGiorniSettimana();
        inizializzaCalendario();
        riempiCalendario(count);
    }

    public ArrayList<ArrayList<String>> getCalendario() {
        return calendario;
    }

    private void popolaMesi() {
        mesi.add("Gennaio");
        mesi.add("Febbraio");
        mesi.add("Marzo");
        mesi.add("Aprile");
        mesi.add("Maggio");
        mesi.add("Giugno");
        mesi.add("Luglio");
        mesi.add("Agosto");
        mesi.add("Settembre");
        mesi.add("Ottobre");
        mesi.add("Novembre");
        mesi.add("Dicembre");
    }

    private void popolaGiorniPerMese(boolean bisestile) {
        giorniPerMese.add(31);
        giorniPerMese.add(bisestile ? 29 : 28);
        giorniPerMese.add(31);
        giorniPerMese.add(30);
        giorniPerMese.add(31);
        giorniPerMese.add(30);
        giorniPerMese.add(31);
        giorniPerMese.add(31);
        giorniPerMese.add(30);
        giorniPerMese.add(31);
        giorniPerMese.add(30);
        giorniPerMese.add(31);
    }

    private void popolaGiorniSettimana() {
        giorniSettimana.add("Lunedì");
        giorniSettimana.add("Martedì");
        giorniSettimana.add("Mercoledì");
        giorniSettimana.add("Giovedì");
        giorniSettimana.add("Venerdì");
        giorniSettimana.add("Sabato");
        giorniSettimana.add("Domenica");
    }

    private void inizializzaCalendario() {
        for (int i = 0; i < NUMERO_MESI; i++) {
            calendario.add(new ArrayList<String>());
        }
    }

    private void riempiCalendario(int count) {
        for (int i = 0; i < NUMERO_MESI; i++) {
            for (int j = 0; j < giorniPerMese.get(i); j++) {
                calendario.get(i).add(giorniSettimana.get(count));
                count++;
                if (count > 6) {
                    count = 0;
                }
            }
        }
    }

    public void stampaCalendario() {
        for (int i = 0; i < NUMERO_MESI; i++) {
            System.out.println(mesi.get(i));
            for (int j = 0; j < giorniPerMese.get(i); j++) {
                System.out.println(j + 1 + " " + getCalendario().get(i).get(j));
            }
        }
    }

    public boolean isBisestile(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    public void getGiorno(int mese, int giorno) {
        System.out.println("Il giorno " + giorno + " " + mesi.get(mese - 1) + " è " + calendario.get(mese - 1).get(giorno - 1));
    }

}
