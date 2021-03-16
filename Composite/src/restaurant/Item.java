package restaurant;

public class Item implements IOptiune {
	String nume;

	public Item(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void adaugaOptiune(IOptiune optiune) {
		throw new IllegalArgumentException();
		
	}

	@Override
	public void stergeOptiune(IOptiune optiune) {
		throw new IllegalArgumentException();
		
	}

	@Override
	public void descriere(String identare) {
		System.out.println(identare+"Item:"+this.nume);
		
	}

	@Override
	public IOptiune getOptiune(int index) {
		throw new IllegalArgumentException();
	}
	
	
}
