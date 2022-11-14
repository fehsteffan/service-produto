package com.program.produto.dto;

import java.math.BigDecimal;

public class ProdutoDto {
	
	private String description;
	
	
	private BigDecimal valor;
	
	
	public ProdutoDto() {		
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public BigDecimal getValor() {
		return valor;
	}


	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}	
}
