package com.controle.estoque.api.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controle.estoque.api.model.NotaFiscal;

public interface NotaFiscalRepository extends JpaRepository<NotaFiscal, Long> {

}
