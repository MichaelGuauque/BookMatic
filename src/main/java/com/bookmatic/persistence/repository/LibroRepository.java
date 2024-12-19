package com.bookmatic.persistence.repository;

import com.bookmatic.persistence.model.Libro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LibroRepository extends CrudRepository<Libro, Long> {

    Optional<Libro> findByTituloContaining(String titulo);
    List<Libro> findByIdioma(String idioma);
}
