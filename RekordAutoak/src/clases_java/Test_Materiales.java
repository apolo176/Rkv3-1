package clases_java;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Datos.Material;
import Datos.Materiales;

public class Test_Materiales {

	@Test
	public void testMateriales() {

		Materiales mat = new Materiales();
		assertEquals(mat, new Materiales(new Materiales()));
		}

	
	private void assertEquals(Materiales mat, Materiales materiales) {
		// TODO Auto-generated method stub
		
	}
	
	@Test
	public void testMaterialesMateriales() {
		Materiales mat =  new Materiales(new Integer(0), new ArrayList<Material>());
		assertEquals(mat,new Materiales());
	}

	@Test
	public void testMaterialesIntArrayListOfMaterial() {

		Materiales mat =  new Materiales(new Integer(0), new ArrayList<Material>());
		assertEquals(mat,new Materiales(new Materiales()));
	}

}
