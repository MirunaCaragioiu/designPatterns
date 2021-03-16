package avion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestGetPretBilet {
	
	@Test
	public void testValoareSub80() {
		Avion avion=new Avion(1236,"model",125);
		avion.getPretBilet(50);
		assertEquals(100, avion.getPretBilet(50),0.01);
	}
	
	@Test
	public void testValoareSub250() {
		Avion avion=new Avion(1236,"model",125);
		avion.getPretBilet(160);
		assertEquals(200, avion.getPretBilet(160),0.01);
	}
	
	@Test
	public void testAltfel() {
		Avion avion=new Avion(1236,"model",125);
		avion.getPretBilet(400);
		assertEquals(300, avion.getPretBilet(400),0.01);
	}

}
