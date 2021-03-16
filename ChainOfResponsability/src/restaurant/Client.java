package restaurant;

public class Client {
	
	private boolean doresteBautura;
	private boolean doresteServetele;
	private boolean doresteDebarasareMasa;
	public Client(boolean doresteBautura, boolean doresteServetele, boolean doresteDebarasareMasa) {
		super();
		this.doresteBautura = doresteBautura;
		this.doresteServetele = doresteServetele;
		this.doresteDebarasareMasa = doresteDebarasareMasa;
	}
	public boolean isDoresteBautura() {
		return doresteBautura;
	}
	public void setDoresteBautura(boolean doresteBautura) {
		this.doresteBautura = doresteBautura;
	}
	public boolean isDoresteServetele() {
		return doresteServetele;
	}
	public void setDoresteServetele(boolean doresteServetele) {
		this.doresteServetele = doresteServetele;
	}
	public boolean isDoresteDebarasareMasa() {
		return doresteDebarasareMasa;
	}
	public void setDoresteDebarasareMasa(boolean doresteDebarasareMasa) {
		this.doresteDebarasareMasa = doresteDebarasareMasa;
	}
	
	
	
	
}
