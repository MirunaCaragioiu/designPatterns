package avion;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Categories.class)
@SuiteClasses({ TestGetNrLocuriOcupate.class, TestSetGreutateIncarccata.class })
@IncludeCategory({CategorieAvionCapacitateMare.class,CategorieAvionCapacitateMica.class})
public class SuitaCompleta {

}
