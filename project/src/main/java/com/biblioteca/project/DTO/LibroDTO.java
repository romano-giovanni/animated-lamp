package com.biblioteca.project.DTO;

import com.biblioteca.project.enums.StatoLibro;

public class LibroDTO {
    private String titolo;
    private String autore;
    private String ISBN;
    private StatoLibro statoLibro;

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public StatoLibro getStatoLibro() {
        return statoLibro;
    }

    public void setStatoLibro(StatoLibro statoLibro) {
        this.statoLibro = statoLibro;
    }
}
