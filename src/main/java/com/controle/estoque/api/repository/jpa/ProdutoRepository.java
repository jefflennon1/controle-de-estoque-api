package com.controle.estoque.api.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.controle.estoque.api.model.Produto;

import jakarta.transaction.Transactional;

@Transactional
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	@Query(value = "SELECT * FROM PRODUTOS WHERE ID = :id", nativeQuery = true)
	Produto buscarPorId(Long id);

}
