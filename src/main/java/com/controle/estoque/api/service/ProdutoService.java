package com.controle.estoque.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controle.estoque.api.model.Produto;
import com.controle.estoque.api.repository.jpa.ProdutoRepository;
import com.controle.estoque.api.repository.mybatis.produto.ProdutoMapper;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;
	
	@Autowired
	private ProdutoMapper mapper;
	
	public List<Produto> listar(){
		return repository.findAll();
	}

	public Produto buscarPorId(Long id) {  
		return repository.buscarPorId(id);
	}

	public void salvar(Produto produto) {
		repository.save(produto);
	} 
	
	public void atualizar(Produto produto) {
		mapper.atualizar(produto);
	}

	public void excluirPorId(Long id) {
		 repository.deleteById(id);
	}
}
