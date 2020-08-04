package com.danielfreitasbs.cursomcspring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.danielfreitasbs.cursomcspring.domain.Categoria;
import com.danielfreitasbs.cursomcspring.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomcSpringApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritorio");
	
		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}

}
