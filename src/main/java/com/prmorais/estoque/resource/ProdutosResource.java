package com.prmorais.estoque.resource;

import com.prmorais.estoque.model.Produto;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutosResource {

  private static final List<Produto> PRODUTOS = Arrays.asList(
    new Produto(1L, "Computador desktop"),
    new Produto(2L, "Notebook Dell"),
    new Produto(3L, "Tablet 14 polegtadas"),
    new Produto(4L, "Celular")
  );

  @GetMapping
  @PreAuthorize("hasAuthority('ROLE')")
  public List<Produto> listar() {
    return PRODUTOS;
  }
}
