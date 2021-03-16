package restaurant;

public class Ospatar extends Angajat {

	@Override
	public void serveste(Client client) {
		if(client.isDoresteServetele()) {
			System.out.println("Clientul a primit servetele!");
		}else {
			super.getUrmatorulAngajat().serveste(client);
		}
		
	}

}
