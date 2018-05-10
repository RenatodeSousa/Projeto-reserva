package br.com.projReservaSala.teste;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.xml.ws.Response;

import br.com.projReservaSala.util.Reserva;




@Path("/json")
public class JSONReserva {
	@GET
	@Path("/get")
	@Produces("application/json")
	public Reserva getProductInJson() {
		
		Reserva r = new Reserva();
	r.setDescricao("teste 123");
		
		
		return r;
	}
	@POST
	@Path("/post")
	public Response createPessoaInJSON (Reserva reserva) {
		String result = "Product created:"+ reserva;
		return Response.status(201).entity(result).build();
	}

}
