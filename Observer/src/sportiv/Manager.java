package sportiv;

import java.util.ArrayList;
import java.util.List;

public class Manager implements IManager {
	private String numeManager;
	private List<IClient> clienti;
	
	
	public Manager(String numeManager) {
		super();
		this.numeManager = numeManager;
		this.clienti = new ArrayList<IClient>();
	}
	@Override
	public void adaugaClient(IClient client) {
		this.clienti.add(client);
		
	}
	@Override
	public void stergeClient(IClient client) {
		this.clienti.remove(client);
		
	}
	@Override
	public void notifica(String mesaj) {
		for (IClient iClient : clienti) {
		      iClient.notificare(this.numeManager+":"+mesaj);
		}
	}
	public void meciNou(String tipMeci) {
		if(tipMeci.equals("fotbal")) {
			notifica("Va avea loc un nou meci de fotbal!");
		}else if(tipMeci.equals("handbal")) {
			notifica("Va avea loc un nou meci de handbal");
		}else if(tipMeci.equals("volei")) {
			notifica("Va avea loc un nou meci de volei");
		}
	}
	
	
	
}
