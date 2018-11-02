package service;

import java.util.ArrayList;
import java.util.List;

import domain.Cliente;
import domain.Pedido;
import domain.Produto;

public class PedidoService implements IPedidoService {

	private List<Pedido> pedidos = new ArrayList<>();
	
	public Pedido AdicionarPedido(Cliente cliente, List<Produto> produtos) {
		Pedido pedido = new Pedido();
		pedido.setCliente(cliente);
		pedido.setProdutos(produtos);
		this.pedidos.add(pedido);
		return pedido;
	}

	public boolean EnviarEmail(Cliente cliente) {
		Email email = new Email();
		String fromEmail = "de";
		String password = "senha";
		String subject = "Pedido Finalizado";
		String body = "Seu peido foi finalizado com sucesso";
		email.sendEmail(fromEmail, password, cliente.getEmail(), subject, body);
		return true;
	}

}
