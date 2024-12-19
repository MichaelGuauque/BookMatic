package com.bookmatic.persistence.repository;

import com.bookmatic.persistence.model.Autor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutorRepository extends CrudRepository<Autor, Long> {

    @Query("SELECT a FROM Autor a WHERE a.fechaNacimiento <= :anio AND (a.fechaFallecimiento IS NULL OR a.fechaFallecimiento >= :anio) ORDER BY a.fechaNacimiento ASC")
    List<Autor> findAutorPorAnio(int anio);
}
