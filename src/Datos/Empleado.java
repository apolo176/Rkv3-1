package Datos;

import java.io.Serializable;

import javax.swing.JTextField;

/**
 * 
 * @author ik_1dw3
 *
 */
public class Empleado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String dni;
	protected String nombre;
	protected String apellido1;
	protected String apellido2;
	private Fecha fecha_Nac;
	protected String telf;
	protected String email;
	protected String codP;
	protected String dir;
	protected String claveAcceso;
	protected int codEmp;
	protected String tipo;

	/**
	 * Constructor por defecto
	 */
	public Empleado() {
		this.dni = "";
		this.nombre = "";
		this.apellido1 = "";
		this.apellido2 = "";
		this.fecha_Nac = new Fecha();
		this.telf = "";
		this.email = "";
		this.codP = "";
		this.dir = "";
		this.claveAcceso = "";
		this.codEmp = 0;
		this.tipo = "";

	}

	/**
	 * Contructor copia
	 * 
	 * @param e Objeto que queremos copiar
	 */
	public Empleado(Empleado e) {
		this.dni = e.dni;
		this.nombre = e.nombre;
		this.apellido1 = e.apellido1;
		this.apellido2 = e.apellido2;
		this.fecha_Nac = new Fecha(e.fecha_Nac);
		this.telf = e.telf;
		this.email = e.email;
		this.codP = e.codP;
		this.dir = e.dir;
		this.claveAcceso = e.claveAcceso;
		this.codEmp = e.codEmp;
		this.tipo = e.tipo;
	}

	/**
	 * Constructor personalizado
	 * 
	 * @param DNI         DNI Empleado
	 * @param Nombre      Nombre empleado
	 * @param Apellido1   Primer apellido empleado
	 * @param Apellido2   Segundo apellido empleado
	 * @param Telf        Telefono empleado
	 * @param Email       Email empleado
	 * @param CP          CP Empleado
	 * @param Dir         Dirección empleado
	 * @param ClaveAcceso Clave de Acceso empleado
	 * @param CodEmp      Codido de Empleado
	 * @param Tipo        Tipo de empleado
	 * @param Fecha_Nac   Fecha de nacimiento del empleado
	 */
	public Empleado(String DNI, String Nombre, String Apellido1, String Apellido2, String Telf, String Email, String CP,
			String Dir, String ClaveAcceso, int CodEmp, String Tipo, Fecha Fecha_Nac) {

		this.dni = DNI;
		this.nombre = Nombre;
		this.apellido1 = Apellido1;
		this.apellido2 = Apellido2;
		this.fecha_Nac = new Fecha(Fecha_Nac);
		this.telf = Telf;
		this.email = Email;
		this.codP = CP;
		this.dir = Dir;
		this.claveAcceso = ClaveAcceso;
		this.codEmp = CodEmp;
		this.tipo = Tipo;
	}

	/**
	 * Constructor personalizado
	 * 
	 * @param usuario    Usuario del empleado
	 * @param contrasena Contraseña del empleado
	 */
	public Empleado(String usuario, String contrasena) {
		// TODO Auto-generated constructor stub
		this.nombre = usuario;
		this.claveAcceso = contrasena;

	}

	/**
	 * Método toString para darle formato de escritura al objeto
	 */
	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", fecha_Nac=" + fecha_Nac + ", telf=" + telf + ", email=" + email + ", codP=" + codP + ", dir=" + dir
				+ ", claveAcceso=" + claveAcceso + ", codEmp=" + codEmp + ", tipo=" + tipo + "]";
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param dni Objeto obtenido
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param nombre Objeto obtenido
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param apellido1 Objto obtenido
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
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public Fecha getFecha_Nac() {
		return fecha_Nac;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param fecha_Nac Objeto obtenido
	 */
	public void setFecha_Nac(Fecha fecha_Nac) {
		this.fecha_Nac = fecha_Nac;
	}

	/**
	 * Getter del objeto
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
	 * @return Objeto
	 */
	public String getCodP() {
		return codP;
	}

	/**
	 * Setter del objeto
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
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public String getClaveAcceso() {
		return claveAcceso;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param claveAcceso Objeto obtenido
	 */
	public void setClaveAcceso(String claveAcceso) {
		this.claveAcceso = claveAcceso;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public int getCodEmp() {
		return codEmp;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param codEmp Objeto obtenido
	 */
	public void setCodEmp(int codEmp) {
		this.codEmp = codEmp;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param tipo Objeto obtenido
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
