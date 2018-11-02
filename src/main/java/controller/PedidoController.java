package controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import domain.Pedido;
import domain.PedidoCliente;
import service.PedidoService;


@Path("/pedidos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PedidoController {

	private PedidoService pedidoService = new PedidoService();
	
    @POST
    public Response add(PedidoCliente pedidoCliente) {
  	
    	Pedido pedido = pedidoService.AdicionarPedido(pedidoCliente.getCliente(), pedidoCliente.getProdutos());
    	if (pedido != null) {
			 pedidoService.EnviarEmail(pedidoCliente.getCliente());
			 return Response.ok().entity(pedido).build();
		} else {
			return Response.ok().build();	
		}
    }	
}
