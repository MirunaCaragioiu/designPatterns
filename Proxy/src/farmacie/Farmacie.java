package farmacie;

public class Farmacie implements IFarmacie{
	private String numeFarmacie;

	public Farmacie(String numeFarmacie) {
		super();
		this.numeFarmacie = numeFarmacie;
	}

	@Override
	public void achizitioneazaReteta(Client client) {
			System.out.println("Clientul "+client.getNume()+" achizitionat medicamente pe baza retetei de la "+ this.numeFarmacie);
		
	}
	

}
