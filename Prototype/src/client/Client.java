package client;

public class Client implements IClient{
	
	private String nume;
	private int nrPuncteFidelitate;
	
	public Client(String nume, int nrPuncteFidelitate) {  //presupunem ca dureaza foarte mult
		super();
		this.nume = nume;
		this.nrPuncteFidelitate = nrPuncteFidelitate;
	}
	
	public Client() {  
		this.nume = "";
		this.nrPuncteFidelitate = 0;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getNrPuncteFidelitate() {
		return nrPuncteFidelitate;
	}

	public void setNrPuncteFidelitate(int nrPuncteFidelitate) {
		this.nrPuncteFidelitate = nrPuncteFidelitate;
	}

	@Override
	public IClient clonare() {
		//deep copy sau shallow copy
		Client client=new Client();
		client.setNume(this.nume);
		client.setNrPuncteFidelitate(this.nrPuncteFidelitate);
		return client;
	}

	@Override
	public String toString() {
		return "Client [nume=" + nume + ", nrPuncteFidelitate=" + nrPuncteFidelitate + "]";
	}
	
	

}
