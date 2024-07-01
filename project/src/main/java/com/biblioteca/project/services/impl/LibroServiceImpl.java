package com.biblioteca.project.services.impl;

import com.biblioteca.project.DTO.LibroDTO;
import com.biblioteca.project.DTO.builders.LibroDTOBuilder;
import com.biblioteca.project.entities.Libro;
import com.biblioteca.project.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl {

    @Autowired
    private LibroRepository libroRepository;
    @Autowired
    private LibroDTOBuilder libroDTOBuilder;

    public LibroDTO aggiungiLibro(LibroDTO libroDTO) {
        Libro libro = libroDTOBuilder.toLibro(libroDTO);
        Libro libroSaved = libroRepository.save(libro);
        return libroDTOBuilder.toLibroDTO(libroSaved);
    }

    public boolean rimuoviLibro(int id) {
        libroRepository.deleteById(id);
        return true;
    }

    public boolean verificaPresenzaLibro(int id) {
        return libroRepository.existsById(id);
    }

}
