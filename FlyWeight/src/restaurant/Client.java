package restaurant;

public class Client implements IClient {
	
	private String nume;
	private String nrTelefon;
	private String adresaEmail;
	
	
	public String getNume() {
		return nume;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}


	public String getNrTelefon() {
		return nrTelefon;
	}


	public void setNrTelefon(String nrTelefon) {
		this.nrTelefon = nrTelefon;
	}


	public String getAdresaEmail() {
		return adresaEmail;
	}


	public void setAdresaEmail(String adresaEmail) {
		this.adresaEmail = adresaEmail;
	}


	public Client(String nume, String nrTelefon, String adresaEmail) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.adresaEmail = adresaEmail;
	}


	@Override
	public String toString() {
		return "Client [nume=" + nume + ", nrTelefon=" + nrTelefon + ", adresaEmail=" + adresaEmail + "]";
	}


	@Override
	public void descriere(Masa masa) {
		System.out.println(this.toString()+" va avea rezervarea "+masa.toString());
		
	}
	
	
}
