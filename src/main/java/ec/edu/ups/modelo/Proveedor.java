/**
 * 
 */
package ec.edu.ups.modelo;


/**
 * @author Gabriel Leonardo Chu
 *
 */
public class Proveedor {
	private Long id;

	private String nombre;
	
	private String direccion;

	/**
	 * @param id
	 * @param nombre
	 * @param direccion
	 */
	public Proveedor(Long id, String nombre, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public Proveedor() {
		
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Proveedor [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
	
	
	

}
