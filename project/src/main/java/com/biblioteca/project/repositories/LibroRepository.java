package com.biblioteca.project.repositories;

import com.biblioteca.project.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Integer> {
}
