import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calcolo interesse annuo");

        double somma = ScannerUtility.scannerDouble("Inserisci somma iniziale");
        int tasso = ScannerUtility.scannerInt("Inserisci tasso interesse");
        int anni = ScannerUtility.scannerInt("Inserisci il numero di anni per cui vuoi visualizzare gli interessi maturati");

        Interesse interesse = new Interesse(somma);
        for (int i = 0; i < anni; i++) {
            somma = interesse.getInteresse(tasso);
            System.out.println("Interesse maturato dopo " + (i + 1) + (i + 1 == 1 ? " anno " : " anni ") + "è di: " + somma);
        }
        System.out.println("Totale: " + interesse.getSomma());
    }

}