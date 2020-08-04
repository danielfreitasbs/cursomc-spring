package com.danielfreitasbs.cursomcspring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielfreitasbs.cursomcspring.domain.Categoria;
import com.danielfreitasbs.cursomcspring.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepo;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = categoriaRepo.findById(id);

		return obj.orElse(null);
	}
}
