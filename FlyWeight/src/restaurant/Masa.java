package restaurant;

import java.util.Date;

public class Masa {
	private int nrMasa;
	private int nrPersoane;
	private Date oraRezervare;
	public Masa(int nrMasa, int nrPersoane, Date oraRezervare) {
		super();
		this.nrMasa = nrMasa;
		this.nrPersoane = nrPersoane;
		this.oraRezervare = oraRezervare;
	}
	public int getNrMasa() {
		return nrMasa;
	}
	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}
	public int getNrPersoane() {
		return nrPersoane;
	}
	public void setNrPersoane(int nrPersoane) {
		this.nrPersoane = nrPersoane;
	}
	public Date getOraRezervare() {
		return oraRezervare;
	}
	public void setOraRezervare(Date oraRezervare) {
		this.oraRezervare = oraRezervare;
	}
	@Override
	public String toString() {
		return "Masa [nrMasa=" + nrMasa + ", nrPersoane=" + nrPersoane + ", oraRezervare=" + oraRezervare + "]";
	}
	
	
}
