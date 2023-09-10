package com.controle.estoque.api.repository.mybatis.produto;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.controle.estoque.api.model.Produto;

@Mapper
public interface ProdutoMapper {
	
	public void atualizar(@Param("produto") Produto produto);
	
	public List<Produto> listarProdutosPorid(@Param("id") Long id);
	
	public List<Produto> listarProdutos();
	
	public List<Produto> carregarProdutosDaNotaFiscal(@Param("id")  Long id);
}
