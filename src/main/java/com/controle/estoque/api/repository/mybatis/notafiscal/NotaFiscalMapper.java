package com.controle.estoque.api.repository.mybatis.notafiscal;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.controle.estoque.api.model.NotaFiscal;
import com.controle.estoque.api.model.Produto;

@Mapper
public interface NotaFiscalMapper {
	
	public NotaFiscal buscarPorId(@Param("id") Long id);
	
	public NotaFiscal buscarPorNumero(@Param("notafiscal") NotaFiscal notafiscal);
	
	public void atualizar(@Param("notafiscal") NotaFiscal notafiscal);

	public void salvarItemNotaFiscal(@Param("produto") Produto Produto);

	public List<NotaFiscal> listar();

	public List<NotaFiscal> listarNotas();
}
