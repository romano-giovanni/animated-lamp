import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ContoManager implements Serializable {

    private Map<String, ContoInterface> listaConti;

    public ContoManager() {
        listaConti = new HashMap<>();
    }

    public Map<String, ContoInterface> getListaConti() {
        return listaConti;
    }

    public Optional<ContoInterface> getConto(String iban) {
        return Optional.ofNullable(listaConti.get(iban));
    }

    public ContoFiduciario addContoFiduciario(String intestatario, String iban, double saldo, double fido) {
        if (listaConti.containsKey(iban)) {
            throw new IllegalArgumentException("Errore: Il conto con questo IBAN esiste già");
        }
        ContoFiduciario conto = new ContoFiduciario(intestatario, iban, saldo, fido);
        listaConti.put(iban, conto);
        return conto;
    }

    public ContoDeposito addContoDeposito(String intestatario, String iban, double saldo, double interesse) {
        if (listaConti.containsKey(iban)) {
            throw new IllegalArgumentException("Errore: Il conto con questo IBAN esiste già");
        }
        ContoDeposito conto = new ContoDeposito(intestatario, iban, saldo, interesse);
        listaConti.put(iban, conto);
        return conto;
    }

    public void removeConto(String iban) {
        if (!listaConti.containsKey(iban)) {
            throw new IllegalArgumentException("Il conto con questo IBAN non esiste");
        }
        listaConti.remove(iban);
    }

    public void esportaMap(String path) {
        File file = new File(path);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listaConti);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void importaMap(String path) {
        File file = new File(path);
        if (file.isFile()) {
            try {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                listaConti = (HashMap<String, ContoInterface>) ois.readObject();
            } catch (FileNotFoundException e) {
                System.out.println("File non trovato");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Errore");
            }
        }
    }

}

