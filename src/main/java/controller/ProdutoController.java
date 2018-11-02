package controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import domain.Produto;
import service.ProdutoService;


@Path("/produtos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoController {

	
	private ProdutoService produtoService = new ProdutoService();
	
    @GET
    public List<Produto> List() {
        List<Produto> produtos = produtoService.listaProdutos();
        return produtos;
    }	
	
	
}
