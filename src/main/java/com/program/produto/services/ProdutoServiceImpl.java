package com.program.produto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.program.produto.entities.ProdutoRepository;
import com.program.produto.model.Produto;

@Service
public class ProdutoServiceImpl implements ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;	
	

	public ProdutoServiceImpl(ProdutoRepository repository) {		
		this.repository = repository;
	}
	

	@Override
	public Produto insert(Produto produto) {		
		return repository.save(produto);
	}

}
