package com.danielfreitasbs.cursomcspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielfreitasbs.cursomcspring.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
