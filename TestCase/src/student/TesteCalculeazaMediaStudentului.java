package student;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TesteCalculeazaMediaStudentului {
	
	@Test
	@Category(CategorieStudentIntegralist.class)
	public void testCardinality5CalculeazaMediaStudentului() {
		Student s=new Student("Miruna", "IN1323",8);
		int [] noteObtinuteLaExamene= {10,10,10,10,10};
		s.calculeazaMediaStudentului(noteObtinuteLaExamene);
		assertEquals(10, s.calculeazaMediaStudentului(noteObtinuteLaExamene),0.01);
	}
	
	@Test(timeout=5)
	public void testPerformanceCalculeazaMediaStudent() {
		Student s=new Student("Miruna", "IN1323",8);
		int [] noteObtinuteLaExamene= {10,10,10,10,10};
		s.calculeazaMediaStudentului(noteObtinuteLaExamene);
		assertEquals(10, s.calculeazaMediaStudentului(noteObtinuteLaExamene),0.01);
	}


}
