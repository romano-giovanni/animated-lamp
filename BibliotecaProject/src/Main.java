import it.apuliadigital.biblioteca.Biblioteca;
import it.apuliadigital.biblioteca.Libro;
import it.apuliadigital.biblioteca.Persona;
import it.apuliadigital.biblioteca.StatusPersona;
import it.apuliadigital.exceptions.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Aggiunta di persone
        try {
            biblioteca.aggiungiPersona("Giovanni", "Romano", "123456", "0001", StatusPersona.STUDENTE);
            biblioteca.aggiungiPersona("Marco", "Albi", "123456", "0002", StatusPersona.DOCENTE);
            biblioteca.aggiungiPersona("Matteo", "Romano", "123456", "0004", StatusPersona.DOCENTE);
            biblioteca.aggiungiPersona("Silvio", "De Marco", "123456", "0005", StatusPersona.DOCENTE);
            biblioteca.aggiungiPersona("Mario", "Rossi", "123456", "0006", StatusPersona.DOCENTE);
            biblioteca.aggiungiPersona("Luca", "Bianchi", "123456", "0007", StatusPersona.DOCENTE);
        } catch (PersonaAlreadyExistsException e) {
            System.out.println("Errore: Persona già esistente");
        }

        // Rimozione di persona
        try {
            biblioteca.rimuoviPersona("0001");
        } catch (PersonaNotExistsException e) {
            System.out.println("Errore: Persona non esistente");
        }

        // Stampa persone
        for (Persona persona : biblioteca.getClienti().values()) {
            System.out.println(persona.getNome());
        }

        // Aggiungo libro
        try {
            biblioteca.aggiungiLibro("Harry Potter", "J. K Rowling", "0001");
            biblioteca.aggiungiLibro("Libro 2", "Tizio", "0002");
            biblioteca.aggiungiLibro("Libro 3", "Caio", "0003");
            biblioteca.aggiungiLibro("Libro 4", "Sempronio", "0004");
            biblioteca.aggiungiLibro("Libro 5", "John Doe", "0005");
            biblioteca.aggiungiLibro("Libro 5", "John Doe", "0005");
        } catch (LibroAlreadyExistsException e) {
            System.out.println("Errore: Libro già esistente");
        }

        // Rimuovo libro
        try {
            biblioteca.rimuoviLibro("0001");
        } catch (LibroNotExistsException e) {
            System.out.println("Errore: Libro non esistente");
        }

        // Stampa libri
        for (Libro libro : biblioteca.getLibri().values()) {
            System.out.println(libro.getTitolo());
        }

        // Verifico presenza di un libro
        if (biblioteca.verificaPresenzaLibro("Libro 2")) {
            System.out.println("Libro trovato");
        } else {
            System.out.println("Libro non trovato");
        }

        if (biblioteca.verificaPresenzaLibro("Libro 10")) {
            System.out.println("Libro trovato");
        } else {
            System.out.println("Libro non trovato");
        }

        // Prestito di un libro
        try {
            biblioteca.richiediLibro("0005", "0005", LocalDate.now(), StatusPersona.STUDENTE);
            biblioteca.richiediLibro("0003", "0004", LocalDate.now(), StatusPersona.STUDENTE);
            biblioteca.richiediLibro("0002", "0007", LocalDate.now(), StatusPersona.DOCENTE);
            biblioteca.richiediLibro("0002", "0007", LocalDate.now(), StatusPersona.DOCENTE);
            biblioteca.richiediLibro("0002", "0007", LocalDate.now(), StatusPersona.DOCENTE);
        } catch (LibroNotExistsException e) {
            System.out.println("Errore: Libro non esistente");
        } catch (PrestitoAlreadExistsException e) {
            System.out.println("Errore: Questo libro è stato già prestato");
        }

        // Restituzione di un libro
        try {
            biblioteca.rimuoviPrestito("0002");
        } catch (LibroNotExistsException e) {
            System.out.println("Errore: Libro non esistente");;
        }

        // Verifica prestito
        if (biblioteca.verificaPrestito("0002")) {
            System.out.println("Libro in prestito");
        } else {
            System.out.println("Libro non in prestito");
        }

        // Esporto report prestiti
        biblioteca.reportPrestiti("report.txt");

    }
}