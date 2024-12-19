package com.bookmatic;

import com.bookmatic.DTO.LibroDTO;
import com.bookmatic.Principal.Principal;
import com.bookmatic.persistence.repository.AutorRepository;
import com.bookmatic.persistence.repository.LibroRepository;
import com.bookmatic.service.ConsumoAPI;
import com.bookmatic.service.ConvierteDatos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookMaticApplication implements CommandLineRunner {

    @Autowired
    private LibroRepository libro;
    @Autowired
    private AutorRepository autor;

    public static void main(String[] args) {
        SpringApplication.run(BookMaticApplication.class, args);

    }
    @Override
    public void run(String... args) throws Exception {
      Principal principal = new Principal(libro, autor);
      principal.programa();
    }

}
