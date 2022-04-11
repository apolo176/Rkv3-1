package clases_java;

import static org.junit.Assert.*;

import org.junit.Test;

import Datos.Cliente;
import Datos.Empleado;
import Datos.GestorData;
import Forms.AnadirCliente;
import Forms.FormularioOrden;

public class Test_AnadirCliente {

	@Test
	public void testAnadirClienteGestorDataFormularioOrden() {

		AnadirCliente AC = new AnadirCliente(new GestorData(),new FormularioOrden( new GestorData(), new Empleado()));
		assertEquals(AC, new AnadirCliente(new GestorData(), new Cliente()),false);
	}

	private void assertEquals(AnadirCliente aC, AnadirCliente anadirCliente, boolean b) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testAnadirClienteGestorDataCliente() {

AnadirCliente AC =  new AnadirCliente(new GestorData(), new Cliente());
assertEquals(new AnadirCliente(new GestorData(),new FormularioOrden( new GestorData(), new Empleado())),false);
	}

	private void assertEquals(AnadirCliente anadirCliente, boolean b) {
		// TODO Auto-generated method stub
		
	}



}
