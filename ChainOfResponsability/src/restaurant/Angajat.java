package restaurant;

public abstract class Angajat {

	private Angajat urmatorulAngajat;

	public Angajat getUrmatorulAngajat() {
		return urmatorulAngajat;
	}

	public void setUrmatorulAngajat(Angajat urmatorulAngajat) {
		this.urmatorulAngajat = urmatorulAngajat;
	}
	public abstract void serveste(Client client);
	
	
}
