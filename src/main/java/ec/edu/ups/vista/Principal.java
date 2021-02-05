/**
 * 
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Producto;



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
		Producto p = new Producto();
		p.setNombre("gg");
		p.setStock(5);
		//cli.setCedula("0705626339");
		//cli.setCorreo("vinicioveletanga@gmail.com");
		//cli.setDireccion("PASAJE");
		//cli.setNombre("EDWIN VINICIO");
		//cli.setTelefono("0963963369");
		//System.out.println("prueba principal" +" "+ sR.obtenerCliente("1303292583")); 
		System.out.println("\n");
		
		System.out.println(p);
		System.out.println("\n");
		System.out.println("prueba lista T" +" "+ sR.getProductos());
		//Titulo tit = sR.getTitulo("0705626339", "SIS", "UDA");
		//System.out.println(tit);
		//String respuesta = sR.saveProd(1,p.getStock());
		//System.out.println(respuesta);
		//System.out.println("------NEW");
		//System.out.println("prueba lista T" +" "+ sR.getClientes());

	}

}
