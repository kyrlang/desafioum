package service;

import java.util.ArrayList;
import java.util.List;

import domain.Produto;

public class ProdutoService implements IProdutoService {

	public List<Produto> listaProdutos() {
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto(1, "Chocolates"));
		produtos.add(new Produto(2, "Salgados"));
		produtos.add(new Produto(3, "Refrigerante"));
		produtos.add(new Produto(4, "Cerveja"));
		produtos.add(new Produto(5, "Salaminho Italiano"));
		produtos.add(new Produto(6, "Vinho"));
		produtos.add(new Produto(7, "Água"));
		return produtos;
	}

	

}
