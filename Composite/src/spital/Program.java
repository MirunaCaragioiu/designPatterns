package spital;

public class Program {

	public static void main(String[] args) {
		DepartamentComposite dep1=new DepartamentComposite("Departament 1");
		DepartamentComposite dep2=new DepartamentComposite("Departament 2");
		DepartamentComposite dep3=new DepartamentComposite("Departament 3");
		dep1.adaugaNod(dep2);
		dep1.adaugaNod(dep3);
		//dep1.descriere("");
		
		
		Sectie sectie1=new Sectie("Boli infectioase");
		Sectie sectie2=new Sectie("Chirurgie");
		
		dep1.adaugaNod(sectie1);

		//dep1.descriere("");
		
		
		dep3.adaugaNod(sectie2);
		
		dep1.getChild(0).adaugaNod(dep1.getChild(2));
		dep1.stergereNod(dep1.getChild(2));
		
		dep1.descriere("");
		
		
		
		

		

	}

}
