import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonaManager {

    private List<Persona> persone;

    public PersonaManager() {
        this.persone = new ArrayList<>();
    }

    public List<Persona> getPersone() {
        return persone;
    }

    public LocalDate stringToDate(String data) {
        LocalDate dataNascita;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            return dataNascita = LocalDate.parse(data, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Formato data non valido");
            return null;
        }
    }

    public void insertAnagrafica(String nome, String cognome, String dataNascita, String telefono) {
        LocalDate nascita = stringToDate(dataNascita);
        if (nascita == null) {
            return;
        }
        persone.add(new Persona(nome, cognome, nascita, telefono));
    }

    public void deleteAnagrafica(String telefono) {
        Iterator<Persona> iterator = persone.iterator();
        while (iterator.hasNext()) {
            if (((Persona) iterator.next()).getTelefono().equals(telefono)) {
                iterator.remove();
            }
        }
    }

    // TODO implementa UPDATE

}
