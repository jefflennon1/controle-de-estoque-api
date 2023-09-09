package com.controle.estoque.api.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "NOTA_FISCAL_ELETRONICA")
public class NotaFiscal {
	
		 
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "ID")
		@JsonProperty(value = "ID")
		private Long id;
		
		@Column(name = "NUMERO")
		@JsonProperty(value = "numero")
	 	private Long numero;
	 	
		@Column(name = "NUMERO")
		@JsonProperty(value = "dataEmissao")
	    private Date dataEmissao;
	    
		@Column(name = "EMINENTE")
		@JsonProperty(value = "emitente")
	    private String emitente;
	    
		@Column(name = "DESTINATARIO")
		@JsonProperty(value = "destinatario")
	    private String destinatario;
	    
	    private List<Produto> itens;
	    
	    @Column(name = "VALOR_TOTAL")
		@JsonProperty(value = "valorTotal")
	    private double valorTotal;
	    
	    
	   
	    public NotaFiscal(long numero, Date dataEmissao, String emitente, String destinatario, List<Produto> itens) {
	        this.numero = numero;
	        this.dataEmissao = dataEmissao;
	        this.emitente = emitente;
	        this.destinatario = destinatario;
	        this.itens = itens;
	        this.calcularValorTotal();
	    }
	    
	    // Métodos getters e setters
	    
	    public long getNumero() {
	        return numero;
	    }

	    public void setNumero(long numero) {
	        this.numero = numero;
	    }

	    public Date getDataEmissao() {
	        return dataEmissao;
	    }

	    public void setDataEmissao(Date dataEmissao) {
	        this.dataEmissao = dataEmissao;
	    }

	    public String getEmitente() {
	        return emitente;
	    }

	    public void setEmitente(String emitente) {
	        this.emitente = emitente;
	    }

	    public String getDestinatario() {
	        return destinatario;
	    }

	    public void setDestinatario(String destinatario) {
	        this.destinatario = destinatario;
	    }

	    public List<Produto> getItens() {
	        return itens;
	    }

	    public void setItens(List<Produto> itens) {
	        this.itens = itens;
	    }

	    public double getValorTotal() {
	        return valorTotal;
	    }

	    public void setValorTotal(double valorTotal) {
	        this.valorTotal = valorTotal;
	    }
	    
	    
	    
	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public void setNumero(Long numero) {
			this.numero = numero;
		}

		// Método para calcular o valor total com base nos itens
	    private void calcularValorTotal() {
	        this.valorTotal = 0;
	        for (Produto item : itens) {
	            this.valorTotal += item.getValor();
	        }
	    }

}
