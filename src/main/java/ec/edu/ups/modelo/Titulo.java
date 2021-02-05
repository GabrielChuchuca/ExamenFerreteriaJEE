/**
 * 
 */
package ec.edu.ups.modelo;

import java.util.Date;



/**
 * @author Gabriel Leonardo Chu
 *
 */
public class Titulo {
	private String numerotitulo;

	private String nombre;

	private String Universidad;

	private Date fechaDeRegistro;
	
	private Cliente cliente;

	/**
	 * @param numerotitulo
	 * @param nombre
	 * @param universidad
	 * @param fechaDeRegistro
	 * @param cliente
	 */
	public Titulo(String numerotitulo, String nombre, String universidad, Date fechaDeRegistro, Cliente cliente) {
		super();
		this.numerotitulo = numerotitulo;
		this.nombre = nombre;
		Universidad = universidad;
		this.fechaDeRegistro = fechaDeRegistro;
		this.cliente = cliente;
	}
	
	public Titulo() {
		
	}

	/**
	 * @return the numerotitulo
	 */
	public String getNumerotitulo() {
		return numerotitulo;
	}

	/**
	 * @param numerotitulo the numerotitulo to set
	 */
	public void setNumerotitulo(String numerotitulo) {
		this.numerotitulo = numerotitulo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the universidad
	 */
	public String getUniversidad() {
		return Universidad;
	}

	/**
	 * @param universidad the universidad to set
	 */
	public void setUniversidad(String universidad) {
		Universidad = universidad;
	}

	/**
	 * @return the fechaDeRegistro
	 */
	public Date getFechaDeRegistro() {
		return fechaDeRegistro;
	}

	/**
	 * @param fechaDeRegistro the fechaDeRegistro to set
	 */
	public void setFechaDeRegistro(Date fechaDeRegistro) {
		this.fechaDeRegistro = fechaDeRegistro;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Titulo [numerotitulo=" + numerotitulo + ", nombre=" + nombre + ", Universidad=" + Universidad
				+ ", fechaDeRegistro=" + fechaDeRegistro + ", cliente=" + cliente + "]";
	}

	
}
