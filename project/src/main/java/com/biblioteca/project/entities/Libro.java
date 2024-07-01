package com.biblioteca.project.entities;

import com.biblioteca.project.enums.StatoLibro;
import jakarta.persistence.*;

@Entity
@Table(name = "LIBRI")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titolo;
    private String autore;
    private String ISBN;
    private StatoLibro statoLibro;

    public Libro() {
    }

    public Libro(String titolo, String autore, String ISBN, StatoLibro statoLibro) {
        this.titolo = titolo;
        this.autore = autore;
        this.ISBN = ISBN;
        this.statoLibro = statoLibro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", titolo='" + titolo + '\'' + ", autore='" + autore + '\'' + ", ISBN='" + ISBN + '\'' + ", statoLibro=" + statoLibro + '}';
    }

}
