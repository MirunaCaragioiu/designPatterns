package restaurant;

public class Barman extends Angajat {

	@Override
	public void serveste(Client client) {
		if(client.isDoresteBautura()) {
			System.out.println("Clientul a primit o bautura!");
		}else {
			super.getUrmatorulAngajat().serveste(client);
		}
		
	}

}
