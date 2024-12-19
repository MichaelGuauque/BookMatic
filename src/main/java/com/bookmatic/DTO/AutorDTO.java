package com.bookmatic.DTO;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)

public record AutorDTO(@JsonAlias("name") String nombre,
                       @JsonAlias("birth_year") Integer fechaNacimiento,
                       @JsonAlias("death_year") Integer fechaDeDefuncion) {
}
