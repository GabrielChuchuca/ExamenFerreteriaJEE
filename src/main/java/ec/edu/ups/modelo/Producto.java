/**
 * 
 */
package ec.edu.ups.modelo;


/**
 * @author Gabriel Leonardo Chu
 *
 */
public class Producto {
	private Long id;
	private String nombre;
	private Proveedor proveedor;
	private int stock;
	/**
	 * @param id
	 * @param nombre
	 * @param proveedor
	 * @param stock
	 */
	public Producto(Long id, String nombre, Proveedor proveedor, int stock) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.proveedor = proveedor;
		this.stock = stock;
	}
	
	public Producto() {
		
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
	 * @return the proveedor
	 */
	public Proveedor getProveedor() {
		return proveedor;
	}

	/**
	 * @param proveedor the proveedor to set
	 */
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", proveedor=" + proveedor + ", stock=" + stock + "]";
	}
	
	
	
	
	
	
	
	
	

}
