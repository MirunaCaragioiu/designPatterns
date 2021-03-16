package restaurant;

public class Debarasator extends Angajat {

	@Override
	public void serveste(Client client) {
		if(client.isDoresteDebarasareMasa()) {
			System.out.println("Debarasarea mesei a avut succes!");
		}
		// TODO Auto-generated method stub
		
	}

}
