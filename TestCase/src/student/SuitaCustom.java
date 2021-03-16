package student;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({ TesteCalculeazaMediaStudentului.class, TesteGetNumarRestante.class })
@IncludeCategory({CategorieStudentIntegralist.class, CategorieStudentRestantier.class})
public class SuitaCustom {

}
