package com.biblioteca.project.DTO.builders;

import com.biblioteca.project.DTO.LibroDTO;
import com.biblioteca.project.entities.Libro;
import org.springframework.stereotype.Component;

@Component
public class LibroDTOBuilder {

    public Libro toLibro(LibroDTO libroDTO) {
        Libro libro = new Libro();
        libro.setTitolo(libroDTO.getTitolo());
        libro.setAutore(libroDTO.getAutore());
        libro.setISBN(libroDTO.getISBN());
        libro.setStatoLibro(libroDTO.getStatoLibro());
        return libro;
    }

    public LibroDTO toLibroDTO(Libro libro) {
        LibroDTO libroDTO = new LibroDTO();
        libroDTO.setTitolo(libro.getTitolo());
        libroDTO.setAutore(libro.getAutore());
        libroDTO.setISBN(libro.getISBN());
        libroDTO.setStatoLibro(libro.getStatoLibro());
        return libroDTO;
    }
}
