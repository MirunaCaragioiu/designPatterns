package produs;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({ ProductsGetValoareMaximaTests.class, ProdusSetPretTests.class })
@IncludeCategory({CategorieAreVanzari.class,CategorieNuAreVanzari.class})
public class CustomSuite {

}
