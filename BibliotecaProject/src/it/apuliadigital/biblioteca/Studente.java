package it.apuliadigital.biblioteca;

public class Studente extends Persona {

    public Studente(String nome, String cognome, String matricola, String numeroTelefono) {
        super(nome, cognome, matricola, numeroTelefono);
    }

    @Override
    public String toString() {
        return "Studente";
    }
}

