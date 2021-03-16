package farmacie;

import java.util.ArrayList;
import java.util.List;

public class CategorieComposite implements IOptiune {
	private String nume;
	private List<IOptiune> medicamente;
	
	public CategorieComposite(String nume) {
		this.nume=nume;
		this.medicamente=new ArrayList<IOptiune>();
	}
	
	@Override
	public void stergereNod(IOptiune optiune) {
		this.medicamente.remove(optiune);
		
	}

	@Override
	public void adaugaNod(IOptiune optiune) {
		
		this.medicamente.add(optiune);
		// TODO Auto-generated method stub
		
	}

	@Override
	public IOptiune getChild(int index) {
		return this.medicamente.get(index);
	}

	@Override
	public void descriereNod(String identare) {
		System.out.println(identare+"Categorie: "+nume);
		for (IOptiune iOptiune : medicamente) {
			iOptiune.descriereNod(identare+" ");
		}
		
	}

	
	
}
