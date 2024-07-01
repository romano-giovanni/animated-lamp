package it.apuliadigital.biblioteca;

import java.time.LocalDate;

public class Prestito implements Comparable<Prestito> {

    private String matricola;
    private String ISBN;
    private LocalDate dataInizio;
    private LocalDate dataFine;

    public Prestito(String matricola, String ISBN, LocalDate dataInizio, StatusPersona statusPersona) {
        this.matricola = matricola;
        this.ISBN = ISBN;
        this.dataInizio = dataInizio;
        if (statusPersona == StatusPersona.STUDENTE) {
            this.dataFine = dataInizio.plusDays(7);
        } else {
            this.dataFine = dataInizio.plusDays(15);
        }
    }

    public Prestito(String matricola, String ISBN) {
        this.matricola = matricola;
        this.ISBN = ISBN;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(LocalDate dataInizio) {
        this.dataInizio = dataInizio;
    }

    public LocalDate getDataFine() {
        return dataFine;
    }

    public void setDataFine(LocalDate dataFine) {
        this.dataFine = dataFine;
    }

    @Override
    public String toString() {
        return "Matricola: " + matricola + ", ISBN: " + ISBN + ", Data inizio: " + dataInizio + ", Data fine: " + dataFine;
    }

    @Override
    public int compareTo(Prestito altroPrestito) {
        return this.matricola.compareTo(altroPrestito.getMatricola());
    }

}
