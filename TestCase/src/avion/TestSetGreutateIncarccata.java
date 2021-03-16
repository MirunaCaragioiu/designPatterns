package avion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestSetGreutateIncarccata {
	
	@Test
	@Category(CategorieAvionCapacitateMica.class)
	public void testRight() {
		Avion avion=new Avion(50,"model",90);
		avion.setGreutateIncarcata(20);
		assertEquals(20, avion.getGreutateIncarcata(),0.01);
	}

}
