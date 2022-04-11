package Datos;

import java.io.Serializable;

/**
 * 
 * @author ik_1dw3
 *
 */
public class Vehiculo implements Serializable, Comparable<Vehiculo> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String numBast;
	// Clasificable
	private String matricula;
	private String modelo;
	private String marca;
	private String tipo;
	private String cilindrada;

	private String color;
	private String KM;
	private Fecha fechITV;
	private Fecha fechUltimaRevision;

	/**
	 * Constructor por defecto
	 */
	public Vehiculo() {
		this.numBast = "AAAAAA11111";
		// Clasificable
		this.matricula = "1111AAA";
		this.modelo = "none";
		this.marca = "None";
		this.tipo = "motor";
		this.cilindrada = "0";
		this.fechITV = new Fecha();
		this.fechUltimaRevision = new Fecha();
		this.color = "None";
		this.KM = "0";
	}

	/**
	 * Contructor copia
	 * 
	 * @param V Objto que queremos copiar
	 */
	public Vehiculo(Vehiculo V) {
		this.numBast = V.numBast;
		// Clasificable
		this.matricula = V.matricula;
		this.modelo = V.modelo;
		this.marca = V.marca;
		this.tipo = V.tipo;
		this.cilindrada = V.cilindrada;
		this.fechITV = V.fechITV;
		this.fechUltimaRevision = V.fechUltimaRevision;
		this.color = V.color;
		this.KM = V.KM;
	}

	/**
	 * Constructor personalizado
	 * 
	 * @param numbast             Número de bastidor
	 * @param matricula           Matrícula
	 * @param modelo              Modelo
	 * @param marca               Marca
	 * @param tipo                Tipo
	 * @param cilindrada          Cilindrada
	 * @param color               Color
	 * @param km                  Kilometraje
	 * @param fechaITV            Fecha de la última ITV
	 * @param fechaUltimaRevision Fecha de la última revisión
	 */
	public Vehiculo(String numbast, String matricula, String modelo, String marca, String tipo, String cilindrada,
			String color, String km, Fecha fechaITV, Fecha fechaUltimaRevision) {
		// TODO Auto-generated constructor stub
		this.numBast = numbast;
		this.matricula = matricula;
		this.modelo = modelo;
		this.marca = marca;
		this.tipo = tipo;
		this.color = color;
		this.KM = km;
		this.cilindrada = cilindrada;
		this.fechITV = fechaITV;
		this.fechUltimaRevision = fechaUltimaRevision;
	}

	/**
	 * Método toString para dar formato de escritura al objeto
	 */
	@Override
	public String toString() {
		return "Vehiculo [numBast=" + numBast + ", matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca
				+ ", tipo=" + tipo + ", cilindrada=" + cilindrada + ", color=" + color + ", KM=" + KM + ", fechITV=" + fechITV
				+ ", fechUltimaRevision=" + fechUltimaRevision + "]";
	}

	/**
	 * Getter del objeto
	 * 
	 * @return objeto
	 */
	public Fecha getFechUltimaRevision() {
		return fechUltimaRevision;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param fechUltimaRevision objeto obtenido
	 */
	public void setFechUltimaRevision(Fecha fechUltimaRevision) {
		this.fechUltimaRevision = fechUltimaRevision;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public String getNumBast() {
		return numBast;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param numBast Objeto obtenido
	 */
	public void setNumBast(String numBast) {
		this.numBast = numBast;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param matricula Objeto obtenido
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param modelo Objeto obtenido
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * 
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param marca Objeto obtenido
	 */
	public void setMarca(String marca) {
		this.marca = marca;
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

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public String getCilindrada() {
		return cilindrada;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param cilindrada Objeto obtenido
	 */
	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public Fecha getFechITV() {
		return fechITV;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param fechITV Objeto obtenido
	 */
	public void setFechITV(Fecha fechITV) {
		this.fechITV = fechITV;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param color Objeto obtenido
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public String getKM() {
		return KM;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param kM Objeto obtenido
	 */
	public void setKM(String kM) {
		KM = kM;
	}

	/**
	 * Método para comparar dos objetos
	 */
	@Override
	public int compareTo(Vehiculo o) {
		// TODO Auto-generated method stub
		return (this.getNumBast().compareTo(o.getNumBast()));
	}

}
