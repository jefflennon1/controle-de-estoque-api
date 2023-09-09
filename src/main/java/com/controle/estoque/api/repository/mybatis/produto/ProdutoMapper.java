package com.controle.estoque.api.repository.mybatis.produto;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.controle.estoque.api.model.Produto;

@Mapper
public interface ProdutoMapper {
	
	public void atualizar(@Param("produto") Produto produto);
}
