package sportiv;

public class Client implements IClient {
     
	private String nume;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	@Override
	public void notificare(String mesaj) {
		System.out.println(this.nume+" ai primit mesajul: "+mesaj);
		
	}

	public Client(String nume) {
		super();
		this.nume = nume;
	}
	
 
}
