package avion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestGetNrLocuriOcupate {
	
	@Test
	@Category(CategorieAvionCapacitateMare.class)
    public void testCardinalitateGetNumarLocuriOcupate()  {
		Avion avion=new Avion(50,"model",90);
        boolean[] locuriOcupate= new boolean[]{true, false,true,false, true};
        assertEquals(-7,avion.getNumarLocuriOcupate(locuriOcupate),0.01);
    }
	
	@Test(timeout=1000)
    public void testPerformanceGetNumarLocuriOcupate()  {
		Avion avion=new Avion(50,"model",90);
		boolean[] locuriOcupate = new boolean[1000];
        for(int i = 0; i < locuriOcupate.length; i++) {
        	locuriOcupate[i] = true;
        }
        assertEquals(990, avion.getNumarLocuriOcupate(locuriOcupate));
    }

}
