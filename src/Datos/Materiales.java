package Datos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 
 * @author ik_1dw3
 *
 */
public class Materiales implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3063841783827085847L;
	/**
	 * 
	 */

	// private Material material;
	private int idMat;
	private ArrayList<Material> materiales;
	private double precioTot;
	private double precioTotIva;

	/**
	 * Constructor por defecto
	 */
	public Materiales() {
		this.idMat = 0;
		this.materiales = new ArrayList<>();
		precioTot = 0;
		precioTotIva = 0;
	}

	/**
	 * Contructor copia
	 * 
	 * @param materiales Objeto que queremos copiar
	 */
	public Materiales(Materiales materiales) {
		this.idMat = materiales.idMat;
		this.materiales = materiales.materiales;
		this.precioTot = materiales.precioTot;
		this.precioTotIva = materiales.precioTotIva;
	}

	/**
	 * Contructor personalizado
	 * 
	 * @param idMat      ID del material
	 * @param materiales Lista de maateriales
	 */
	public Materiales(int idMat, ArrayList<Material> materiales) {
		this.idMat = idMat;

		this.materiales = materiales;

		for (int i = 0; i < materiales.size(); i++) {
			this.precioTot = this.precioTot + materiales.get(i).getPrecioTot();
		}
		for (int i = 0; i < materiales.size(); i++) {
			this.precioTotIva = this.precioTotIva + materiales.get(i).getPrecioTotIVA();
		}
	}

	/**
	 * Método toString para dar formato de escritura al objeto
	 */
	@Override
	public String toString() {
		return "Materiales [ " + "idMat=" + idMat + ", materiales=" + materiales + "]";
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public int getIdMat() {
		return idMat;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param idMat Objeto obtenido
	 */
	public void setIdMat(int idMat) {
		this.idMat = idMat;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public int getSize() {
		return materiales.size();
	}

	/**
	 * Getter del objeto
	 * 
	 * @return objeto
	 */
	public ArrayList<Material> getMateriales() {
		return materiales;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param materiales Objeto obtenido
	 */
	public void setMateriales(ArrayList<Material> materiales) {
		this.materiales = materiales;
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
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public double getPrecioTotIva() {
		return precioTotIva;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param precioTotIva Objeto obtenido
	 */
	public void setPrecioTotIva(double precioTotIva) {
		this.precioTotIva = precioTotIva;
	}

	/**
	 * Getter del objeto
	 * 
	 * @param posicion Posicion en la que se obtine el objeto
	 * @return Objeto
	 */
	public Material getMaterial(int posicion) {
		// TODO Auto-generated method stub
		return materiales.get(posicion);
	}

}
