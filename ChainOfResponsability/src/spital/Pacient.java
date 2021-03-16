package spital;

public class Pacient {

	public boolean isBoalaUsoara() {
		return boalaUsoara;
	}
	public void setBoalaUsoara(boolean boalaUsoara) {
		this.boalaUsoara = boalaUsoara;
	}
	public boolean isBoalaMijlocie() {
		return boalaMijlocie;
	}
	public void setBoalaMijlocie(boolean boalaMijlocie) {
		this.boalaMijlocie = boalaMijlocie;
	}
	public boolean isBoalaGrava() {
		return boalaGrava;
	}
	public void setBoalaGrava(boolean boalaGrava) {
		this.boalaGrava = boalaGrava;
	}
	private boolean boalaUsoara;
	private boolean boalaMijlocie;
	private boolean boalaGrava;
	public Pacient(boolean boalaUsoara, boolean boalaMijlocie, boolean boalaGrava) {
		super();
		this.boalaUsoara = boalaUsoara;
		this.boalaMijlocie = boalaMijlocie;
		this.boalaGrava = boalaGrava;
	}
	
}
