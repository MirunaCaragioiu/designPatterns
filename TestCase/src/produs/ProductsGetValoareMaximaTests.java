package produs;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import produs.Produs;

public class ProductsGetValoareMaximaTests {

	@Test(expected = MaxException.class)
	public void testExistente() {
		Produs produs=new Produs("Apa", 10, 2.5f);
		produs.getVanzareMaxima();
	}
	
	@Test(timeout = 5)
	@Category(CategorieAreVanzari.class)
	public void testPerformance() {
		Produs produs=new Produs("Lapte",20,5);
		ArrayList<Integer> vanzari=new ArrayList<Integer>();
		vanzari.add(20);
		produs.setVanzariZilnice(vanzari);
		produs.getVanzareMaxima();
	}

}
