package farmacie;

public class NodFrunzaMedicament implements IOptiune {
	
	private String nume;
	
	public NodFrunzaMedicament(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void stergereNod(IOptiune optiune) {
		throw new IllegalArgumentException();
		
	}

	@Override
	public void adaugaNod(IOptiune optiune) {
		throw new IllegalArgumentException();
		
	}

	@Override
	public IOptiune getChild(int index) {
		throw new IllegalArgumentException();
	}

	@Override
	public void descriereNod(String identare) {
		System.out.println(identare+"Medicament: "+this.nume);
		
	}
	
}
