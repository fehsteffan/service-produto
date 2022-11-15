package com.program.produto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.program.produto.dto.ProdutoDto;
import com.program.produto.model.Produto;
import com.program.produto.services.ProdutoService;

@RestController
@RequestMapping(value="produtos")
public class ProdutoController {
	
	
	@Autowired
	private ProdutoService service;
	
	
	
	public ProdutoController(ProdutoService service) {		
		this.service = service;
	}



	@PostMapping
	public Produto insert(@RequestBody ProdutoDto dto) {
		Produto produto = new Produto(1L, dto.getDescription(), dto.getValor());
		return service.insert(produto);
	}
	

}
