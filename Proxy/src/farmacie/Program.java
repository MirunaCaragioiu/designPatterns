package farmacie;

public class Program {

	public static void main(String[] args) {
		//fara proxy
		Client client=new Client("Raluca",false);
		Farmacie farmacie=new Farmacie("MaxiFarm");
		farmacie.achizitioneazaReteta(client);

		
		ProxyFarmacie proxy=new ProxyFarmacie(farmacie);
		proxy.achizitioneazaReteta(client);
		
		
	}

}
