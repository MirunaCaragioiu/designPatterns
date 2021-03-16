package supa;

public abstract class AbstractSupa {
	
	private double pret;
	
	public AbstractSupa(double pret) {
		super();
		this.pret = pret;
	}

	public double getPret() {
		return pret;
	}
	
	public void setPret(double pret) {
		this.pret = pret;
	}

	public abstract void comandaSupa();

}
