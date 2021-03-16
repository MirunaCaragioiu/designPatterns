package student;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteDeterminareTipStudent {
	
	@Test
	public void testSub5DeterminareTipStudent() {
		Student s=new Student("Miruna", "IN1323",8);
		s.determinareTipStudent(4);
		assertEquals("Restantier", s.determinareTipStudent(4));
	}
	
	@Test
	public void testIntegralistDeterminareTipStudent() {
		Student s=new Student("Miruna", "IN1323",8);
		assertEquals("Integralist", s.determinareTipStudent(6));
	}
	
	@Test
	public void testBursierDeterminareTipStudent() {
		Student s=new Student("Miruna", "IN1323",8);
		assertEquals("Bursier", s.determinareTipStudent(8.5f));
	}
	
	@Test
	public void testSefPromotieDeterminareTipStudent() {
		Student s=new Student("Miruna", "IN1323",8);
		assertEquals("Sef de promotie", s.determinareTipStudent(10));
	}
	
	@Test
	public void testElseDeterminareTipStudent() {
		Student s=new Student("Miruna", "IN1323",8);
		assertEquals("Fara Tip", s.determinareTipStudent(20));
	}
	


}
