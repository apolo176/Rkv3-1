package Datos;

import java.io.Serializable;

import dialogs.FacturaMain;

/**
 * 
 * @author ik_1dw3
 *
 */
public class Orden implements Comparable<Orden>, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Cliente cliente;
	private Vehiculo vehiculo;
	private Arreglo arreglo;
	private Materiales materiales;
	private Empleado empleado;
	private int idRef;
	private double precioOrden;
	private double precioOrdenIva;
	private boolean terminada;
	private FacturaMain factura;

	/**
	 * Contructor por defecto
	 */
	public Orden() {
		cliente = new Cliente();
		vehiculo = new Vehiculo();
		arreglo = new Arreglo();
		materiales = new Materiales();
		idRef = 0;
		factura = null;
		precioOrdenIva = 0;
		empleado = new Empleado();
		precioOrden = 0;
	}

	/**
	 * Contructor personalizado
	 * 
	 * @param C Cliente
	 * @param V Vehiculo
	 * @param A Arreglo
	 * @param M Materiales
	 * @param E Empleado
	 */
	public Orden(Cliente C, Vehiculo V, Arreglo A, Materiales M, Empleado E) {
		this.cliente = new Cliente(C);
		this.vehiculo = new Vehiculo(V);
		this.arreglo = new Arreglo(A);
		this.materiales = new Materiales(M);
		this.empleado = new Empleado(E);

		this.idRef = materiales.getIdMat();

		factura = null;
		precioOrden = materiales.getPrecioTot() + arreglo.getBaseMO();
		precioOrdenIva = materiales.getPrecioTotIva() + arreglo.getPrecioIVAMO();
	}

	/**
	 * Contructor personalizado
	 * 
	 * @param orden Orden e trabajo
	 */
	public Orden(Orden orden) {
		this.cliente = orden.cliente;
		this.vehiculo = orden.vehiculo;
		this.arreglo = orden.arreglo;
		this.materiales = orden.materiales;
		this.empleado = orden.empleado;
		this.idRef = orden.idRef;
		this.precioOrden = orden.precioOrden;
		this.precioOrdenIva = orden.precioOrdenIva;
		this.factura = orden.factura;
		// TODO Auto-generated constructor stub
	}

	/**
	 * Método para meter los datos en una fila de una tabla
	 * 
	 * @return Fila de la tabla
	 */
	public Object[] getObjectRow() {
		return new Object[] { idRef, cliente, vehiculo, arreglo, materiales, empleado, precioOrden, precioOrdenIva

		};
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */

	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public Empleado getEmpleado() {
		return empleado;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param empleado Objeto obtenido
	 */
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param cliente Objeto obtenido
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param vehiculo Objeto obtenido
	 */
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public Arreglo getArreglo() {
		return arreglo;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param arreglo Objeto obtenido
	 */
	public void setArreglo(Arreglo arreglo) {
		this.arreglo = arreglo;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public Materiales getMateriales() {
		return materiales;
	}

	/**
	 * Getter del objeto en la posicion i
	 * 
	 * @param i Posiion en la que se obtiene el objeto
	 * @return Objeto
	 */
	public Material getMaterial(int i) {
		return materiales.getMaterial(i);

	}

	/**
	 * Setter del objeto
	 * 
	 * @param materiales Objeto obtenido
	 */
	public void setMateriales(Materiales materiales) {
		this.materiales = materiales;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public int getIdRef() {
		return idRef;
	}

	/**
	 * Not used Getter del objeto
	 * 
	 * @return Devuelve false
	 */
	public boolean getTerminada() {
		// TODO Auto-generated method stub

		return false;
	}

	/**
	 * Setter del objeto
	 * 
	 * @return Devuelve true
	 */
	public boolean setTerminada() {
		// TODO Auto-generated method stub
		terminada = true;
		return true;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return objeto
	 */
	public FacturaMain getFactura() {
		return factura;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param fact Objeto obtenido
	 */
	public void setFactura(FacturaMain fact) {
		this.factura = fact;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public double getPrecioOrden() {
		return precioOrden;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param precioOrden Objeto obtenido
	 */
	public void setPrecioOrden(double precioOrden) {
		this.precioOrden = precioOrden;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public double getPrecioOrdenIva() {
		return precioOrdenIva;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param previoOrdenIva Objeto obtenido
	 */
	public void setPrecioOrdenIva(double previoOrdenIva) {
		this.precioOrdenIva = previoOrdenIva;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param idRef Objeto obtenido
	 */
	public void setIdRef(int idRef) {
		this.idRef = idRef;
	}

	/**
	 * Método toStriing para dar formato de escritura al objeto
	 */
	@Override
	public String toString() {
		return "Orden [cliente=" + cliente + ", vehiculo=" + vehiculo + ", arreglo=" + arreglo + ", materiales="
				+ materiales + ", idOrden=" + idRef + "]";
	}

	/**
	 * Método que comprueba si el objeto es nulo
	 * 
	 * @return Si es o no, null
	 */
	public boolean isNull() {
		// TODO Auto-generated method stub
		return isNull();
	}

	/**
	 * Método para comparar dos objetos
	 */
	@Override
	public int compareTo(Orden o) {
		// TODO Auto-generated method stub
		if (this.idRef == o.idRef) {
			return 0;

		}
		if (this.idRef < o.idRef) {
			return -1;
		}
		if (this.idRef < o.idRef) {
			return 1;
		}
		return 2;

	}

}
