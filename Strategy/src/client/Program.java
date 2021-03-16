package client;

public class Program {

	public static void main(String[] args) {
		
		Client client =new Client("Popescu");
		client.setModPlata(new PlataCard());
		client.plateste(124.5f);
		client.setModPlata(new PlataCash());
		client.plateste(15);

	}

}
