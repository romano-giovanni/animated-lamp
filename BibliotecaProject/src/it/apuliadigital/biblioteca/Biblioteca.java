package it.apuliadigital.biblioteca;


import it.apuliadigital.exceptions.*;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Biblioteca {

    private Map<String, Libro> libri;
    private Map<String, Persona> clienti;
    private List<Prestito> prestiti;

    public Biblioteca() {
        this.libri = new HashMap<String, Libro>();
        this.clienti = new HashMap<String, Persona>();
        this.prestiti = new ArrayList<Prestito>();
    }

    // Getters
    public Map<String, Libro> getLibri() {
        return libri;
    }

    public Map<String, Persona> getClienti() {
        return clienti;
    }

    public List<Prestito> getPrestiti() {
        return prestiti;
    }

    // Metodo aggiunta persona
    public void aggiungiPersona(String nome, String cognome, String numeroTelefono, String matricola, StatusPersona statusPersona) throws PersonaAlreadyExistsException {
        if (clienti.containsKey(matricola)) {
            throw new PersonaAlreadyExistsException("Errore: Persona già esistente");
        }
        Persona persona;
        if (statusPersona == StatusPersona.STUDENTE) {
            persona = new Studente(nome, cognome, numeroTelefono, matricola);
        } else {
            persona = new Docente(nome, cognome, numeroTelefono, matricola);
        }
        clienti.put(matricola, persona);
    }

    // Metodo rimozione persona
    public void rimuoviPersona(String matricola) throws PersonaNotExistsException {
        if (!clienti.containsKey(matricola)) {
            throw new PersonaNotExistsException("Errore: Persona non esistente");
        }
        clienti.remove(matricola);
    }

    // Metodo ottieni libro (Restituisce un Optional)
    public Optional<Libro> getLibro(String ISBN) {
        return Optional.ofNullable(libri.get(ISBN));
    }

    // Metodo aggiunta libro
    public void aggiungiLibro(String titolo, String autore, String ISBN) throws LibroAlreadyExistsException {
        if (libri.containsKey(ISBN)) {
            throw new LibroAlreadyExistsException();
        }
        libri.put(ISBN, new Libro(titolo, autore, ISBN));
    }

    // Metodo aggiunta più libri
    public void aggiungiLibri(List<Libro> libriDaAggiungere) throws LibroAlreadyExistsException {
        for (Libro libro : libriDaAggiungere) {
            if (libri.containsKey(libro.getISBN())) {
                throw new LibroAlreadyExistsException();
            }
            libri.put(libro.getISBN(), libro);
        }
    }

    // Metodo rimozione libro
    public void rimuoviLibro(String ISBN) throws LibroNotExistsException {
        if (!libri.containsKey(ISBN)) {
            throw new LibroNotExistsException("Errore: Impossibile rimuovere libro");
        }
        libri.remove(ISBN);
    }

    // Metodo verifica presenza libro (Restituisce boolean)
    public boolean verificaPresenzaLibro(String input) {
        for (Libro libro : libri.values()) {
            if (libro.getTitolo().equals(input) || libro.getAutore().equals(input) || libro.getISBN().equals(input)) {
                return true;
            }
        }
        return false;
    }

    // Metodo che restituisce un Optional di Prestito
    private Optional<Prestito> getPrestito(String ISBN) {
        for (Prestito prestito : prestiti) {
            if (prestito.getISBN().equals(ISBN)) {
                return Optional.of(prestito);
            }
        }
        return Optional.empty();
    }

    // Metodo per la prenotazione di un libro SENZA data di inizio
    public void richiediLibro(String ISBN, String matricola) throws PrestitoAlreadExistsException, LibroNotExistsException {
        if (getPrestito(ISBN).isPresent()) {
            throw new PrestitoAlreadExistsException("Errore: Prestito già esistente");
        }
        Optional<Libro> opt = getLibro(ISBN);
        if (opt.isPresent()) {
            prestiti.add(new Prestito(ISBN, matricola));
            opt.get().setStato(Stato.PRENOTATO);
            return;
        }
        throw new LibroNotExistsException("Errore: Libro non esistente");
    }

    // Metodo per la richiesta di un libro CON data di inizio
    public void richiediLibro(String ISBN, String matricola, LocalDate dataInizio, StatusPersona status) throws PrestitoAlreadExistsException, LibroNotExistsException {
        if (getPrestito(ISBN).isPresent()) {
            throw new PrestitoAlreadExistsException("Errore: Prestito già esistente");
        }
        Optional<Libro> opt = getLibro(ISBN);
        if (opt.isPresent()) {
            prestiti.add(new Prestito(matricola, ISBN, dataInizio, status));
            opt.get().setStato(Stato.IN_PRESTITO);
            return;
        }
        throw new LibroNotExistsException("Errore: Libro non esistente");
    }

    // Metodo per la restituzione di un libro
    public void rimuoviPrestito(String ISBN) throws LibroNotExistsException {
        Optional<Prestito> prestito = getPrestito(ISBN);
        Optional<Libro> opt = getLibro(ISBN);
        if (prestito.isPresent() && opt.isPresent()) {
            prestiti.remove(prestito.get());
            opt.get().setStato(Stato.DISPONIBILE);
            return;
        }
        throw new LibroNotExistsException("Errore: Prestito non esistente");
    }

    // Metodo per la verifica di un prestito (Restituisce boolean)
    public boolean verificaPrestito(String ISBN) {
        Optional<Prestito> opt = getPrestito(ISBN);
        return opt.isPresent();
    }

    // Esporta in un file .txt il report dei prestiti
    public void reportPrestiti(String path) {
        ArrayList<Prestito> prestitiOrdinati = new ArrayList<Prestito>(prestiti);
        Collections.sort(prestitiOrdinati);
        try {
            FileWriter fw = new FileWriter(path, true);
            Writer out = new BufferedWriter(fw);

            for (Prestito prestito : prestitiOrdinati) {
                out.write(prestito + "\n");
            }

            out.flush();
            out.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O exception");
        }

    }

    @Override
    public String toString() {
        return "Biblioteca";
    }
}