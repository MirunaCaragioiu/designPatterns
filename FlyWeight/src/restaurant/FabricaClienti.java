package restaurant;

import java.util.HashMap;

public class FabricaClienti {
	
	private static HashMap<String, IClient> listaClienti=new HashMap<String, IClient>();
	
	public  static IClient getClient(String nrTelefon,String nume,String adresaEmail) {
		IClient client=listaClienti.get(nrTelefon);
		if(client==null) {
			client=new Client(nume, nrTelefon, adresaEmail);
			listaClienti.put(nrTelefon, client);
			}
		return client;
	}
	public static int getSize() {
		return listaClienti.size();
	}
	
	
}
