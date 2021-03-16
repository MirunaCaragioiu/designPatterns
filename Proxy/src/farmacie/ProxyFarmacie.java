package farmacie;

public class ProxyFarmacie implements IFarmacie{
	Farmacie farmacie;
	
	

	public ProxyFarmacie(Farmacie farmacie) {
		super();
		this.farmacie = farmacie;
	}



	@Override
	public void achizitioneazaReteta(Client client) {
		if(client.isAreReteta()) {
			System.out.println("Clientul "+client.getNume()+" a achizitionat medicamente pe baza retetei!");
		}else {
			System.out.println("Ne pare rau nu aveti retata");
		}
		
	}
}
