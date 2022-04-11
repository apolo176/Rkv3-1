package Datos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



import clases_java.AddLoggerInFile;
/**
 * 
 * @author Grupo_1
 * @version 2.0
 *
 */
public class GestorData {
	/**
	 * ArrayList: Private. ArrayList encargada de almacenar, gestionar y recoger los datos de las Ordenes generadas.
	 */
	private ArrayList <Orden> ordenes;
	/**
	 * ArrayList: Private. ArrayList encargada de almacenar, gestionar y recoger los datos de los Clientes generados.
	 */
	private ArrayList<Cliente> clientes;
	/**
	 * ArrayList: Private. ArrayList encargada de almacenar, gestionar y recoger los datos de los Vehiculos generados.
	 */
	private ArrayList<Vehiculo> vehiculos;
	/**
	 * ArrayList: Private. ArrayList encargada de almacenar, gestionar y recoger los datos de los Arreglos generados.
	 */
	private ArrayList<Arreglo> arreglos;
	/**
	 * ArrayList: Private. ArrayList encargada de almacenar, gestionar y recoger los datos de los objetos Material utilizados en cada orden de trabajo.
	 */
	private ArrayList<Material> materiales;
	/**
	 * ArrayList: Private. ArrayList encargada de almacenar, gestionar y recoger los datos de los Materiales utilizados en general. 
	 */
	private ArrayList<Materiales> arraymateriales;
	/**
	 * ArrayList: Private. ArrayList encargada de almacenar, gestionar y recoger los datos de los Empleados existentes.
	 */
	private ArrayList<Empleado> empleados;

	
	/**
	 * Constructor por defecto de la clase GestorData
	 */
	public GestorData(){
		setOrdenes(new ArrayList<>());
		clientes = new ArrayList<>();
		vehiculos = new ArrayList<>();
		arreglos = new ArrayList<>();
		materiales = new ArrayList<>();
		arraymateriales = new ArrayList<>();
		empleados = new ArrayList<>(); 
		cargarDatosDemo();
		AddLoggerInFile.Log("Se han cargado los datos para la Demo");
	}
	/**
	 * Metodo para cargar datos de prueba en la aplicacion
	 */	
	public void cargarDatosDemo(){
	
	Cliente Iker = new Cliente("79177555I", "Iker", "Martin", "Camba", 
			"666777888", "ikermartin@gmail.com", "Calle Ibaizabal Nº 2B", "48200", new Fecha(10,06,1998) );

	Cliente Luka = new Cliente("69644600L", "Luka", "Carmona", "Rivas", 
			"666999666", "lukcarmonaa@gmail.com", "Av. Castillo Nº 1A", "49000", new Fecha(10,10,2000) );

	Cliente Youssef = new Cliente("59577500Y", "Youssef", "Ait", "yhya",
			"555999666","youssefait@gmail.com","Av. Tabira Num 2D", "43000", new Fecha(02,10,1995));

	Cliente Unai = new Cliente("39155160U", "Unai", "Cabo", "Mendez",
			"333999666","unaicabo@gmail.com","Calle Santiago Num 2C", "49203", new Fecha(02,04,1998));

	Cliente Eder = new Cliente("23242343S", "Eder", "Torres", "Navas",
			"666644444","edertorres@gmail.com","Calle Briñas, 14, 2B", "49203", new Fecha(03,04,2002));
	/**
	 * array de arrays que guarda info del vehiculo
	 */
	Vehiculo Polo = new Vehiculo("1ABCD23EFGH456789","0000ABC","Polo", "Volkswagen","Electrico","250",
			"Negro","23000", new Fecha(05,9,2018),  new Fecha(29,4,2018));

	Vehiculo Leon = new Vehiculo("2LGTE23JITT456234","1111ABC","Leon", "SEAT","Gasolina","200",
			"Rojo","45901", new Fecha(06,9,2019), new Fecha(17,5,2018));

	Vehiculo Ibiza = new Vehiculo("3QELF23NPTY477789","2222ABC","Ibiza", "SEAT","Diesel","120",
			"Rosa","120982", new Fecha(05,9,2019), new Fecha(06,10,2017));

	Vehiculo A3 = new Vehiculo("4ABCC32EDDH789789","3333ABC","A3", "Audi","Hibrído-gasolina","125",
			"Azul","1245", new Fecha(9,3,2018), new Fecha(21,3,2019)); 
	guardarCliente(Iker);
	guardarCliente(Luka);
	guardarCliente(Youssef);
	guardarCliente(Eder);
	guardarCliente(Unai);
	guardarVehiculo(Polo);
	guardarVehiculo(Leon);
	guardarVehiculo(Ibiza);
	guardarVehiculo(A3);
	leerEmpleados();
	}
	//Metodo para guardar en disco
	/**
	 * Metodo para borrar de ficher 
	 * @param fichero nombreFichero 
	 */
	public <T> void deleteFich(String fichero) {
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			 fos = new FileOutputStream(fichero);
				oos = new ObjectOutputStream(fos);
				
				oos.reset();
				oos.close();
				fos.close();
		}catch(FileNotFoundException ae){
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * Metodo para reescribir de fichero desde el principio
	 * @param fichero String del nombre del Fichero a ser escrito
	 * @param entidad objeto a ser escrito en el fichero

	 */
	public <T> void escribirFichFalse(String fichero, T entidad) {
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream(fichero);
			oos = new ObjectOutputStream(fos);
			// lo grabo
			
			oos.writeObject(entidad);

			// cierro el fichero
			oos.close();
			fos.close();
		} catch (FileNotFoundException ae) {
			// TODO Auto-generated catch block
			System.out.println("Error, no se encuentra fichero GestorData");

		} catch (IOException ae) {
			// TODO Auto-generated catch block
			System.out.println("Error de entrada y salida GestorData");

		}
	}
	/**
	 * Metodo para escribir en fichero apartir del ultimo bite
	 * @param fichero String del nombre del Fichero a ser escrito
	 * @param entidad objeto a ser escrito en el fichero

	
	 */
	public <T> void escribirFichTrue(String fichero, T entidad) {
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream(fichero, true);
			oos = new ObjectOutputStream(fos);
			// lo grabo
			
			oos.writeObject(entidad);

			// cierro el fichero
			oos.close();
			fos.close();
		} catch (FileNotFoundException ae) {
			// TODO Auto-generated catch block
			System.out.println("Error, no se encuentra fichero GestorData");

		} catch (IOException ae) {
			// TODO Auto-generated catch block
			System.out.println("Error de entrada y salida GestorData");

		}
	}
	
	/**
	 * Metodo para leer desde fichero 
	 * @param fichero String del nombre del Fichero a ser leido
	 * @param entidad objeto a ser asignado el contenido del fichero
	 *
	 */
	// Metodo para esccribir desde disco
	@SuppressWarnings("unchecked")
	public <T> ArrayList<T> leerFich(String fichero, T entidad) {
		FileInputStream fis;
		ObjectInputStream ois;
		ArrayList<T> entidades = new ArrayList<T>();
		try {
			fis = new FileInputStream(fichero);
			
			// lo grabo
			while(fis.available() > 0) {
				ois = new ObjectInputStream(fis);
			try {
				entidad = (T) ois.readObject();
				entidades.add(entidad);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("No se encuentra la clase para  asignar el objeto");
			}
			
}
			// cierro el fichero
			fis.close();
			return entidades;
	
		} catch (FileNotFoundException ae) {
			// TODO Auto-generated catch block
			System.out.println("Error, no se encuentra fichero Cliente AnadirCliente-312");

		} catch (IOException ae) {
			// TODO Auto-generated catch block
			System.out.println("Error de entrada y salida AnadirCliente-316");

		}
		return entidades;
	}
	
	//Gestion Ordenes de Trabajo
	/**
	 * Metodo guardar o sobrescribir una orden en ArrayList Ordenes dependiendo de su existencia en dicho Array
	 * @param orden objeto Orden a ser guardado
	 *@return true Si la orden no existe,
	 * false Si la orden si existe
		 */
	public boolean guardarOrden(Orden orden) {
		for (Orden ordenExistente : getOrdenes())
		{
			if (orden.getIdRef()==ordenExistente.getIdRef())
			{
				ordenes.set(ordenes.indexOf(ordenExistente), orden);
				return false;
			}
		}
		ordenes.add(orden);
		return true;
	}
	/**
	 * Metodo borrar una orden en ArrayList Ordenes.
	 
	 * @param index int con la posicion a ser eliminada
	 
		 */
	public void removeOrden(int index) {
		// TODO Auto-generated method stub
		ordenes.remove(index);
		AddLoggerInFile.Log("Se ha borrado una Orden");
	}
	/**
	 * Metodo getter de una orden del ArrayList Ordenes.
	 *
	 * @param index int con la posicion a ser eliminada
	 * @return Orden
		 */
	public Orden getOrden(int index) {
		return getOrdenes().get(index);
	}
	/**
	 * Metodo para obtener el tamaño del ArrayList Ordenes.
	 *
	 
	 * @return int tamaño Ordenes
		 */
	public int tamañoArrayOrdenes() {
		// TODO Auto-generated method stub
		return getOrdenes().size();
	}
	/**
	 * Metodo getter de ArrayList Ordenes.
	 *
	 
	 * @return ArrayList ordenes
		 */
	public ArrayList <Orden> getOrdenes() {
		return ordenes;
	}
	/**
	 * Metodo setter del ArrayList Ordenes.
	 *
	 * 
	 */
	public void setOrdenes(ArrayList <Orden> ordenes) {
		this.ordenes = ordenes;
	}
	//Gestion Empleados
	/**
	 * Metodo para leer empleados desde fichero 
	 */
	public void leerEmpleados() {
		FileInputStream fis;
		ObjectInputStream ois;
		Empleado Empleado= new Empleado();

		try {
			fis = new FileInputStream("Empleado.dat");
			
			while(fis.available() > 0){
				ois= new ObjectInputStream(fis);

				Empleado = (Empleado) ois.readObject();
		
				guardarEmpleado(Empleado);
		
			}
			// convierte los bytes leídos en un objeto de la clase

			fis.close();
		} catch (FileNotFoundException ae) {
			// TODO Auto-generated catch block
			System.out.println("No existe Fichero ");
		}catch (IOException ae) {
			// TODO Auto-generated catch block
			ae.printStackTrace();
		} catch (ClassNotFoundException ae) {
			// TODO Auto-generated catch block
			ae.printStackTrace();
		} 
	}

	/**
	 * Metodo para guardar o sobreescribir empleado dependiendo de su existen en el ArrayList empleados. 
	 * @param empleado Objeto Empleado a ser guardado
	 *@return Devuelve true si se añade un nuevo empleado y false si sobreescribe el empleado
	 */
	public boolean guardarEmpleado(Empleado empleado) {
		for (Empleado empleadoExistente : getEmpleados())
		{
			if (empleado.getCodEmp()==(empleadoExistente.getCodEmp()) )
			{
				empleados.set(empleados.indexOf(empleadoExistente), empleado);

				return false;
			}
		}
		
		empleados.add(empleado);
		


		return true;
	}
	/**
	 * Metodo borrar un Empleado en ArrayListe empleados.
	 
	 * @param index int con la posicion a ser eliminada
	 
		 */
	public void removeEmpleado(int index) {
		// TODO Auto-generated method stub
		empleados.remove(index);
		AddLoggerInFile.Log("Se ha borrado un Empleado");
	}
	/**
	 * Metodo getter de un empleado del ArrayList Empleados.
	 *
	 * @param index int con la posicion a ser obtenida
	 * @return Empleado
		 */	
	public Empleado getEmpleado(int index) {
		return empleados.get(index);
	}

	/**
	 * Metodo para obtener el tamaño del ArrayList Empleados.
	 *
	 
	 * @return int tamaño Array empleados
		 */
	public int tamañoArrayEmpleados() {
		// TODO Auto-generated method stub
		return empleados.size();
	}
	/**
	 * Metodo getter del ArrayList empleados.
	 *
	 * 
	 * @return ArrayList empleados
		 */
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}
	/**
	 * Metodo setter del ArrayList empleados.
	 *
	 * @param empleados Objeto obtenido
	 * 
		 */
	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	
	
	//Gestion Clientes
	/**
	 * Metodo guardar o sobrescribir un cliente en ArrayList clientes dependiendo de su existencia en dicho ArrayList
	 * @param cliente objeto Cliente a ser guardado
	 *@return true Si el cliente no existe,
	 * false Si el cliente si existe
		 */
	public boolean guardarCliente(Cliente cliente) {
		for (Cliente clienteExistente : clientes)
		{
			if (cliente.getDni().equals(clienteExistente.getDni()))
			{
				clientes.set(clientes.indexOf(clienteExistente), cliente);
				AddLoggerInFile.Log("Se ha modificado un nuevo Cliente");
				return false;
			}
		}

		clientes.add(cliente);
		
		


		return true;
	}
	/**
	 * Metodo borrar un Cliente en ArrayList Clientes.
	 * @param cliente int con la posición a ser eliminada.
		 */
	public void removeCliente(int cliente) {
		// TODO Auto-generated method stub
		clientes.remove(cliente);
		AddLoggerInFile.Log("Se ha borrado un Cliente");
	}
	/**
	 * Metodo getter del ArrayList clientes.
	 *
	 
	 * @return clientes
		 */
	public ArrayList<Cliente> getClientes(){
		return clientes;
		
	}
	/**
	 * Metodo getter de un cliente del ArrayList Clientes.
	 *
	 * @param index int con la posicion a ser obtenida
	 * @return cliente
		 */
	public Cliente getCliente(int index) {
		return clientes.get(index);

	}

	/**
	 * Metodo para obtener el tamaño del ArrayList Clientes.
	 *
	 * @return int tamaño Ordenes
		 */
	public int  tamañoArrayCliente()
	{
		return clientes.size();
	}


	// Gestion Vehiculo
	/**
	 * Metodo getter de un vehículo del ArrayList vehículos.
	 *
	 * @param index int con la posicion a ser obtenida
	 * @return Vehículo
		 */
	public Vehiculo getVehiculo(int index) {
		return vehiculos.get(index);

	}
	/**
	 * Metodo para obtener el tamaño del ArrayList Vehículos.
	 *
	 * @return int tamaño Vehículos
	 */
	public int  tamañoArrayVehiculos()
	{
		return vehiculos.size();
	}
	/**
	 * Metodo borrar un vehículo en ArrayList vehículos.
	 
	 * @param vehiculo int con la posicion a ser eliminada
	 
		 */
	public void removeVehiculo(int vehiculo) {
		// TODO Auto-generated method stub
		clientes.remove(vehiculo);
		AddLoggerInFile.Log("Se ha borrado un Vehiculo");
	}
	/**
	 * Metodo guardar o sobrescribir un vehiculo en ArrayList Vehiculos dependiendo de su existencia en dicho ArrayList
	 * @param vehiculo objeto Vehiculo a ser guardado
	 *@return true Si el vehiculo no existe,
	 * false Si el vehiculo si existe
		 */

	public boolean guardarVehiculo(Vehiculo vehiculo) {
		for (Vehiculo vehiculoExistente: vehiculos)
		{
			if (vehiculo.getNumBast().equals(vehiculoExistente.getNumBast()))
			{
				AddLoggerInFile.Log("Se ha modificado un nuevo Vehiculo");
				vehiculos.set(vehiculos.indexOf(vehiculoExistente), vehiculo);
				return false;
			}
		}
			
			vehiculos.add(vehiculo);
			return true;
	}
	/**
	 * Metodo getter del ArrayList Vehículos.
	 *
	 
	 * @return ArrayList vehículos
		 */
	public ArrayList<Vehiculo> getVehiculos() {
		// TODO Auto-generated method stub
		return vehiculos;
	}
	
	//Gestion Arreglo
	/**
	 * Metodo getter de un Arreglo del ArrayList Arreglos.
	 *
	 * @param index int con la posicion en el array
	 * @return Arreglo
		 */
	public Arreglo getArreglo(int index) {
		return arreglos.get(index);

	}
	/**
	 * Metodo para obtener el tamaño del ArrayList Arreglos.
	 *
	 * @return int tamaño Arreglos
	 */
