package produs;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import produs.Produs;

public class ProdusSetPretTests {

	@Test
	public void testRight() {
		Produs produs=new Produs("Mere",100,5);
		produs.setPret(12);
		assertEquals(12, produs.getPret(),0.01);
	}
	
	@Test
	@Category(CategorieNuAreVanzari.class)
	public void testBoundary() {
		Produs produs=new Produs("Pere", 10, 20);
		produs.setPret(0);
		assertEquals(0, produs.getPret(), 0.01);
	}

}
