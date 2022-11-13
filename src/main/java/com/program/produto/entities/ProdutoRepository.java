package com.program.produto.entities;

import org.springframework.data.jpa.repository.JpaRepository;

import com.program.produto.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