public int  tamañoArrayArreglos()
	{
		return arreglos.size();
	}
	
/**
 * Metodo guardar o sobrescribir un arreglo en ArrayList Arreglos dependiendo del tamaño de dicho ArrayList
 * @param arreglo objeto Arreglo a ser guardado
 */

	public void guardarArreglo(Arreglo arreglo) {
		
		if(tamañoArrayArreglos()==0) {
			arreglos.add(arreglo);
			AddLoggerInFile.Log("Se ha creado un nuevo Arreglo");
		}else {
			arreglos.set(0, arreglo);
			AddLoggerInFile.Log("Se ha modificado un nuevo Arreglo");
		}
	
	}
	
	
	// Geston de Material
	/**
	 * Metodo getter de un material del ArrayList Materiales.
	 *
	 * @param index arreglo a ser guardado.
	 * @return Material
		 */
	public Material getMaterial(int index) {
		return materiales.get(index);

	}
	
	/**
	 * Metodo getter  del ArrayList arrayMateriales.
	 *
	 * @return Material
		 */
public ArrayList<Material> getArrayMaterial()
	{
		return this.materiales;
	}
	/**
	 * Metodo getter de todos los objetos Materiales del ArrayList arrayMateriales.
	 *
	 * @param idMat int con la posicion a ser eliminada
	 * @return Materiales
		 */
	public Materiales getMateriales(int idMat) {
		for(Materiales materiales:arraymateriales);

		return new Materiales(idMat,this.materiales) ;

	}
	/**
	 * Metodo para obtener el tamaño del ArrayList arrayMateriales.
	 *
	 * @return int tamaño arrayMateriales
	 */
	public int  tamañoArrayMateriales()
	{
		return arraymateriales.size();
	}
	/**
	 * Metodo para obtener el tamaño del ArrayList Materiales.
	 * 
	 * @return int tamaño Materiales
		 */
	public int  tamañoArrayMaterial()
	{
		return materiales.size();
	}
	/**
	 * Metodo guardar un Material en ArrayList materiales
	 * @param material objeto Cliente a ser guardado
		 */

public void guardarMaterial( Material material) {
	
	materiales.add(material);

}
/**
 * Metodo borrar un Material en ArrayList Materiales.
 * @param posicion int con la posicion a ser eliminada
*/

public boolean removeMaterial(int posicion) {
	
	materiales.remove(posicion);
	return true;
}
/**
 * Metodo guardar un objeto materiales en ArrayList arrayMateriales dependiendo de su existencia en dicho ArrayList
 * @param materiales objeto Materiales a ser guardado
 *@return true Si el objeto materiales no existe,
 * false Si el objeto materiales si existe
	 */

	public boolean guardarMateriales(Materiales materiales) {
		
		for (Materiales materialesExistentes: arraymateriales)
		{
			if (materiales.getIdMat() == (materialesExistentes.getIdMat()))
			{
				
				return false;
			}
		}
arraymateriales.add(materiales);

		return true;
	}

















}

