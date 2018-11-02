package service;

import java.util.List;

import domain.Cliente;
import domain.Pedido;
import domain.Produto;

public interface IPedidoService {

	Pedido AdicionarPedido(Cliente cliente, List<Produto> produtos);
	
	boolean EnviarEmail(Cliente cliente);
	
}
