package student;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import student.ExceptieNumarRestante;

public class TesteGetNumarRestante {
	
	@Test
	@Category(CategorieStudentRestantier.class)
	public void testRightGetNumarRestante() {
		Student s=new Student("Miruna", "IN1323",8);
		int [] noteObtinuteLaExamene= {6,4,10,10};
		s.getNumarRestante(noteObtinuteLaExamene);
		assertEquals(1, s.getNumarRestante(noteObtinuteLaExamene));
	}
	
	@Test(expected =ExceptieNumarRestante.class)
	public void testErrorGetNumarRestante() {
		Student s=new Student("Miruna", "IN1323",8);
		int [] noteObtinuteLaExamene= {6,4,12};
		s.getNumarRestante(noteObtinuteLaExamene);
	}


}
