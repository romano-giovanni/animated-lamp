package it.apuliadigital.biblioteca;

public abstract class Persona {
    protected String nome;
    protected String cognome;
    private String matricola;
    protected String numeroTelefono;

    public Persona(String nome, String cognome, String matricola, String numeroTelefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "Persona";
    }

}