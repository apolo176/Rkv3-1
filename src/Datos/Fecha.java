package Datos;

import java.io.Serializable;
import java.util.Objects;

/**
 * 
 * @author ik_1dw3
 *
 */
public class Fecha implements Comparable<Fecha>, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 598196613836221551L;
	private int dia;
	private int mes;
	private int ano;

	/**
	 * Constructor por defecto
	 */
	public Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.ano = 2020;

	}

	/**
	 * Constructor copia
	 * 
	 * @param f Objeto que queremos copiar
	 */
	public Fecha(Fecha f) {
		// TODO Auto-generated constructor stub

		this.dia = f.dia;
		this.mes = f.mes;
		this.ano = f.ano;

	}

	/**
	 * Contructor personaliazdo(tocar)
	 * 
	 * @param d Dia
	 * @param m Mes
	 * @param a Año
	 */
	public Fecha(int d, int m, int a) {
		this.dia = d;
		this.mes = m;
		this.ano = a;

		if (this.dia == 0 || this.mes == 0) {
			this.dia = 1;
		}
	}

	/**
	 * Método CompareTO para comparar dos objetos
	 */
	@Override
	public int compareTo(Fecha other) {
		// TODO Auto-generated method stub
		if (this.ano > other.ano) {
			return 1;
		} else if (this.ano < other.ano) {
			return -1;
		} else {
			if (this.mes > other.mes) {
				return 1;
			} else if (this.mes < other.mes) {
				return -1;
			}

			else {
				if (this.dia > other.dia) {
					return 1;
				} else if (this.dia < other.dia) {
					return -1;
				}
			}
		}
		return 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ano, dia, mes);
	}

	/**
	 * Método equals para comprobar si dos objetos son iguales
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		return ano == other.ano && dia == other.dia && mes == other.mes;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Setter del obbjeto
	 * 
	 * @param dia Objeto obtenido
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * Setter del objeto
	 * 
	 * @param mes Objeto obtenido
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * Getter del objeto
	 * 
	 * @return Objeto
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * Setter del Objeto
	 * 
	 * @param ano Objeto
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/**
	 * Método toString para darle formto de ecritura al objeto
	 */
	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}

	/**
	 * Método para comprobar si un objeto esta vacio
	 * 
	 * @return Si esta vacio
	 */
	public boolean isEmpty() {
		// TODO Auto-generated method stub

		return isEmpty();
	}

	/**
	 * Método para comprobar si un objeto esta en blanco
	 * 
	 * @return Si esta en blannco
	 */
	public boolean isBlanck() {
		// TODO Auto-generated method stub
		return isBlanck();
	}

}
