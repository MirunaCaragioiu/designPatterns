package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements IOptiune{
	private String nume;
	List<IOptiune> categorii;
	public Categorie(String nume) {
		super();
		this.nume = nume;
		this.categorii = new ArrayList<IOptiune>();
	}
	@Override
	public void adaugaOptiune(IOptiune optiune) {
		categorii.add(optiune);
		
	}
	@Override
	public void stergeOptiune(IOptiune optiune) {
		categorii.remove(optiune);
		
	}
	@Override
	public void descriere(String identare) {
		
		System.out.println(identare+"Categorie:"+this.nume);
		for (IOptiune iOptiune : categorii) {
			iOptiune.descriere(identare+" ");
		}
		
	}
	@Override
	public IOptiune getOptiune(int index) {
		return categorii.get(index);
	}
	
	
	
}
