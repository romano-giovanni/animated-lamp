import java.time.LocalDate;

public class Persona {

    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private String telefono;

    public Persona(String nome, String cognome, LocalDate dataNascita,  String telefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.telefono = telefono;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public String getTelefono() {
        return telefono;
    }


}
