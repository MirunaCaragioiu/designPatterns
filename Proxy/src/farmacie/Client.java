package farmacie;

public class Client {
	private String nume;
	private boolean areReteta;
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public boolean isAreReteta() {
		return areReteta;
	}
	public void setAreReteta(boolean areReteta) {
		this.areReteta = areReteta;
	}
	public Client(String nume, boolean areReteta) {
		super();
		this.nume = nume;
		this.areReteta = areReteta;
	}
	
	
}
