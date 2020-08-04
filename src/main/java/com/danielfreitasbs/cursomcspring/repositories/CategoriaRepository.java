package com.danielfreitasbs.cursomcspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielfreitasbs.cursomcspring.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
