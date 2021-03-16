package managerLaborator;


public class ManagerLaborator {
	private String nume;
	private int nrClienti;
	private static ManagerLaborator manager=null;
	
	
	public String getNume() {
		return nume;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public int getNrClienti() {
		return nrClienti;
	}
	
	public void setNrClienti(int nrClienti) {
		this.nrClienti = nrClienti;
	}
	
	
	private ManagerLaborator(String nume, int nrClienti) {
		super();
		this.nume = nume;
		this.nrClienti = nrClienti;
	}
	
	private ManagerLaborator() {
		super();
		this.nume = "";
		this.nrClienti = 0;
	}
	
	@Override
	public String toString() {
		return "ManagerLaborator [nume=" + nume + ", nrClienti=" + nrClienti + "]";
	}
	
	public static ManagerLaborator getInstanta(String nume, int nrClienti) {
		if (manager == null) {
			manager = new ManagerLaborator(nume,nrClienti);
		}
		return manager;
	}
	
	public static ManagerLaborator getInstance() {
		return getInstanta("Ana",100);
	}
	
	

}
