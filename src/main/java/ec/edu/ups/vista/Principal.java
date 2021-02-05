/**
 * 
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Respuesta;
import ec.edu.ups.modelo.Titulo;

/**
 * @author Gabriel Leonardo Chu
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ServiceRest sR = new ServiceRest();
		//Cliente cli = new Cliente();
		//cli.setApellido("VELETENGA ORDOÑEZ");
		//cli.setCedula("0705626339");
		//cli.setCorreo("vinicioveletanga@gmail.com");
		//cli.setDireccion("PASAJE");
		//cli.setNombre("EDWIN VINICIO");
		//cli.setTelefono("0963963369");
		//System.out.println("prueba principal" +" "+ sR.obtenerCliente("1303292583")); 
		System.out.println("\n");
		System.out.println("prueba lista T" +" "+ sR.getClientes());
		System.out.println("\n");
		Titulo tit = sR.getTitulo("0705626339", "SIS", "UDA");
		System.out.println(tit);
		//String respuesta = sR.saveCliente(cli);
		//System.out.println(respuesta);
		//System.out.println("------NEW");
		//System.out.println("prueba lista T" +" "+ sR.getClientes());

	}

}
