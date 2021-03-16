package spital;

import java.util.ArrayList;
import java.util.List;

public class DepartamentComposite implements IOptiune{
	
	private String nume;
	private List<IOptiune> departamente;
	
	
	public DepartamentComposite(String nume) {
		super();
		this.nume = nume;
		this.departamente = new ArrayList<IOptiune>();
	}

	@Override
	public void stergereNod(IOptiune optiune) {
		
		departamente.remove(optiune);
		
	}

	@Override
	public void adaugaNod(IOptiune opitune) {
		departamente.add(opitune);
	}

	@Override
	public IOptiune getChild(int index) {
		return departamente.get(index);
	}

	@Override
	public void descriere(String identare) {
		System.out.println(identare+"Departamentul "+this.nume);
		for (IOptiune iOptiune : departamente) {
			iOptiune.descriere(identare+" ");
		}
		
	}
	
}
