package it.apuliadigital.biblioteca;

public class Docente extends Persona {

    public Docente(String nome, String cognome, String matricola, String numeroTelefono) {
        super(nome, cognome, matricola, numeroTelefono);
    }

    @Override
    public String toString() {
        return "Docente";
    }

}
