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


import ec.edu.ups.modelo.Producto;
import ec.edu.ups.modelo.Respuesta;




/**
 * @author Gabriel Leonardo Chu
 *
 */
public class ServiceRest {
	
	private String WS_POST_PEDIDO = "http://localhost:8080/ExamenProveedor1JEE/rs/producto/hacerpedido";
	private String WS_GET_PRODUCTOS = "http://localhost:8080/ExamenProveedor1JEE/rs/producto/listarproductos";
	
	public String saveProd(int id, int numRe) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(WS_POST_PEDIDO + "?id=" + id+"&numRequeridos="+numRe);
		//WebTarget target = client.target(WS_POST_GUARDA
		String ti = target.request().get(String.class);
		client.close();
		return ti;
	}
	
	public List<Producto> getProductos() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(WS_GET_PRODUCTOS);
		List<Producto> listaC = target.request().get(new GenericType<List<Producto>>() {
		});
		client.close();

		return listaC;
	}
	
	
	
	
	

}
