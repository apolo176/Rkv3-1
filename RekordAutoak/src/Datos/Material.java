package Datos;

import java.io.Serializable;

/**
 * 
 * @author ik_1dw3
 *
 */
public class Material implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String concepto;
	private int cant;
	private double precio;
	private double precioTot;
	private double precioTotIVA;

	/**
	 * Contructor por defecto
	 */
	public Material() {

		this.concepto = "";
		this.cant = 0;
		this.precio = 1;
		precioTot = 0;

	}

	/**
	 * Contructor copia
	 * 
	 * @param M Objeto que queremos copiar
	 */
	public Material(Material M) {
		this.concepto = M.concepto;
		this.cant = M.cant;
		this.precio = M.precio;
		this.precioTot = cant * precio;

		this.precioTotIVA = M.precioTotIVA;
	}

	/**
	 * Contructor personaizado
	 * 
	 * @param concepto Nombre del material
	 * @param cant     Cantidad del material
	 * @param precio   Precio del material
	 * @param iva      IVA del material
	 */
	public Material(String concepto, int cant, double precio, int iva) {
		// TODO Auto-generated constructor stub

		this.concepto = concepto;
		this.cant = cant;
		this.precio = precio;
		this.precioTot = precio * cant;
		this.precioTotIVA = precioTot + (precioTot * iva) / 100;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public double getPrecioTotIVA() {
		return precioTotIVA;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param precioTotIVA Objeto obtenido
	 */
	public void setPrecioTotIVA(double precioTotIVA) {
		this.precioTotIVA = precioTotIVA;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public String getConcepto() {
		return concepto;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param concepto Objeto obtenido
	 */
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public int getCant() {
		return cant;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param cant Objeto obtenido
	 */
	public void setCant(int cant) {
		this.cant = cant;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param precio Objeto obtenido
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public double getPrecioTot() {
		return precioTot;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param precioTot Objeto obtenido
	 */
	public void setPrecioTot(double precioTot) {
		this.precioTot = precioTot;
	}

	/**
	 * Método toString para dar formato de escritura al objeto
	 */
	@Override
	public String toString() {
		return "Material [concepto=" + concepto + ", cant=" + cant + ", precio=" + precio + ", precioTot=" + precioTot
				+ ", precioTotIVA=" + precioTotIVA + "]";
	}

}
