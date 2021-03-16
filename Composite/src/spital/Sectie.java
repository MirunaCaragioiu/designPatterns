package spital;

public class Sectie implements IOptiune {
	String nume;
	
	public Sectie(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void stergereNod(IOptiune optiune) {
		
		throw new IllegalArgumentException();
		
	}

	@Override
	public void adaugaNod(IOptiune opitune) {
		throw new IllegalArgumentException();
		
		
	}

	@Override
	public IOptiune getChild(int index) {
		throw new IllegalArgumentException();
		
	}

	@Override
	public void descriere(String identare) {
		// TODO Auto-generated method stub
		System.out.println(identare+"Sectia:" +this.nume);
	}

}
