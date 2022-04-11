/**
 * 
 */
package Datos;

import java.io.Serializable;

/**
 * 
 * @author ik_1dw3
 *
 */
public class Arreglo implements Serializable {

	private static final long serialVersionUID = 1L;
	private int idArreglo;
	private int iva;
	private int HMO;
	private double PMO;
	private int desc;
	private double BaseMO;
	private double precioIVAMO;

	/**
	 * Constructor por defecto
	 */
	public Arreglo() {
		this.idArreglo = 0;
		this.iva = 21;
		this.HMO = 0;
		this.PMO = 0;
		this.desc = 0;
		this.BaseMO = 0;
		this.precioIVAMO = 0;
	}

	/**
	 * Constructor copia
	 * 
	 * @param A Arreglo que hay que copiar
	 */
	public Arreglo(Arreglo A) {
		this.idArreglo = A.idArreglo;
		this.iva = A.iva;
		this.HMO = A.HMO;
		this.PMO = A.PMO;
		this.desc = A.desc;
		this.BaseMO = A.BaseMO;
		this.precioIVAMO = ((HMO * PMO) + ((HMO * PMO) * iva / 100));

	}

	/**
	 * Contructor perssonalizado
	 * 
	 * @param idArreglo ID que queremos que tenga
	 * @param PMO       Precio de mano de obra
	 * @param HMO       Horas de mano de obra
	 * @param iva       IVA del arreglo
	 * @param desc      Descuento del arreglo
	 */
	public Arreglo(int idArreglo, int PMO, int HMO, int iva, int desc) {
		this.idArreglo = idArreglo;
		this.iva = iva;
		this.HMO = HMO;
		this.PMO = PMO;
		this.desc = desc;
		this.BaseMO = (HMO * PMO);
		this.precioIVAMO = (BaseMO + (BaseMO * iva / 100));

	}

	/**
	 * Getter Obtiene el Id del Arreglo
	 * 
	 * @return ID arreglo
	 */
	public int getIdArreglo() {
		return idArreglo;
	}

	/**
	 * Setter
	 * 
	 * @param idArreglo ID obtenido
	 */
	public void setIdArreglo(int idArreglo) {
		this.idArreglo = idArreglo;
	}

	/**
	 * Getter Obtiene el Precio por mano de obra
	 * 
	 * @return Precio por mano de obra
	 */
	public double getPMO() {
		return PMO;
	}

	/**
	 * Setter
	 * 
	 * @param pMO precio de mano de obr otenido
	 */
	public void setPMO(double pMO) {
		PMO = pMO;
	}

	/**
	 * setter
	 * 
	 * @param precioIVAMO Precio con Iva obtenido
	 */
	public void setPrecioIVAMO(double precioIVAMO) {
		this.precioIVAMO = precioIVAMO;
	}

	/**
	 * getter Obtiene el IVa de la mano de obra
	 * 
	 * @return Iva de mano de obra
	 */
	public int getIva() {
		return iva;
	}

	/**
	 * setter
	 * 
	 * @param iva Iva obtenido
	 */
	public void setIva(int iva) {
		this.iva = iva;
	}

	/**
	 * Getter Obtiene las horas de mano de obra
	 * 
	 * @return Horas de mano de obra
	 */
	public int getHMO() {
		return HMO;
	}

	/**
	 * Setter
	 * 
	 * @param hMO Horas de mano de obra obtenido
	 */

	public void setHMO(int hMO) {
		HMO = hMO;
	}

	/**
	 * getter Obtiene el decuento aplicado
	 * 
	 * @return Descuento aplicado
	 */
	public int getDesc() {
		return desc;
	}

	/**
	 * setter
	 * 
	 * @param desc Descuento obtenido
	 */
	public void setDesc(int desc) {
		this.desc = desc;
	}

	/**
	 * getter Obtiene el precio con el iva
	 * 
	 * @return Precio con el iva
	 */
	public double getPrecioIVAMO() {
		return precioIVAMO;
	}

	/**
	 * getter Obtiene el precio sin iva
	 * 
	 * @return Precio sin iva
	 */
	public double getBaseMO() {
		return BaseMO;
	}

	/**
	 * Setter
	 * 
	 * @param baseMO Precio sin el iva obtenido
	 */
	public void setBaseMO(double baseMO) {
		BaseMO = baseMO;
	}

	/**
	 * Método toString para darle formato de escritura al objeto
	 */
	@Override
	public String toString() {
		return "Arreglo [idArreglo=" + idArreglo + ", iva=" + iva + ", HMO=" + HMO + ", PMO=" + PMO + ", desc=" + desc
				+ ", BaseMO=" + BaseMO + ", precioIVAMO=" + precioIVAMO + "]";
	}

}
