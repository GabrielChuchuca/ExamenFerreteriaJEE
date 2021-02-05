/**
 * 
 */
package ec.edu.ups.vista;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Respuesta;
import ec.edu.ups.modelo.Titulo;



/**
 * @author Gabriel Leonardo Chu
 *
 */
public class ServiceRest {
	
	private String WS_GET_CLIENTE = "http://localhost:8080/Probando/rs/cliente/listarclientes";
	private String WS_POST_GUARDAR_TITULO = "http://localhost:8080/Probando/rs/cliente/creartitulo";
	private String WS_POST_GUARDAR_CLIENTE = "http://localhost:8080/Probando/rs/cliente/crearcliente";
	
	public List<Cliente> getClientes() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(WS_GET_CLIENTE);
		List<Cliente> listaC = target.request().get(new GenericType<List<Cliente>>() {
		});
		client.close();

		return listaC;
	}
	

	
	
	public String saveCliente(Cliente c) {
		Client client = ClientBuilder.newClient();
		System.out.println(c.toString());
		WebTarget target = client.target(WS_POST_GUARDAR_CLIENTE);
		String respuesta = target.request().post(Entity.json(c), String.class);
		return respuesta;
	}
	
	public Titulo getTitulo(String cedula, String nombreT, String nombreU) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(
				WS_POST_GUARDAR_TITULO).queryParam("cedula", cedula, "nombreT", nombreT, "nombreU", nombreU);
		//WebTarget target = client.target(WS_POST_GUARDAR_TITULO + "?cedula=" + cedula+"&nombreT="+nombreT+"&nombreU="+nombreU);
		Titulo ti = target.request().get(Titulo.class);
		client.close();
		return ti;
	}
	
	
	

}
