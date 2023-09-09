package com.controle.estoque.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controle.estoque.api.model.NotaFiscal;
import com.controle.estoque.api.model.Produto;
import com.controle.estoque.api.repository.jpa.NotaFiscalRepository;
import com.controle.estoque.api.repository.mybatis.notafiscal.NotaFiscalMapper;

@Service
public class NotaFiscalService {
	
	@Autowired
	private NotaFiscalRepository repository;
	
	@Autowired
	private NotaFiscalMapper mapper;
	
	

	public List<NotaFiscal> listar() { 
		return repository.findAll();
	}

	public NotaFiscal buscarPorId(Long id) { 
		return mapper.buscarPorId(id);
	}

	public void salvar(NotaFiscal notaFiscal) {   
		repository.save(notaFiscal);
		salvaItensNotafiscal(notaFiscal);
	}


	public void atualizar(NotaFiscal produto) {
		mapper.atualizar(produto);
	}

	private void salvaItensNotafiscal(NotaFiscal notaFiscal) {
		for(Produto produto: notaFiscal.getItens()) {
			produto.setNumeroNotaFiscal(notaFiscal.getId());
			mapper.salvarItemNotaFiscal(produto);
		}
		
	}
	
}
