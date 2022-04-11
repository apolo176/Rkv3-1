package Datos;

import java.io.Serializable;

/**
 * 
 * @author ik_1dw3
 *
 */
public class Cliente implements Comparable<Cliente>, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String dni;
	protected String nombre;
	protected String apellido1;
	protected String apellido2;
	protected String telf;
	protected String email;
	private Fecha fechNa;
	private String codP;

	// Atributos que quiero clasificar
	protected String dir;

	/**
	 * Constructor por defecto
	 */
	public Cliente() {
		this.dni = "";
		this.nombre = "";
		this.apellido1 = "";
		this.apellido2 = "";
		this.telf = "";
		this.email = "";
		this.fechNa = new Fecha();
		this.dir = "";
		this.codP = "";
	}

	/**
	 * Constructor copia
	 * 
	 * @param C Objeto que queremos copiar
	 */
	public Cliente(Cliente C) {
		this.dni = C.dni;
		this.nombre = C.nombre;
		this.apellido1 = C.apellido1;
		this.apellido2 = C.apellido2;
		this.telf = C.telf;
		this.email = C.email;
		this.fechNa = new Fecha(C.fechNa);
		this.dir = C.dir;
		this.codP = C.codP;
	}

	/**
	 * Contructor personnalizado
	 * 
	 * @param dni       DNI del cliente
	 * @param nombre    Nombre dle cliente
	 * @param apellido1 Primer apellido del cliente
	 * @param apellido2 Segundo apellido del cliente
	 * @param telf      Telefono del cliente
	 * @param email     Email del cliene
	 * @param direccion Direccion del cliente
	 * @param codP      CP del cliente
	 * @param fechNa    Fecha de nacimiento del cliente
	 */
	public Cliente(String dni, String nombre, String apellido1, String apellido2, String telf, String email,
			String direccion, String codP, Fecha fechNa) {
		// TODO Auto-generated constructor stub
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.telf = telf;
		this.email = email;
		this.fechNa = new Fecha(fechNa);
		this.dir = direccion;
		this.codP = codP;

	}

	/**
	 * Método toString para darle formato de escritura al objeto
	 */
	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", telf=" + telf + ", email=" + email + ", fechNa=" + fechNa + ", codP=" + codP + ", dir=" + dir + "]";
	}

	/**
	 * Getter del objeto
	 * 
	 * @return objeto
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * setter del objeto
	 * 
	 * @param dni objeto obtenido
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * getter dle objeto
	 * 
	 * @return objeto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * setter del objeto
	 * 
	 * @param nombre Objeto obtenido
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gtter del objeto
	 * 
	 * @return Objeto
	 */
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param apellido1 Objeto obtenido
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public String getApellido2() {
		return apellido2;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param apellido2 Objeto obtenido
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	/**
	 * Getter dle objeto
	 * 
	 * @return Objeto
	 */
	public String getTelf() {
		return telf;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param telf Objeto obtenido
	 */
	public void setTelf(String telf) {
		this.telf = telf;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param email Objeto obtenido
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return objeto
	 */
	public Fecha getFechNa() {
		return fechNa;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param fechNa Objeto obtenido
	 */
	public void setFechNa(Fecha fechNa) {
		this.fechNa = fechNa;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public String getCodP() {
		return codP;
	}

	/**
	 * SSetter del objeto
	 * 
	 * @param codP Objeto obtenido
	 */
	public void setCodP(String codP) {
		this.codP = codP;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public String getDir() {
		return dir;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param dir Objeto obtenido
	 */
	public void setDir(String dir) {
		this.dir = dir;
	}

	/**
	 * Método para comparar dos objetos
	 */
	@Override
	public int compareTo(Cliente o) {
		// TODO Auto-generated method stub

		return (this.getNombre().compareTo(o.getNombre()));

	}

}
